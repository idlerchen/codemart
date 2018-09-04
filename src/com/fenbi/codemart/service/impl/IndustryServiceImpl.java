package com.fenbi.codemart.service.impl;

import java.util.List;

import com.fenbi.codemart.bean.Industry;
import com.fenbi.codemart.dao.IndustryDao;
import com.fenbi.codemart.dao.impl.IndustryDaoImpl;
import com.fenbi.codemart.service.IndustryService;

public class IndustryServiceImpl implements IndustryService {

	IndustryDao industryDao = new IndustryDaoImpl();

	@Override
	public List<Industry> getIndustrys() {
		return industryDao.selectIndustrys();
	}

	@Override
	public Industry getIndustryById(String id) {
		return industryDao.selectIndustryById(id);
	}

}
