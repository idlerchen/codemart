package com.fenbi.codemart.dao;

import java.util.List;

import com.fenbi.codemart.bean.RoleType;

public interface RoleTypeDao {
	
	/**
	 * 查询所有的角色类型
	 * @return 所有角色类型的List集合
	 */
	public List<RoleType> selectRoleTypes();
	
	/**
	 * 根据父角色类型id查询所有的子角色类型
	 * @param roleTypeId 父角色类型id
	 * @return 所有子角色类型的List集合
	 */
	public List<RoleType> selectRoleTypesByRoleTypeId(int roleTypeId);

}
