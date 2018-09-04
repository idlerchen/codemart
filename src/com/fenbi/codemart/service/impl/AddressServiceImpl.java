package com.fenbi.codemart.service.impl;

import java.util.List;

import com.fenbi.codemart.bean.City;
import com.fenbi.codemart.bean.County;
import com.fenbi.codemart.bean.Province;
import com.fenbi.codemart.dao.CityDao;
import com.fenbi.codemart.dao.CountyDao;
import com.fenbi.codemart.dao.ProvinceDao;
import com.fenbi.codemart.dao.impl.CityDaoImpl;
import com.fenbi.codemart.dao.impl.CountyDaoImpl;
import com.fenbi.codemart.dao.impl.ProvinceDaoImpl;
import com.fenbi.codemart.service.AddressService;

public class AddressServiceImpl implements AddressService{
	
	ProvinceDao provinceDao = new ProvinceDaoImpl();
	CityDao cityDao = new CityDaoImpl();
	CountyDao countyDao = new CountyDaoImpl();
	
	@Override
	public List<Province> getProvinces() {
		
		return provinceDao.selectProvinces();
		
	}

	@Override
	public List<City> getCitysByProvinceId(String provinceId) {
		
		return cityDao.selectCitysByProvinceId(provinceId);
		
	}

	@Override
	public List<County> getCountysByCityId(String cityId) {
		
		return countyDao.selectCountysByCityId(cityId);
		
	}

}
