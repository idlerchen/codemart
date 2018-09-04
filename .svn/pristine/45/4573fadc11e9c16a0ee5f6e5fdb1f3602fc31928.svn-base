package com.fenbi.codemart.dao.impl;

import java.util.List;

import com.fenbi.codemart.bean.City;
import com.fenbi.codemart.dao.BaseDao;
import com.fenbi.codemart.dao.CityDao;

public class CityDaoImpl extends BaseDao<City> implements CityDao {

	@Override
	public List<City> selectCitysByProvinceId(String provinceId) {
		String sql = "SELECT id,name,province_id provinceId"
				+ " FROM city"
				+ " WHERE province_id = ?";
		return this.getBeanList(sql, provinceId);
	}

}
