<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
	<div id="top-menu">
		<div class="container clearfix">
			<a class="logo clearfix" href="index.jsp">
				<img src="img/mart-logo.png">
				<img src="img/mart-logo-white.png">
			</a>
			<div class="nav-icon">
				<span><i class="fa fa-navicon"></i></span>
			</div>
			<div style="position: relative">
				<ul class="nav">
					<li>
						<a href="ItemServlet?way=getAllItems">项目</a>
					</li>
					<li class="value-add-service-web">
						<a href="javascript:void(0);">
							帮助
						</a>
						<div class="child-menu">
							<div class="menu-item">
								<a href="#">常见问题</a>
							</div>
							<div class="menu-item">
								<a href="#">我是需求方</a>
							</div>
							<div class="menu-item">
								<a href="#">我是开发方</a>
							</div>
						</div>
					</li>
				</ul>
				<div id="close-menu" class="nav-icon" style="position: absolute; top: 2.5rem; right: 0; display: none; z-index: 100">
					<span><i class="fa fa-times"></i></span>
				</div>
			</div>

			
			
			<!--未登录-->
			<c:if test="${empty sessionScope.loginUser }">
				<div class="right-zone"> 
			 		<div class="login-zone">
						<div class="btns">
							<a class="user button" href="page/user/login.jsp">登录</a>
							<a class="user button" href="page/user/register.jsp">注册</a>
						</div>
					</div>
				</div> 
			</c:if>
			
			<!--已登录 -->	
			<c:if test="${!empty sessionScope.loginUser }">
				 <div class="right-zone"> 
					 <div class="login-zone">
						<div class="user">
							<a href="index.jsp" class="ui avatar image"  title="陈国强" style="" target="_self">
								<img src="img/headImg.png" height="40px">
							</a>
							<!-- <i class="fa fa-chevron-down cursor" title=""></i> -->
						</div>
						<div class="nav-icon">
							<span><i class="fa fa-navicon"></i></span>
						</div>
					</div> 
					<div id="user-info-menu" class="menu-zone" style="display: none;">
						<div class="menu-ul">
							<div class="menu-header">
								Hello,${sessionScope.loginUser.username }
							</div>
							<div class="menu-gap"></div>
							<div class="menu-section userinfo">
								<a class="menu-li"  target="_self" href="UserInfoServlet?way=getUser" >
									<i class="fa fa-user"></i>个人中心
								</a>
							</div>
							<div class="menu-gap"></div>
							<div class="menu-section">
							<c:if test="${sessionScope.loginUser.userType == 0 }">
								<a class="menu-li" target="_self" href="ApplyServlet?way=getMyApply">
									<i class="fa fa-flag"></i>我参与的项目
								</a>
								</c:if>
								<c:if test="${sessionScope.loginUser.userType == 1 }">
								<a class="menu-li" target="_self" href="ItemServlet?way=getMyItems">
									<i class="fa fa-pencil"></i>我发布的项目
								</a>
								</c:if>
							</div>
							<div class="menu-gap"></div>
							<div class="menu-section">
								<div class="menu-li">
									<a target="_self" class="signout" href="UserServlet?way=logout">
										<i class="fa fa-sign-out"></i>退出登录
									</a>
								</div>
							</div>		
						</div>		
					</div>	 	
				</div> 
			</c:if>
			
		</div>
	</div>