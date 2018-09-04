package com.fenbi.codemart.service.impl;

import java.util.List;

import com.fenbi.codemart.bean.Developer;
import com.fenbi.codemart.bean.DeveloperCase;
import com.fenbi.codemart.dao.DeveloperCaseDao;
import com.fenbi.codemart.dao.DeveloperDao;
import com.fenbi.codemart.dao.impl.DeveloperCaseDaoImpl;
import com.fenbi.codemart.dao.impl.DeveloperDaoImpl;
import com.fenbi.codemart.service.DeveloperService;

public class DeveloperServiceImpl implements DeveloperService {

	DeveloperDao developerDao = new DeveloperDaoImpl();
	DeveloperCaseDao developerCaseDao = new DeveloperCaseDaoImpl();
	
	@Override
	public boolean createDeveloper(Developer developer) {
		return developerDao.createDeveloper(developer) > 0;
	}

	@Override
	public Developer getDeveloperByUserId(int userId) {
		Developer developer = developerDao.selectDeveloperByUserId(userId);
		
//		List<DeveloperCase> developerCaseList = developerCaseDao.selectDeveloperCaseByDeveloperId(developer.getId());
//		developer.setDeveloperCaseList(developerCaseList);
		
		return developer;
	}

	@Override
	public boolean createDeveloperCase(DeveloperCase developerCase) {
		return developerCaseDao.createDeveloperCase(developerCase) > 0;
	}

	@Override
	public boolean updateRoleByUserId(String role, int userId) {
		return developerDao.updateRoleByUserId(role, userId) > 0;
	}

	@Override
	public boolean updateWorkStatusByUserId(String workStatus, int userId) {
		return developerDao.updateWorkStatusByUserId(workStatus, userId) > 0;
	}

	@Override
	public int updateDeveloperCase(DeveloperCase developerCase) {
		return developerCaseDao.updateDeveloperCase(developerCase);
	}

	@Override
	public Developer selectDeveloperById(int id) {
		
		return developerDao.selectDeveloperById(id);
	}

}
