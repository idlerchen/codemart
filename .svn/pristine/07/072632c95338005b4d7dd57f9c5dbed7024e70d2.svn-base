package com.fenbi.codemart.dao.impl;

import java.util.List;

import com.fenbi.codemart.bean.Industry;
import com.fenbi.codemart.dao.BaseDao;
import com.fenbi.codemart.dao.IndustryDao;

public class IndustryDaoImpl extends BaseDao<Industry> implements IndustryDao {

	@Override
	public List<Industry> selectIndustrys() {
		String sql = "SELECT id,name"
				+ " FROM industry";
		return this.getBeanList(sql);
	}

	@Override
	public Industry selectIndustryById(String id) {
		String sql = "SELECT id,name"
				+ " FROM industry"
				+ " WHERE id = ?";
		return this.getBean(sql, id);
	}

}
