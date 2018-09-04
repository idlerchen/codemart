package com.fenbi.codemart.service;

import java.util.List;

import com.fenbi.codemart.bean.City;
import com.fenbi.codemart.bean.County;
import com.fenbi.codemart.bean.Province;

/**
 * 处理跟地址相关的业务逻辑
 *
 */
public interface AddressService {
	
	/**
	 * 处理获取所有省的业务逻辑
	 * @return 所有省的List集合
	 */
	public List<Province> getProvinces();
	
	/**
	 * 处理根据省的id获取所有城市的业务逻辑
	 * @param provinceId 省的id
	 * @return 该省的所有城市的List集合
	 */
	public List<City> getCitysByProvinceId(String provinceId);
	
	/**
	 * 处理根据城市id获取所有区县的业务逻辑
	 * @param cityId 城市id
	 * @return 该城市的所有区县的List集合
	 */
	public List<County> getCountysByCityId(String cityId);
	
}
