package com.fenbi.codemart.test;

import java.util.List;

import org.junit.Test;

import com.fenbi.codemart.bean.City;
import com.fenbi.codemart.dao.CityDao;
import com.fenbi.codemart.dao.impl.CityDaoImpl;

public class TestCityDao {
	
	CityDao cityDao = new CityDaoImpl();

	@Test
	public void testSelectCitysByProvinceId() {
		
		List<City> cityList = cityDao.selectCitysByProvinceId("320000");
		for(City city:cityList) {
			System.out.println(city);
		}
		
	}

}
