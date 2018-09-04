package com.fenbi.codemart.test;

import java.util.List;

import org.junit.Test;

import com.fenbi.codemart.bean.County;
import com.fenbi.codemart.dao.CountyDao;
import com.fenbi.codemart.dao.impl.CountyDaoImpl;

public class TestCountyDao {

	CountyDao countyDao = new CountyDaoImpl();

	@Test
	public void testSelectCountysByCityId() {

		List<County> coutnyList = countyDao.selectCountysByCityId("320100");
		for (County county : coutnyList) {
			System.out.println(county);
		}
	}

}
