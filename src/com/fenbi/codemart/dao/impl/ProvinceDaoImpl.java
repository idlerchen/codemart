package com.fenbi.codemart.dao.impl;

import java.util.List;

import com.fenbi.codemart.bean.Province;
import com.fenbi.codemart.dao.BaseDao;
import com.fenbi.codemart.dao.ProvinceDao;

public class ProvinceDaoImpl extends BaseDao<Province> implements ProvinceDao {

	@Override
	public List<Province> selectProvinces() {
		String sql = "SELECT id,name"
				+ " FROM province";
		return this.getBeanList(sql);
	}

}
