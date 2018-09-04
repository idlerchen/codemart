package com.fenbi.codemart.utils;

import java.lang.reflect.InvocationTargetException;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.beanutils.BeanUtils;
/**
 * @version:p_d2 
* @Description: 定义公共的方法，接收页面请求参数，转化为Javabean。
* 传入对象，方法根据将接受的参数封装成该对象
* 接收时，Javabean不知道类型要定义为泛型接收，调用时接收这个类型返回这个类型
* @author: cgq  
* @date: 2018年8月6日 下午4:44:45
 */
public class WEButils {
	
	public static <T> T param2Bean(HttpServletRequest request, T t) {
		Map<String, String[]> paramMap = request.getParameterMap();
		try {
			BeanUtils.populate(t, paramMap);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return t;
		
	}

}
