package com.fenbi.codemart.dao.impl;

import java.util.List;

import com.fenbi.codemart.bean.RoleType;
import com.fenbi.codemart.dao.BaseDao;
import com.fenbi.codemart.dao.RoleTypeDao;

public class RoleTypeDaoImpl extends BaseDao<RoleType> implements RoleTypeDao {

	@Override
	public List<RoleType> selectRoleTypes() {
		String sql = "SELECT id,parent_Id parentId,name "
				+ " FROM role_type where parent_Id>0 ";
		return this.getBeanList(sql);
	}

	@Override
	public List<RoleType> selectRoleTypesByRoleTypeId(int roleTypeId) {
		String sql = "SELECT id,parent_id parentId,name"
				+ " FROM role_type "
				+ " WHERE parent_id = ?";
		return this.getBeanList(sql, roleTypeId);
	}

}
