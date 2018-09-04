package com.fenbi.codemart.utils;

import java.io.IOException;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Properties;
/**
 * @version: p_d1
* @Description: 用户注册密码加密工具类，登录时同样加密从数据库得到加密后的密码
* @author: cgq  
* @date: 2018年8月4日 下午10:06:21
 */
public class MD5Utils {
	
	
	private static String salt;
	
	static {
		Properties p = new Properties();
		try {
			p.load(MD5Utils.class.getClassLoader()
				.getResourceAsStream("common.properties"));
			salt = p.getProperty("salt");
		} catch (IOException e) {
			e.printStackTrace();
			throw new RuntimeException("加载参数失败");
		}
	}

	
	/**
	 * 使用md5的算法进行加密
	 */
	public static String md5(String plainText) {
		
		plainText += salt;
		
		byte[] secretBytes = null;
		try {
			secretBytes = MessageDigest.getInstance("md5").digest(
					plainText.getBytes());
		} catch (NoSuchAlgorithmException e) {
			throw new RuntimeException("没有md5这个算法！");
		}
		String md5code = new BigInteger(1, secretBytes).toString(16);// 16进制数字
		// 如果生成数字未满32位，需要前面补0
		for (int i = 0; i < 32 - md5code.length(); i++) {
			md5code = "0" + md5code;
		}
		return md5code;
	}
	
//	public static void main(String[] args) {
//		System.out.println(md5("123456"));
//	}
}

