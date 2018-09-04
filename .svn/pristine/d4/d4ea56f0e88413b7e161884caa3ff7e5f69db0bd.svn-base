package com.fenbi.codemart.servlet;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.alibaba.fastjson.JSON;
import com.fenbi.codemart.bean.City;
import com.fenbi.codemart.bean.County;
import com.fenbi.codemart.bean.Province;
import com.fenbi.codemart.service.AddressService;
import com.fenbi.codemart.service.impl.AddressServiceImpl;

public class AddressServlet extends BaseServlet {

	private static final long serialVersionUID = 1L;

	/**
	 * 处理获取所有省的请求
	 */
	public void getProvinces(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("application/json;charset=UTF-8");

		AddressService addressService = new AddressServiceImpl();
		List<Province> provinces = addressService.getProvinces();

		HashMap<String, Object> hashmap = new HashMap<String, Object>();
		hashmap.put("code", 1);
		hashmap.put("provinces", provinces);
		hashmap.put("msg", "获取所有省成功!");

		String jsonStr = JSON.toJSONString(hashmap);

		response.getWriter().print(jsonStr);
	}

	/**
	 * 处理根据省的id获取所有的城市的请求
	 */
	public void getCitysByProvinceId(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("application/json;charset=UTF-8");

		// 获取省的id
		String provinceId = request.getParameter("provinceId");

		AddressService addressService = new AddressServiceImpl();
		List<City> citys = addressService.getCitysByProvinceId(provinceId);

		HashMap<String, Object> hashmap = new HashMap<String, Object>();
		hashmap.put("code", 1);
		hashmap.put("citys", citys);
		hashmap.put("msg", "获取所有城市成功!");

		String jsonStr = JSON.toJSONString(hashmap);

		response.getWriter().print(jsonStr);
	}

	/**
	 * 处理根据城市的id获取所有的区县的请求
	 */
	public void getCountysByCityId(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("application/json;charset=UTF-8");

		// 获取城市的id
		String cityId = request.getParameter("cityId");

		AddressService addressService = new AddressServiceImpl();
		List<County> countys = addressService.getCountysByCityId(cityId);

		HashMap<String, Object> hashmap = new HashMap<String, Object>();
		hashmap.put("code", 1);
		hashmap.put("countys", countys);
		hashmap.put("msg", "获取所有区县成功!");

		String jsonStr = JSON.toJSONString(hashmap);

		response.getWriter().print(jsonStr);
	}

}
