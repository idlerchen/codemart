package com.fenbi.codemart.dao.impl;

import com.fenbi.codemart.bean.Developer;
import com.fenbi.codemart.dao.BaseDao;
import com.fenbi.codemart.dao.DeveloperDao;

public class DeveloperDaoImpl extends BaseDao<Developer> implements DeveloperDao {

	@Override
	public int createDeveloper(Developer developer) {
		String sql = "INSERT INTO developer(userid,role,work_status,create_time)"
				+ " VALUES(?,?,?,NOW())";
		return this.update(sql, developer.getUserid(), developer.getRole(), developer.getWorkStatus());
	}

	@Override
	public Developer selectDeveloperByUserId(int userId) {
		String sql = "SELECT id,userid,role,work_status workStatus,create_time createTime "
				+ " FROM developer"
				+ " WHERE userid = ?";
		return this.getBean(sql, userId);
	}

	@Override
	public int updateRoleByUserId(String role, int userId) {
		String sql = "UPDATE developer"
				+ " SET role = ?"
				+ " WHERE userid = ?";
		return this.update(sql, role, userId);
	}

	@Override
	public int updateWorkStatusByUserId(String workStatus, int userId) {
		String sql = "UPDATE developer"
				+ " SET work_status = ?"
				+ " WHERE userid = ?";
		return this.update(sql, workStatus, userId);
	}
	
	@Override
	public Developer selectDeveloperById(int id) {
		String sql = "SELECT id,userid,role,work_status workStatus,create_time createTime "
				+ " FROM developer"
				+ " WHERE id = ?";
		return this.getBean(sql, id);
	}

	@Override
	public int getAllDeveloper() {
		String sql = "SELECT COUNT(*) FROM developer";
		long allDeveloper = (Long) this.getObject(sql);
		return (int)allDeveloper;
	}

}
