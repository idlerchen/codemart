package com.fenbi.codemart.servlet;

import java.io.IOException;
import java.util.HashMap;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.fenbi.codemart.dao.DeveloperDao;
import com.fenbi.codemart.dao.ItemDao;
import com.fenbi.codemart.dao.impl.DeveloperDaoImpl;
import com.fenbi.codemart.dao.impl.ItemDaoImpl;
import com.google.gson.Gson;

/**
 * 统计网站相关数据的Servlet
 * 
 */
public class StatisticServlet extends BaseServlet {

	private static final long serialVersionUID = 1L;

	/**
	 * 统计全站的项目总金额/项目数/已注册的开发者数
	 * 
	 * @param request
	 * @param response
	 * @throws ServletException
	 * @throws IOException
	 */
	public void getSum(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("application/json;charset=utf-8");

		ItemDao id = new ItemDaoImpl();
		DeveloperDao dd = new DeveloperDaoImpl();
		int allItems = id.getAllItems();
		System.out.println(allItems);
		int allMoney = id.getAllMoney();
		int allDeveloper = dd.getAllDeveloper();
//		System.out.println(allItems+"-"+allMoney+"-"+allDeveloper);

		HashMap<String, Object> map = new HashMap<>();
		map.put("money", allMoney);
		map.put("items", allItems);
		map.put("developers", allDeveloper);

		// 将map属性集，转换成gson字符串并发送给ajax
		Gson gson = new Gson();
		String jsonStr = gson.toJson(map);
		response.getWriter().print(jsonStr);
	}

}
