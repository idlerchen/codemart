package com.fenbi.codemart.test;

import java.util.List;

import org.junit.Test;

import com.fenbi.codemart.bean.Province;
import com.fenbi.codemart.dao.ProvinceDao;
import com.fenbi.codemart.dao.impl.ProvinceDaoImpl;

public class TestProvince {

	ProvinceDao provinceDao = new ProvinceDaoImpl();

	@Test
	public void testGetCity() {

		List<Province> provinceList = provinceDao.selectProvinces();
		for (Province province : provinceList) {
			System.out.println(province);
		}

	}

}
