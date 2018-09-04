package com.fenbi.codemart.dao.impl;

import java.util.List;

import com.fenbi.codemart.bean.ApplyStatus;
import com.fenbi.codemart.dao.ApplyStatusDao;
import com.fenbi.codemart.dao.BaseDao;

public class ApplyStatusDaoImpl extends BaseDao<ApplyStatus> implements ApplyStatusDao {

	@Override
	public List<ApplyStatus> selectApplyStatus() {
		String sql = "SELECT id,name"
				+ " FROM apply_status"
				+ " WHERE id < 4";
		return this.getBeanList(sql);
	}

	@Override
	public ApplyStatus selectApplyStatusByApplyStatusId(int applyStatusId) {
		String sql = "SELECT id,name"
				+ " FROM apply_status"
				+ " WHERE id = ?";
		return this.getBean(sql, applyStatusId);
	}

	@Override
	public List<ApplyStatus> getApplyStatus() {
		String sql = "SELECT id,name"
				+ " FROM apply_status";
		return this.getBeanList(sql);
	}

}
