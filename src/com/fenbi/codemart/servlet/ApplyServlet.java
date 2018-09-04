package com.fenbi.codemart.servlet;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.alibaba.fastjson.JSON;
import com.fenbi.codemart.bean.Apply;
import com.fenbi.codemart.bean.Developer;
import com.fenbi.codemart.bean.User;
import com.fenbi.codemart.service.ApplyService;
import com.fenbi.codemart.service.DeveloperService;
import com.fenbi.codemart.service.ItemService;
import com.fenbi.codemart.service.impl.ApplyServiceImpl;
import com.fenbi.codemart.service.impl.DeveloperServiceImpl;
import com.fenbi.codemart.service.impl.ItemServiceImpl;
import com.google.gson.Gson;

public class ApplyServlet extends BaseServlet {

	private static final long serialVersionUID = 1L;

	public void saveApply(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		User user = (User) request.getSession().getAttribute("loginUser");
		int itemid = Integer.valueOf(request.getParameter("itemid"));
		DeveloperService ds = new DeveloperServiceImpl();
		ItemService is = new ItemServiceImpl();
		ApplyService as = new ApplyServiceImpl();
		int developerId = ds.getDeveloperByUserId(user.getId()).getId();
		
		boolean createApply = as.createApply(new Apply(itemid,developerId,1));
		
		if(createApply) {//如果创建申请记录成功，项目报名人数+1，跳转到我参与的项目
			is.addApplicantNumByItemId(itemid);
			request.getRequestDispatcher("ApplyServlet?way=getMyApply").forward(request, response);
		}
		
	}
	
	
	public void getMyApply(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		User user = (User) request.getSession().getAttribute("loginUser");
		DeveloperService ds = new DeveloperServiceImpl();
		ApplyService as = new ApplyServiceImpl();
		System.out.println(user.getId());
		Developer developer= ds.getDeveloperByUserId(user.getId());
		
		if(developer != null) {
			int developerId = developer.getId();
			List<Apply> myApply = as.getApplysByDeveloperId(developerId);
			request.setAttribute("myApplys", myApply);
			request.getRequestDispatcher("/page/myitem/myJointProjects.jsp").forward(request, response);
		}else {
			request.setAttribute("msg", "1");
			request.getRequestDispatcher("/page/userinfo/demanderSkills.jsp").forward(request, response);
		}
		
	}
	
	public void isApply(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int itemid = Integer.valueOf(request.getParameter("itemid"));
		User user = (User) request.getSession().getAttribute("loginUser");
		DeveloperService ds = new DeveloperServiceImpl();
		ApplyService as = new ApplyServiceImpl();
		ItemService is = new ItemServiceImpl();
		response.setContentType("application/json;charset=utf-8");
		HashMap<String, Object> map = new HashMap<>();
		Developer developer = ds.getDeveloperByUserId(user.getId());
		if(developer != null) {
			List<Apply> applyRecode = as.selectApplyByDeveloperAndItem(developer.getId(), itemid);
			
			if (applyRecode !=null) {//已经申请项目，有记录
				System.out.println("申请状态是:"+applyRecode.get(0).getState());
				if(applyRecode.get(0).getState()==4) {//申请过，但已取消，即可以申请 sql按倒序排序，若最后一次申请记录已取消，则可以申请
					map.put("code", 0);
				}else {
					map.put("code", 1);//1 不可申请  即有此申请记录，且未取消
				}
			} else {//未申请，可申请
				map.put("code", 0);
			}
			String jsonStr = JSON.toJSONString(map);
			response.getWriter().print(jsonStr);
		}
		
	}
	
	public void updateState(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 获取当前选中的applyId、要设置的state
		String applyId = request.getParameter("applyId");
		String state = request.getParameter("state");
		String itemId = request.getParameter("itemId");
		ApplyService as = new ApplyServiceImpl();
		as.updateStateByApplyId(Integer.valueOf(state), Integer.valueOf(applyId));
		
		if(state.equals("4")){//来自开发者的请求即取消报名，则转发至我参与的项目,另外项目报名人数-1
			ItemService is = new ItemServiceImpl();
			is.delApplicantNumByItemId(Integer.valueOf(itemId));
			// 转发，重新获取我的项目
			request.getRequestDispatcher("ApplyServlet?way=getMyApply").forward(request, response);
		}
		else {//如果是从需求者来的处理请求，则处理需求则业务，并回到需求者页面
			if(state.equals("2")) {//如果点击某个开发者的是确认合作，则更新项目状态为开发中
				response.sendRedirect(request.getContextPath()+"/ItemServlet?way=updateState&itemId="+itemId+"&state=2");
			}else{
				//如果点击的是不合适，则更新该条申请为已拒绝
				response.sendRedirect(request.getContextPath()+"/ItemServlet?way=getitemAnddevelopers&itemId="+itemId);
			}
		}
		
	}
	
	/**需求者更新开发者的备注信息
	 * @param request
	 * @param response
	 * @throws ServletException
	 * @throws IOException
	 */
	public void updateNoteByApplyId(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("application/json;charset=utf-8");
		String applyId = request.getParameter("applyId");
		String note = request.getParameter("note");
		ApplyService as = new ApplyServiceImpl();
		boolean flag = as.updateNoteByApplyId(note, Integer.valueOf(applyId));
		HashMap<String, Object> map = new HashMap<>();
		Gson gson = new Gson();
		if(flag) {
			map.put("code", 1);
			map.put("note", note);			
		}else {
			map.put("code", 0);
		}
		String jsonStr = gson.toJson(map);
		response.getWriter().print(jsonStr);	
	}
	/***
	 * 根据不同的申请状态查询我申请的项目列表
	 * @param request
	 * @param response
	 * @throws ServletException
	 * @throws IOException
	 */
	public void getApplysByState(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("application/json;charset=utf-8");
		User user = (User) request.getSession().getAttribute("loginUser");
		// 获取到开发者的id
		DeveloperService ds = new DeveloperServiceImpl();
		int developerId = ds.getDeveloperByUserId(user.getId()).getId();
		//获取申请状态
		int state = Integer.valueOf(request.getParameter("stateid"));
		
		
		ApplyService as = new ApplyServiceImpl();
		List<Apply> myApply = as.getApplysByState(developerId, state);
		
		//System.out.println(myApply);
		request.setAttribute("stateId", state);
		request.setAttribute("myApplys", myApply);
		request.getRequestDispatcher("/page/myitem/myJointProjects.jsp").forward(request, response);
	}
	
	
}