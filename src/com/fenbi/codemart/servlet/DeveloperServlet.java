package com.fenbi.codemart.servlet;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.alibaba.fastjson.JSON;
import com.fenbi.codemart.bean.Developer;
import com.fenbi.codemart.bean.RoleType;
import com.fenbi.codemart.bean.User;
import com.fenbi.codemart.service.DeveloperService;
import com.fenbi.codemart.service.RoleTypeService;
import com.fenbi.codemart.service.impl.DeveloperServiceImpl;
import com.fenbi.codemart.service.impl.RoleTypeServiceImpl;

public class DeveloperServlet extends BaseServlet {
	private static final long serialVersionUID = 1L;

	public void saveDeveloper(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		User user = (User) request.getSession().getAttribute("loginUser");
		
		String[] parameterValues = request.getParameterValues("role");
		String role = "";
		for (int i = 0; i < parameterValues.length; i++) {
			role = role + parameterValues[i];
			if (i != parameterValues.length - 1) {
				role = role + ",";
			}
		}
		
		String parameter = request.getParameter("acceptNewRewardAllNotification");
		String workStatus = "4";
		if("true".equals(parameter)) {
			workStatus = request.getParameter("workStatus");
		}
		
		DeveloperService developerService = new DeveloperServiceImpl();
		Developer isdeveloper = developerService.getDeveloperByUserId(user.getId());
		
		if(isdeveloper == null) {
			developerService.createDeveloper(new Developer(user.getId(),role,workStatus));
		}else {
			System.out.println(role+"--"+workStatus);
			developerService.updateRoleByUserId(role, user.getId());
			developerService.updateWorkStatusByUserId(workStatus, user.getId());
		}
		request.getRequestDispatcher("/page/userinfo/demanderSkills.jsp").forward(request, response);;
	}
	
	public void getDeveloper(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		response.setContentType("application/json;charset=UTF-8");
		
		User user = (User) request.getSession().getAttribute("loginUser");
		
		DeveloperService developerService = new DeveloperServiceImpl();
		Developer developer = developerService.getDeveloperByUserId(user.getId());
		
		if(developer != null) {
			
			String role = developer.getRole();
			String workStatus = developer.getWorkStatus();
			String[] roles = role.split(",");
			
			HashMap<String, Object> hashmap = new HashMap<String, Object>();
			hashmap.put("code", 1);
			hashmap.put("roles", roles);
			hashmap.put("workStatus", workStatus);
			
			String jsonStr = JSON.toJSONString(hashmap);
			
			response.getWriter().print(jsonStr);
		}else {
			HashMap<String, Object> hashmap = new HashMap<String, Object>();
			hashmap.put("code", 0);
			hashmap.put("msg", "获取失败");
			
			String jsonStr = JSON.toJSONString(hashmap);
			
			response.getWriter().print(jsonStr);
		}
		
	}
	
	public void getRoleTypes(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		response.setContentType("application/json;charset=UTF-8");
		
		RoleTypeService roleTypeService = new RoleTypeServiceImpl();
		List<RoleType> roleTypes = roleTypeService.getRoleTypes();
		
		if(roleTypes != null) {
			HashMap<String, Object> hashmap = new HashMap<String, Object>();
			hashmap.put("roleTypes", roleTypes);
			
			String jsonStr = JSON.toJSONString(hashmap);
			
			response.getWriter().print(jsonStr);
		}else {
			HashMap<String, Object> hashmap = new HashMap<String, Object>();
			hashmap.put("msg", "获取失败");
			
			String jsonStr = JSON.toJSONString(hashmap);
			
			response.getWriter().print(jsonStr);
		}
		
	}
}
