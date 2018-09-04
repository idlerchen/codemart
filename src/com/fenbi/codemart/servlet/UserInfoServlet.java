package com.fenbi.codemart.servlet;

import java.io.IOException;
import java.util.HashMap;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.fenbi.codemart.bean.User;
import com.fenbi.codemart.service.UserService;
import com.fenbi.codemart.service.impl.UserServiceImpl;
import com.fenbi.codemart.utils.WEButils;
import com.google.gson.Gson;

/**
 * 用户个人信息相关的Servlet
 * 
 */
public class UserInfoServlet extends BaseServlet {

	private static final long serialVersionUID = 1L;

	/**
	 * 更新用户信息
	 * 
	 * @param request
	 * @param response
	 * @throws IOException
	 * @throws ServletException
	 */
	public void updateUser(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {
		User user = WEButils.param2Bean(request, new User());
		User loginUser = (User) request.getSession().getAttribute("loginUser");
		user.setUsername(loginUser.getUsername());

		UserService usi = new UserServiceImpl();
		boolean flag = usi.updateUserByUserinfo(user);
		// System.out.println(flag);
		if (flag) {
			request.getRequestDispatcher("UserInfoServlet?way=getUser").forward(request, response);
		}

	}

	/**
	 * 根据用户名获取用户信息
	 * 
	 * @param request
	 * @param response
	 * @throws IOException
	 * @throws ServletException
	 */
	public void getUser(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		// 获取AJAX发送过来的请求参数
		User loginUser = (User) request.getSession().getAttribute("loginUser");

		// 根据用户名获取用户信息
		UserService usi = new UserServiceImpl();
		User user = usi.getUserByUsername(loginUser.getUsername());

		if (user != null) {
			request.setAttribute("user", user);
			request.getRequestDispatcher("/page/userinfo/userInfo.jsp").forward(request, response);
		} else {
			response.sendRedirect(request.getContextPath() + "/page/user/login.jsp");
		}
	}

	/**
	 * 更新邮箱地址
	 * 
	 * @param request
	 * @param response
	 * @throws IOException
	 * @throws ServletException
	 */
	public void updateUseremail(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {
		User loginUser = (User) request.getSession().getAttribute("loginUser");
		String mail = request.getParameter("email");

		UserService usi = new UserServiceImpl();
		boolean flag = usi.updateEmailByUserId(mail, loginUser.getId());

		if (!flag) {
			// 解决请求json乱码
			response.setContentType("application/json;charset=utf-8");
			Gson gson = new Gson();
			HashMap<String, Object> map = new HashMap<>();
			map.put("msg", "邮箱修改失败！请稍后重试");
			String jsonStr = gson.toJson(map);
			response.getWriter().print(jsonStr);
		}else {
			response.setContentType("application/json;charset=utf-8");
			Gson gson = new Gson();
			HashMap<String, Object> map = new HashMap<>();
			map.put("msg", "yes");
			String jsonStr = gson.toJson(map);
			response.getWriter().print(jsonStr);
		}
	}

	/**
	 * 更新手机号码
	 * 
	 * @param request
	 * @param response
	 * @throws IOException
	 * @throws ServletException
	 */
	public void updateUserphone(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {
		User loginUser = (User) request.getSession().getAttribute("loginUser");
		String telephone = request.getParameter("telephone");

		UserService usi = new UserServiceImpl();
		boolean flag = usi.updateTelephoneByUserId(telephone, loginUser.getId());

		if (!flag) {
			// 解决请求json乱码
			response.setContentType("application/json;charset=utf-8");
			Gson gson = new Gson();
			HashMap<String, Object> map = new HashMap<>();
			map.put("msg", "手机号修改失败！请稍后重试");
			String jsonStr = gson.toJson(map);
			response.getWriter().print(jsonStr);
		}else {
			response.setContentType("application/json;charset=utf-8");
			Gson gson = new Gson();
			HashMap<String, Object> map = new HashMap<>();
			map.put("msg", "yes");
			String jsonStr = gson.toJson(map);
			response.getWriter().print(jsonStr);
		}
	}
}
