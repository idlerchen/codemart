package com.fenbi.codemart.dao.impl;

import java.util.List;

import com.fenbi.codemart.bean.County;
import com.fenbi.codemart.dao.BaseDao;
import com.fenbi.codemart.dao.CountyDao;

public class CountyDaoImpl extends BaseDao<County> implements CountyDao {

	@Override
	public List<County> selectCountysByCityId(String cityId) {
		String sql="SELECT id,name,city_id cityId"
				+ " FROM county"
				+ " WHERE city_id = ?";
		return this.getBeanList(sql, cityId);
	}

}
