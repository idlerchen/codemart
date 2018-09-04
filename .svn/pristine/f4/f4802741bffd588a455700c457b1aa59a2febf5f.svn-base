package com.fenbi.codemart.utils;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mchange.v2.c3p0.ComboPooledDataSource;
/**
 * @version: p_d1
* @Description: 数据库连接工具类
* @author: cgq  
* @date: 2018年8月4日 下午10:05:59
 */
public class DButils {

	public static ComboPooledDataSource ds = new ComboPooledDataSource();
	
	//获取数据源的方法，dao中使用
	public static ComboPooledDataSource getDs() {
		return ds;
	}


	/**
	 * 获取数据库连接的方法
	 * @return
	 * @throws SQLException 
	 */
	public static Connection getConnection() throws SQLException {
		
		return ds.getConnection();
	}
	
	//调用无参连接时会手动连接并关闭，其他对象会在底层关闭不需要重复。
	public static void closeAll(Connection conn) {
		if(conn != null) {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
	}
	
//	public static void main(String[] args) throws SQLException {
//		Connection conn = getConnection();
//		System.out.println(conn);
//	}
}
