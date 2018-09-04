package com.fenbi.codemart.dao;

import com.fenbi.codemart.bean.User;

/**
 * 操作user表的Dao
 *
 */
public interface UserDao {
	
	/**
	 * 将一个用户的信息存入数据库
	 * @param user 用户对象
	 * @return 返回存入数据库的信息条数
	 */
	public int createUser(User user);
	
	/**
	 * 根据用户名和密码查询用户信息
	 * @param username 用户名
	 * @param password 密码
	 * @return 返回查询到的用户对象
	 */
	public User selectUserByUsernameAndPassword(String username, String password);
	
	/**
	 * 根据手机号码和密码查询用户信息
	 * @param telephone
	 * @param password
	 * @return 返回查询到的用户对象
	 */
	public User selectUserByTelephoneAndPassword(String telephone, String password);
	
	/**
	 * 根据Email邮箱和密码查询用户信息
	 * @param email
	 * @param password
	 * @return 返回查询到的用户对象
	 */
	public User selectUserByEmailAndPassword(String email, String password);
	
	/**
	 * 根据用户id查询用户信息
	 * @param userId 用户id
	 * @return 返回查询到的用户对象
	 */
	public User selectUserByUserId(int userId);
	
	/**
	 * 根据用户名查询用户信息
	 * @param username 用户名
	 * @return 返回查询到的用户对象
	 */
	public User selectUserByUsername(String username);
	
	/**
	 * 根据手机号码查询用户信息
	 * @param telephone 手机号码
	 * @return 返回查询到的用户对象
	 */
	public User selectUserByTelephone(String telephone);
	
	/**
	 * 根据Email邮箱查询用户信息
	 * @param email Email邮箱
	 * @return 返回查询到的用户对象
	 */
	public User selectUserByEmail(String email);
	
	/**
	 * 将更新后的用户信息存入数据库
	 * @param user 已更新用户信息的用户对象
	 * @return 返回存入数据库的信息条数
	 */
	public int updateUserByUserinfo(User user);
	
	/**
	 * 将更新后的用户Email信息存入数据库
	 * @param userId 用户id
	 * @return 返回存入数据库的信息条数
	 */
	public int updateEmailByUserId(String email, int userId);
	
	/**
	 * 将更新后的用户手机号码信息存入数据库
	 * @param userId 用户id
	 * @return 返回存入数据库的信息条数
	 */
	public int updateTelephoneByUserId(String telephone, int userId); 

}
