package com.fenbi.codemart.service;

import java.util.List;

import com.fenbi.codemart.bean.Industry;

/**
 * 处理行业相关的业务逻辑
 *
 */
public interface IndustryService {
	
	/**
	 * 处理获取所有行业的业务逻辑
	 * @return 所有行业的List结合
	 */
	public List<Industry> getIndustrys();
	
	/**
	 * 处理根据行业id获取行业信息的业务逻辑
	 * @param id 行业id
	 * @return 对应的行业信息
	 */
	public Industry getIndustryById(String id);

}
