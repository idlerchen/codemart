<%@ page language="java" contentType="text/html; charset=UTF-8"  pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="zh-cn">

<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>码市 – 互联网软件外包服务平台</title>
	<meta name="Keywords" content="Coding,码市,Coding码市,外包,软件外包,Coding源码市场,众包,云端众包,远程工作,悬赏平台,Coding悬赏平台,软件项目需求,软件开发">
	<meta name="Description" content="码市是 Coding 推出的互联网软件外包服务平台，意在连接需求方与广大开发者。让项目的需求方快速的找到合适的开发者，完成项目开发工作。同时也帮助开发者找到合适的项目将技术变成财富。码市基于 Coding 的在线工具对项目进行管控，保障双方的利益。">
	<meta name="apple-itunes-app" content="app-id=1048541582">
	<meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no">
	<link rel="icon" type="image/x-icon" href="https://mart.coding.net/favicon.ico">
	<link rel="shortcut icon" type="image/x-icon" href="https://mart.coding.net/favicon.ico">
	<%@ include file="/page/base/base.jsp"%>	
	<%@ include file="/page/base/svgstyle.jsp"%>	
</head>

<body>
	<%@ include file="/page/base/svg.jsp"%>
	<div id="container" style="height: 100%;">
		<div data-reactroot="" style="height: 100%;">
			<!-- react-empty: 3 -->
			<div class="container-1weyJ">
				<%@ include file="/page/base/header.jsp"%>
				<div class="content-wrapper-Ssu-q">
					<div class="project-layout-1xdE4"><span><div class="tip-3pB2E red-2ShMH shadow-2QXtv"><div>根据税务局要求，2018 年 6 月 1 日起码市不再支持开具发票，仅提供资金托收托付服务。如有开票要求请于 2018 年 5 月 30 日前提交或与开发服务商协商开票。</div></div></span>
						<div>
							<div class="project-header-3SycG clearfix">
								<div class="breadcrumb-3h3xJ">我参与的项目</div>
								<div class="opt-1bpkb">
									<!-- <div class="filter-1fR93">
										所有状态<span class="fa fa-caret-down"></span></span>
									</div> -->
									
									<div class="filter-1fR93" style="position: relative;">
							  		<span class="ant-popover-open">
							  			<span data-stateId="${stateId }">所有状态</span>
							  			<span class="fa "><img src="img/downArrow.png" style="width:12px;height:8px;"></span>
							  			<!-- 下拉框 -->
							  			<div style="position: absolute; top: 25px; left: -40px; width: 100%;">
											<div data-reactroot="">
												<div class="ant-popover  ant-popover-placement-bottomRight ant-popover-hidden" id="statusarea">
													<div class="ant-popover-content">
														<div class="ant-popover-arrow"></div>
														<div class="ant-popover-inner">
															<div>
																<div class="ant-popover-inner-content">
																	<div class="status-filter-3JJlO">
																		<div class="ant-menu ant-menu-vertical ant-menu-light ant-menu-root" role="menu" aria-activedescendant="" tabindex="0"  id="ddddd">
																			<li class="ant-menu-item" role="menuitem" aria-selected="false" value="0">所有状态</li>
																			<li class="ant-menu-item" role="menuitem" aria-selected="false" value="1">待审核</li>
																			<li class="ant-menu-item" role="menuitem" aria-selected="false" value="2">已通过</li>
																			<li class="ant-menu-item" role="menuitem" aria-selected="false" value="3">已拒绝</li>
																			<li class="ant-menu-item" role="menuitem" aria-selected="false" value="4">已取消</li>
																		</div>
																	</div>
																</div>
															</div>
														</div>
													</div>
												</div>
											</div>
										</div>
							  		</span>
							  	</div>
							  	
								</div>
							</div><span style="display: none;"></span>
							
							
							<c:forEach items="${myApplys }" var="myapply">
							<div class="project-container-3CZKe">
								<div class="project-content-cF1DZ">
									<div class="title-lTwth">
										<div class="name-Bb9as"><span class="no-1cf7R"><!-- react-text: 183 -->NO.<!-- /react-text --><!-- react-text: 184 -->${myapply.itemId }<!-- /react-text --></span>
											<!-- react-text: 185 -->${myapply.itemName }
											<!-- /react-text -->
										</div>
										<div class="stat-2DUOB">
										<%-- <span class="view-3lvIF"><span class="fa fa-eye"></span>浏览量>${myapply.itemView }
											</span> --%>
											<span class="apply-3K8yJ"><span class="fa fa-hand-stop-o"></span>
											<!-- react-text: 193 -->报名数
											<!-- /react-text -->
											<!-- react-text: 194 -->${myapply.itemApply }
											<!-- /react-text -->
											</span>
											<c:if test="${myapply.state == 1 }">
												<span class="status-11L5L checking">
											</c:if>
											<c:if test="${myapply.state==2 }">
												<span class="status-11L5L passed">
											</c:if>
											<c:if test="${myapply.state==3 }">
												<span class="status-11L5L rejected">
											</c:if>
											<c:if test="${myapply.state==4 }">
												<span class="status-11L5L canceled">
											</c:if>${myapply.stateName }</span></div>
									</div>
									<div class="detail-3UJDe clearfix">
										<div class="cover-9PnrX">
											<a href="https://codemart.com/project/15964">
												<img src="img/projectImg1.png">
											</a>
										</div>
										<div class="info-1cipd">
											<div class="row-1_-sQ"><span class="type-1-Hyj"><svg name="#miniWeb_9be2fb128c0a39d8a2ae84e7b82614dd" class="icon" style="width: 16px; height: 16px;"><use xlink:href="#miniWeb_9be2fb128c0a39d8a2ae84e7b82614dd"></use></svg><!-- react-text: 206 -->${myapply.itemtype }<!-- /react-text --></span><span class="role-14CKF">${myapply.itemRole }</span></div>
											<div class="row-1_-sQ"><span class="price-12Ljs">金额<span class="gray-2ddmL"><span>¥${myapply.itemMoney }</span></span>
												</span><span class="duration-1i0vx">周期 <span class="gray-2ddmL">${myapply.period }天</span></span>
												<span class="status-11L5L">项目状态：
													<span class="gray-2ddmL">
														<c:choose>
															<c:when test="${myapply.state == 1 }">正在审核中</c:when>
															<c:when test="${myapply.state == 2 }">已确认合作</c:when>
															<c:when test="${myapply.state == 3 }">已拒绝申请</c:when>
															<c:when test="${myapply.state == 4 }">已取消申请</c:when>
															<c:otherwise>需求者已取消该项目</c:otherwise>
														</c:choose>
													</span>
												</span>
											</div>
											<div class="row-1_-sQ">
												<div class="operation-3y24p">
													<div class="opt-1bpkb">
													<c:if test="${myapply.state == 1 }">
													<a href="ApplyServlet?way=updateState&applyId=${myapply.id }&state=4&itemId=${myapply.itemId}">
														<button class="button-3791w small-2UQdV">取消报名</button></a>
														</c:if>
														<button class="button-3791w small-2UQdV primary-32yiR">编辑申请内容</button>
													</div>
												</div>
											</div>
										</div>
									</div>
								</div>
							</div>
							</c:forEach>
							<!-- <div class="project-container-3CZKe">
								<div class="project-content-cF1DZ">
									<div class="title-lTwth">
										<div class="name-Bb9as"><span class="no-1cf7R">react-text: 183NO./react-text --><!-- react-text: 18415964/react-text</span>
											react-text: 185webtest_2
											/react-text
										</div>
										<div class="stat-2DUOB"><span class="view-3lvIF"><span class="fa fa-eye"></span>
											react-text: 189浏览量
											/react-text
											react-text: 1902
											/react-text
											</span><span class="apply-3K8yJ"><span class="fa fa-hand-stop-o"></span>
											react-text: 193报名数
											/react-text
											react-text: 1942
											/react-text
											</span>
											react-empty: 195<span class="status-11L5L checking">审核中</span></div>
									</div>
									<div class="detail-3UJDe clearfix">
										<div class="cover-9PnrX">
											<a href="https://codemart.com/project/15964">
												<img src="img/projectImg1.png">
											</a>
										</div>
										<div class="info-1cipd">
											<div class="row-1_-sQ"><span class="type-1-Hyj"><svg name="#miniWeb_9be2fb128c0a39d8a2ae84e7b82614dd" class="icon" style="width: 16px; height: 16px;"><use xlink:href="#miniWeb_9be2fb128c0a39d8a2ae84e7b82614dd"></use></svg>react-text: 206Web 网站/react-text</span><span class="role-14CKF">项目经理</span></div>
											<div class="row-1_-sQ"><span class="price-12Ljs">react-text: 210金额/react-text<span class="gray-2ddmL"><span>¥1,000</span></span>
												</span><span class="duration-1i0vx">react-text: 214周期 /react-text<span class="gray-2ddmL">react-text: 2161/react-text --><!-- react-text: 217 天/react-text</span></span><span class="status-11L5L">react-text: 219项目状态：/react-text<span class="gray-2ddmL">招募中</span></span>
											</div>
											<div class="row-1_-sQ">
												<div class="operation-3y24p">
													<div class="opt-1bpkb">
														<button class="button-3791w small-2UQdV">取消报名</button>
														<button class="button-3791w small-2UQdV primary-32yiR">编辑申请内容</button>
													</div>
												</div>
											</div>
										</div>
									</div>
								</div>
							</div> -->
							
			
							<span style="display: none;"></span>
						</div>
					</div>
				</div>
				<%@ include file="/page/base/footer.jsp"%>
			</div>
		</div>
	</div>
	<!-- 联系我们 -->
	<script src="js/codemart-contact-us-v1.0.0.js"></script>
	<script src="jsmy/myJoinProjects.js"></script>		
</body>

</html>