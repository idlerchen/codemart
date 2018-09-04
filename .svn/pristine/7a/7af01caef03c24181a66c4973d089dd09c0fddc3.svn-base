<%@ page language="java" contentType="text/html; charset=UTF-8"  pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
	<%@include file="/page/base/base.jsp"%>
	<style>
	#addressarea>select{
		height:39.78px;
		box-sizing: border-box;
		font-size: 1rem; 
		line-height: 1.5rem;  
		border: 1px solid #cad3de;
		border-radius: 4px; 
		color:#cad3de;
		text-indent:1em;
	}	
	</style>
</head>

	<body>
		<div id="container" style="height: 100%;">
			<div data-reactroot="" style="height: 100%;">
				<div class="container-1weyJ">
					<%@include file="/page/base/header.jsp"%>
					<div class="content-wrapper-Ssu-q">
						<div class="content-3gsSy">
							<div style="width: 100%; height: 100%;">
								<div class="breadcrumb-wrapper-ZxCLZ">
									<ul class="breadcrumbs-aNUr6 clearfix">
										<li>
											<a href="page/userinfo.userInfo.jsp">个人中心</a>
										</li>
										<li>账户信息</li>
										<li></li>
									</ul>
								</div>
								
								<div class="wrapper-1YUz0 flex-box flex-direction-row">
									<div class="menu-1yD6E">
										<div>
											<div class="side-nav-1xlRA ">
												<ul>
													<li class="side-nav-header-CK5-A border-radius-top-2CK0R"><span>基本信息</span></li>
													<li class="side-nav-item-2WoTY">
														<a class="nav-link-2--Ve active-11pGw" href="UserInfoServlet?way=getUser">
															<svg name="#info_0fade44534b07721822e53d7504f1ef4" class="icon" style="width: 16px; height: 16px;">
																<use xlink:href="#info_0fade44534b07721822e53d7504f1ef4"></use>
															</svg><span>账户信息</span><span class="right-icon-wrapper-1Gzq_"><span class="fa fa-check-circle-o not-full-filled-38_sS"></span></span>
														</a>
													</li>
												</ul>
											</div>
											<!-- 开发者信息 -->
											<c:if test="${sessionScope.loginUser.userType == 0 }">
											 <div class="side-nav-1xlRA ">
												<ul>
													<li class="side-nav-header-CK5-A border-radius-top-2CK0R"><span>开发者信息</span></li>
													<li class="side-nav-item-2WoTY">
														<a href="page/userinfo/demanderSkills.jsp" class="nav-link-2--Ve">
															<svg name="#skill_927c4618eb32d38fe57c041bfe98ed3b" class="icon" style="width: 16px; height: 16px;">
																<use xmlns:xlink="http://www.w3.org/1999/xlink" xlink:href="#skill_927c4618eb32d38fe57c041bfe98ed3b"></use>
															</svg><span>技能展示</span><span class="right-icon-wrapper-1Gzq_"><span class="fa fa-check-circle-o full-filled-1082s"></span></span>
														</a>
													</li>
												</ul>
											</div> 
											</c:if>
											
										</div>
									</div>
									
									<div class="content-wtzUH flex-auto-justify">
										<div class="box-KhXKh">
											<div class="info-wrapper-2g9Tb">
												<!-- react-empty: 141 -->
												<div class="info-header-18z8-">
													<div class="avatar-1fLVZ">
														<div class="avatar-modal-1W-YB"><i class="fa fa-pencil-square-o"></i></div>
														<img class="avatar-img-2Tn2a" src="img/headImg.png" id="img">
														<div>
															<div class="avatar-upload-BW5_P" id="photo_input"><input type="file" name="photo" id="photo" onchange="preview(this)"></div>
															<!-- react-empty: 150 -->
														</div>
													</div>
													<div class="info-2gxAC"><span>${sessionScope.loginUser.username}</span><span></span>
														<div class="vip-info-DR-eA"></div>
													</div>
												</div>
												<div class="section-21WOI clearfix">
													<p class="header-1OTrt">账户信息<span style="float: right;"></span></p>
													<hr class="hr-3fw5s">
													<div>
														<div class="tips-h1eUF">
															<p>标有星号 (*) 的栏目为必填栏目, 并请验证邮箱和手机。</p>
															<p>您的个人信息不会透露给任何第三方，请放心填写。</p>
														</div>
														<div class="account-item-1oBU0">
															<div class="item-header-EAzQ6"><span>工作邮箱</span><span> * </span>
															<c:if test="${empty user.email }">
																<span class="validation-27wEs has-not-2CgbN" >未验证</span>
															</c:if>
															<c:if test="${!empty user.email }">
																<span class="validation-27wEs has-been-wVZXN" >已验证</span>
															</c:if>
																</div>
																
															<div class="item-content-2OA1E">
																	<div class="input-wrapper-16Kpe" id="email_view"><span id="realemail">${empty user.email?"无":user.email }</span></div>
																 <div class="input-wrapper-16Kpe" id="email_input" style="display:none">
																		<input placeholder="邮箱" name="email" value="${user.email }" class="input-DvJ_0 input-width-SlJzZ" id="inputemail">
																		<!-- react-empty: 445 -->
																	</div> 
																<div class="operation-1JcsM" id="upemail">
																	<a><i class="fa fa-pencil-square-o"></i>修改
																	</a>
																</div>
																<div class="operation-1JcsM" id="email_edit" style="display:none">
																	<a id="cancel"><i class="fa fa-pencil-square-o"></i>取消
																	</a>
																	<a id="confirm"><i class="fa fa-pencil-square-o"></i>确定
																	</a>
																</div>
																<div class="clearfix"></div>
															</div>
															
														</div>
														
														<div class="account-item-1oBU0">
															<div class="item-header-EAzQ6"><span>工作手机</span><span> * </span>
																<c:if test="${empty user.telephone }">
																<span class="validation-27wEs has-not-2CgbN">未验证</span>
																</c:if>
																<c:if test="${!empty user.telephone }">
																	<span class="validation-27wEs has-been-wVZXN">已验证</span>
																</c:if>
															</div>
															
															<div class="item-content-2OA1E">
																	<div class="input-wrapper-16Kpe" id="telephone_view"><span id="realtelephone">${empty user.telephone?"无":user.telephone }</span></div>
																 <div class="input-wrapper-16Kpe" id="telephone_input" style="display:none">
																		<input placeholder="手机号" name="telephone" value="${user.telephone }" class="input-DvJ_0 input-width-SlJzZ" id="inputtelephone">
																		<!-- react-empty: 445 -->
																	</div> 
																<div class="operation-1JcsM" id="uptelephone">
																	<a><i class="fa fa-pencil-square-o"></i>修改
																	</a>
																</div>
																<div class="operation-1JcsM" id="telephone_edit" style="display:none">
																	<a id="canceltelephone"><i class="fa fa-pencil-square-o"></i>取消
																	</a>
																	<a id="confirmtelephone"><i class="fa fa-pencil-square-o"></i>确定
																	</a>
																</div>
																<div class="clearfix"></div>
															</div>
															
														</div>
														
													</div>
												</div>
												<div class="section-21WOI clearfix">
													<p class="header-1OTrt">个人资料<span style="float: right;"></span></p>
													<hr class="hr-3fw5s">
													<div class="form-wrapper-1y-xg">
														<form action="UserInfoServlet?way=updateUser" method="post">
															<div class="form-item-1KWQ0"><label class="form-header-3sO8e"><span>姓名</span><span> * </span></label>
																<div class="form-content-3IsYl">
																	<div class="hide-3nPl2">
																		<div><span></span>
																			<div class="edit-right-5UO_B"><button type="button" class="button-3791w link-1Omym"><span class="fa fa-edit"></span><!-- react-text: 216 --> 修改<!-- /react-text --></button></div>
																		</div>
																	</div>
																	<div class="">
																		<div>
																			<input placeholder="姓名" name="realname" value="${user.realname }" class="input-DvJ_0 block-1EHlh">
																		</div>
																	</div>
																</div>
															</div>
															<div class="form-item-1KWQ0"><label class="form-header-3sO8e"><span>QQ</span></label>
																<div class="form-content-3IsYl">
																	<div class="hide-3nPl2"></div>
																	<div class="">
																		<input placeholder="QQ 号码" name="qqNum" value="${user.qqNum }" class="input-DvJ_0 block-1EHlh">
																	</div>
																</div>
															</div>
															<div class="form-item-1KWQ0"><label class="form-header-3sO8e"><span>所在地</span><span> * </span></label>
																<div class="form-content-3IsYl">
																	<div class="hide-3nPl2"> </div>
																	<div class="">
																		<div>
																			<div class="region-select-1Qddf ant-select ant-select-enabled" id="addressarea">
																				<!-- <div class="ant-select-selection ant-select-selection--single" role="combobox" aria-autocomplete="list" aria-haspopup="true" aria-expanded="false" tabindex="0">
																					<div class="ant-select-selection__rendered">
																						<div unselectable="unselectable" class="ant-select-selection__placeholder" style="display: none; user-select: none;">省</div>
																						<div class="ant-select-selection-selected-value" title="请选择" style="display: block; opacity: 1;">请选择</div>
																					</div><span class="ant-select-arrow" unselectable="unselectable" style="user-select: none;"><b></b></span></div> -->
																					
																					<select class="select" id="provinceCode" name="provinceId">
																						<option value="">请选择</option>
																					</select>
																					<select class="select" id="cityCode" name="cityId">
																						<option value="">请选择</option>
																					</select> 
																					<select class="select" id="countyCode" name="countyId">
																						<option value="">请选择</option>
																					</select>
																			</div>
																		</div>
																	</div>
																</div>
															</div>
															<input type="hidden" id="province" value="${user.provinceId }"/>
															<input type="hidden" id="city" value="${user.cityId }"/>
															<input type="hidden" id="county" value="${user.countyId }"/>
															<div class="form-button-2yvtd"><input type="submit" class="button-3791w primary-32yiR" value="保存"/></div>
														</form>
													</div>
												</div>
												
											</div>
										</div>
									</div>
									
								</div>
							</div>
						</div>
					</div>
					<%@include file="/page/base/footer.jsp"%>
				</div>
			</div>
		</div>
		<!-- 联系我们 -->
		<!-- <script async="" src="js/codemart-contact-us-v1.0.0.js"></script> -->
		<script src="jsmy/userinfo.js"></script>
	</body>

</html>