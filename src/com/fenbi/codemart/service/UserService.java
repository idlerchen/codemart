package com.fenbi.codemart.service;

import com.fenbi.codemart.bean.User;

public interface UserService {
	
	/**
	 * 处理用户注册的业务逻辑
	 * @param user 用户对象
	 * @return 注册是否成功(true表示注册成功，false表示注册失败)
	 */
	public boolean createUser(User user);
	
	/**
	 * 处理用户登陆的业务逻辑
	 * @param username 用户名
	 * @param password 密码
	 * @return 登陆成功后返回用户对象，不成功后返回null
	 */
	public User getUserByUsernameAndPassword(String username, String password);
	
	/**
	 * 处理用户登陆的业务逻辑
	 * @param telephone 手机号码
	 * @param password 密码
	 * @return 登陆成功后返回用户对象，不成功后返回null
	 */
	public User getUserByTelephoneAndPassword(String telephone, String password);
	
	/**
	 * 处理用户登陆的业务逻辑
	 * @param email Email邮箱
	 * @param password 密码
	 * @return 登陆成功后返回用户对象，不成功后返回null
	 */
	public User getUserByEmailAndPassword(String email, String password);
	
	/**
	 * 处理检查用户名的业务逻辑
	 * @param username 用户名
	 * @return 用户名是否已存在(true表示不存在，false表示已存在)
	 */
	public boolean checkUsername(String username);
	
	/**
	 * 处理检查手机号码的业务逻辑
	 * @param telephone
	 * @return 手机号码是否已存在(true表示不存在，false表示已存在)
	 */
	public boolean checkTelephone(String telephone);
	
	/**
	 * 处理检查Email邮箱的业务逻辑
	 * @param email Email邮箱
	 * @return Email邮箱是否已存在(true表示不存在，false表示已存在)
	 */
	public boolean checkEmail(String email);
	
	/**
	 * 处理用户更新用户信息的业务逻辑
	 * @param user 包含已更新用户信息的用户对象
	 * @return 更新信息是否成功(true表示更新成功，false表示更新失败)
	 */
	public boolean updateUserByUserinfo(User user);
	
	/**
	 * 处理根据用户id获取用户信息的业务逻辑
	 * @param userId 用户id
	 * @return 包含该用户所有信息的用户对象
	 */
	public User getUserByUserId(int userId);
	
	/**
	 * 处理根据用户名获取用户信息的业务逻辑
	 * @param username 用户名
	 * @return 包含该用户所有信息的用户对象
	 */
	public User getUserByUsername(String username);
	
	/**
	 * 处理用户更新Email邮箱信息的业务逻辑
	 * @param email Email邮箱
	 * @param userId 用户id
	 * @return 更新信息是否成功(true表示更新成功，false表示更新失败)
	 */
	public boolean updateEmailByUserId(String email, int userId);
	
	/**
	 * 处理用户更新电话号码信息的业务逻辑
	 * @param telephone 电话号码
	 * @param userId 用户id
	 * @return 更新信息是否成功(true表示更新成功，false表示更新失败)
	 */
	public boolean updateTelephoneByUserId(String telephone, int userId);

}
