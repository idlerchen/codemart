package com.fenbi.codemart.dao;

import com.fenbi.codemart.bean.Developer;

/**
 * 操作developer表的Dao
 *
 */
public interface DeveloperDao {
	
	/**
	 * 创建一条开发者记录并存入数据库
	 * @param developer 包含开发者记录信息的开发者记录对象
	 * @return 返回存入数据库的信息条数
	 */
	public int createDeveloper(Developer developer);
	
	/**
	 * 根据用户id查询开发者记录信息
	 * @param userId 用户id
	 * @return 返回该用户对应的开发者记录信息
	 */
	public Developer selectDeveloperByUserId(int userId);
	
	/**
	 * 根据用户id更新该开发者的角色信息
	 * @param role 更新后的角色信息
	 * @param userId 用户id
	 * @return 返回已修改的信息条数
	 */
	public int updateRoleByUserId(String role, int userId);
	
	/**
	 * 根据用户id更新该开发者的时间状态信息
	 * @param workStatus 更新后的时间状态信息
	 * @param userId 用户id
	 * @return 返回已修改的信息条数
	 */
	public int updateWorkStatusByUserId(String workStatus, int userId);

	Developer selectDeveloperById(int id);
	
	public int getAllDeveloper();
}
