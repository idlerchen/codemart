package com.fenbi.codemart.dao;

import java.util.List;

import com.fenbi.codemart.bean.Industry;

public interface IndustryDao {
	
	/**
	 * 查询所有的行业信息
	 * @return 所有行业的List集合
	 */
	public List<Industry> selectIndustrys();
	
	/**
	 * 根据行业id查询对应的行业信息
	 * @param id 行业id
	 * @return 行业id对应的行业信息
	 */
	public Industry selectIndustryById(String id);

}
