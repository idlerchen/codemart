package com.fenbi.codemart.test;

import java.util.List;

import org.junit.Test;

import com.fenbi.codemart.bean.City;
import com.fenbi.codemart.dao.CityDao;
import com.fenbi.codemart.dao.impl.CityDaoImpl;

public class TestCity {

	@Test
	public void tearDown() throws Exception {
	}

	@Test
	public void testGetCity() {
		CityDao dao = new CityDaoImpl();
		List<City> city = dao.selectCitysByProvinceId("230000");
		for(City c:city) {
			System.out.println(c);
		}
	}

}
