package com.fenbi.codemart.service.impl;

import java.util.List;

import com.fenbi.codemart.bean.RoleType;
import com.fenbi.codemart.dao.RoleTypeDao;
import com.fenbi.codemart.dao.impl.RoleTypeDaoImpl;
import com.fenbi.codemart.service.RoleTypeService;

public class RoleTypeServiceImpl implements RoleTypeService {

	RoleTypeDao roleTypeDao = new RoleTypeDaoImpl();
	
	@Override
	public List<RoleType> getRoleTypes() {
		return roleTypeDao.selectRoleTypes();
	}

	@Override
	public List<RoleType> getRoleTypesByRoleTypeId(int roleTypeId) {
		return roleTypeDao.selectRoleTypesByRoleTypeId(roleTypeId);
	}

}
