<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="zh-cn">
<head>
	<meta charset="UTF-8">
	<title>码市 – 互联网软件外包服务平台</title>
	<meta name="Keywords" content="Coding,码市,Coding码市,外包,软件外包,Coding源码市场,众包,云端众包,远程工作,悬赏平台,Coding悬赏平台,软件项目需求,软件开发">
	<meta name="Description" content="码市是 Coding 推出的互联网软件外包服务平台，意在连接需求方与广大开发者。让项目的需求方快速的找到合适的开发者，完成项目开发工作。同时也帮助开发者找到合适的项目将技术变成财富。码市基于 Coding 的在线工具对项目进行管控，保障双方的利益。">
	<meta name="apple-itunes-app" content="app-id=1048541582">
	<meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no" />
	<link rel="icon" type="image/x-icon" href="https://mart.coding.net/favicon.ico">
	<link rel="shortcut icon" type="image/x-icon" href="https://mart.coding.net/favicon.ico">
    <%@include file="/page/base/base.jsp"%>
    <style>
    #code{
    	position: fixed;
		right: 555px;
		bottom: 610px;
    }
    
    </style>
</head>

<body>
	<div id="container" style="height: 100%;">
		<div data-reactroot="" style="height: 100%;">		
		<div class="layout-container-S5Qks">
			<div class="layout-content-3goT6">
				<!--header-->
				<div class="header-container-2Bn3r">
					<div class="left-zone-2SI-U">
						<div class="logo-2LQ-9">
							<a href="index.jsp">
								<img src="img/mart-logo.png">
							</a>
						</div>
						<div class="title-2qjCL">互联网软件外包服务平台</div>
					</div>
					<div class="right-zone-269eP">
						<div>
							<div class="label-3fTyn tip-tYnkK inline-1qat6">已有账号？</div>
							<a href="page/user/login.jsp">
								<button class="button-3791w inline-NxqXU ghost-3CjNq small-2UQdV">登录</button>
							</a>
						</div>
					</div>
				</div>
				<!--body-->					
				<div class="register-page-container-qol_q">
					<div class="register-page-content-8N1N3">
						<div class="register-form-container-3M79G">
							<form action="UserServlet?way=register" method="post">
									<!--选择身份-->
									<div class="title-3Ojaf title-1jS56 align-center-2f551" id="usertype">
										<p>选择身份</p>
										<label for="1d2077b6-bc3e-44e9-bdbf-ecc98c54b211" class="option-1mrz9" data-usertype="0">
											<div class="option-content-1mAVh">
												<div class="avatar-2sJFr">
													<input type="radio" name="accountType" value="DEVELOPER" id="1d2077b6-bc3e-44e9-bdbf-ecc98c54b211">
													<img src="img/developer.png">
												</div>
												<div class="info-2KFku">
													<div class="title-36QId">开发者</div>
													<div class="desc-1XJuB">可在码市报名项目，赚取收益</div>
												</div>
											</div>
										</label>
										<label for="c2d9ad7f-d6fe-4631-9aac-64978209594b" class="option-1mrz9" data-usertype="1">
											<div class="option-content-1mAVh">
												<div class="avatar-2sJFr">
													<input type="radio" name="accountType" value="DEMAND" id="c2d9ad7f-d6fe-4631-9aac-64978209594b">
													<img src="img/demander.png">
												</div>
												<div class="info-2KFku">
													<div class="title-36QId">需求方</div>
													<div class="desc-1XJuB">可在码市发布项目，实现需求</div>
												</div>
											</div>
										</label>
									</div>
									<!--将用户类型传递  -->
									<input type="hidden" name="userType" id="type_input"/>
									<div id="register_input"  style="display:none">	
										<div class="title-3Ojaf title-1jS56 align-center-2f551">注册开发者账号</div>	
										<div class="title-3Ojaf title-1jS56 align-center-2f551">注册个人需求方</div>	
										<span style="display:none" id="registerMsg">${registerMsg }</span>							 							
										<input name="username" value="${param.username }" placeholder="用户名（即个性后缀，注册后无法修改）" class="input-DvJ_0 block-1EHlh" id="username">
							
									    <div class="error-vXvqJ" id="userMsg" style="display:none"><i class="fa fa-times-circle" ></i>用户名已存在</div>	 			
										<div class="phone-2WGv- margin-BQBHU" tabindex="-1">
											<div class="phone-content-2zkFs">
												<div class="icon-GRoPD">
													<i class="cn flag X1"></i>
													<i class="fa fa-caret-down"></i>
												</div>
												<div class="country-code-I4JHX">+86</div>
												<input class="input-3fxHA" placeholder="手机号" name="telephone" value="${param.telephone }" id="phone">
												<div class="button-2kp5Y buttonDisabled-m6ivW" tabindex="-1" id="sendCode">发送验证码</div>
											</div>					
										</div>
										<input name="inputCode"  placeholder="请输入手机验证码" class="input-DvJ_0 block-1EHlh margin-3EJeM">
										<input type="password" name="password" placeholder="请输入密码" class="input-DvJ_0 block-1EHlh margin-3EJeM" id="password">
										<input type="password" name="rePassword"  placeholder="请确认密码" class="input-DvJ_0 block-1EHlh margin-3EJeM" id="repassword">
										 <div class="error-vXvqJ" id="checkPwdMsg" style="display:none"><i class="fa fa-times-circle" ></i>密码不一致</div>
										<div class="label-3fTyn block-3s8f8">
											<label class="checkbox-3Bx_n ant-checkbox-wrapper">
												<span class="ant-checkbox ant-checkbox-checked">
													<input type="checkbox" name="protocol" class="ant-checkbox-input" id="agree">
													<span class="ant-checkbox-inner"></span>
												</span>
												<span>我同意遵守
													<a href="/agreement" target="_blank">《码市用户服务协议》</a>
												</span>
											</label>
										</div>
										<input class="button-3791w button-23o7d block-1WyYE primary-32yiR " type="submit" value="注册" id="btn_sub"/>
										<div class="label-3fTyn back-17fZ0 block-3s8f8 align-center-1Z4HY" id="backselect">返回选择需求方类型</div>	
									</div>
																					
							</form>
						</div>
					</div>
				</div>
				
				<img id="code" src="validateCode" style="display:none"/>
				<footer class="footer-2LWW8">
					<div>
						<div class="logo-1-SrY">
							<img class="icon-32G5E" src="img/mart-logo.png">
						</div>
						<div class="copy-right-2mObs">Copyright © 2014-2018</div>
					</div>
				</footer>
			</div>
		</div>
		</div>
	</div>
	<!-- <script src="js/codemart-contact-us-v1.0.0.js"></script> -->
	<script src="jsmy/register.js"></script>
	
</body>
</html>