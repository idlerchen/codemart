<%@ page language="java" contentType="text/html; charset=UTF-8"  pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@ taglib prefix="C" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<html lang="zh-cn">
<head>
	<meta http-equiv="content-type" content="text/html; charset=UTF-8">
	<meta charset="UTF-8">
	<title>码市 – 互联网软件外包服务平台</title>
	<meta name="Keywords" content="Coding,码市,Coding码市,外包,软件外包,Coding源码市场,众包,云端众包,远程工作,悬赏平台,Coding悬赏平台,软件项目需求,软件开发">
	<meta name="Description" content="码市是 Coding 推出的互联网软件外包服务平台，意在连接需求方与广大开发者。让项目的需求方快速的找到合适的开发者，完成项目开发工作。同时也帮助开发者找到合适的项目将技术变成财富。码市基于 Coding 的在线工具对项目进行管控，保障双方的利益。">
	<meta name="apple-itunes-app" content="app-id=1048541582">
	<meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no">
	<link rel="icon" type="image/x-icon" href="https://mart.coding.net/favicon.ico">
	<link rel="shortcut icon" type="image/x-icon" href="https://mart.coding.net/favicon.ico">
	<%@include file="/page/base/base.jsp"%>
</head>

<body>

	<div id="container" style="height: 100%;">
		<div data-reactroot="" style="height: 100%;">
			<div class="container-1weyJ">
				<%@include file="/page/base/header.jsp"%>
				<div class="content-wrapper-Ssu-q">
					<div class="project-container-3QzG0">
						<div class="project-header-container-2Tn_0">
							<div class="project-header-content-1yYp7">
								<header class="project-header-2fieg">
									<div class="header-left-1jvNY">
										<div class="project-title-2KBRU">NO.${item.id }&nbsp;${item.name }<a class="project-edit-D4zu0" href="https://codemart.com/publish?id=15964"><i class="fa fa-pencil"></i></a><span class="project-edit-D4zu0"><i class="fa fa-times"></i></span></div>
										<div class="project-info-3Yvze">
											<ul class="info-row-3Z8Jp">
												<li><strong>招募：</strong>${item.roleName }</li>
												<li><strong>类型：</strong>${item.itemtypeName }</li>
											</ul>
											<ul class="info-row-3Z8Jp">
												<li><strong>服务：</strong> ${item.industryName } </li>
												<li><strong>周期：</strong>${item.period } 天</li>
											</ul>
										</div>
									</div>
									<div class="header-right-1c8T2">
										<div class="project-price-container-2OcLT">
											<div class="project-price-1VyJP"><span><fmt:formatNumber value="${item.money }" pattern="#,###"></fmt:formatNumber> </span><small>项目金额</small></div>
										</div>
										<!-- <div class="project-log-1KJ6N">
											<a>项目动态记录</a>
										</div> -->
									</div>
								</header>
							</div>
						</div>
						<div class="metro-line-container-1D_WL">
							<div class="metro-line-content-24GLL">
								<c:if test="${item.state!=4 }">
									<div class="metro-line-wrapper-1KcH6">
										<div class="metro-line-1iry2">
											<div class="metro-station-1i_60 first-station-3LoAs passedStation-2Rq3J">
												<div class="icon-container-1p-by"><i class="fa fa-money"></i></div>
												<div class="metro-name-container-LKqt6">发布</div>
											</div>
										</div>
										<div class="metro-line-1iry2 with-line-1MrZV">
											<div class="line-dot-2qiLT passed-line-2EbQh"></div>
											<div class="line-2dzLc passed-line-2EbQh"></div>
											<div class="line-dot-2qiLT passed-line-2EbQh"></div>
											<div class="metro-station-1i_60 passedStation-2Rq3J">
												<div class="icon-container-1p-by"><i class="fa fa-briefcase"></i></div>
												<div class="metro-name-container-LKqt6">招募中</div>
											</div>
										</div>
										<div class="metro-line-1iry2 with-line-1MrZV" id="ifdeveloping" data-state="${item.state }">
											<div class="line-dot-2qiLT"></div>
											<div class="line-2dzLc"></div>
											<div class="line-dot-2qiLT"></div>
											<div class="metro-station-1i_60">
												<div class="icon-container-1p-by"><i class="fa fa-tasks"></i></div>
												<div class="metro-name-container-LKqt6">开发中</div>
											</div>
										</div>
										<div class="metro-line-1iry2 with-line-1MrZV" id="iffinished">
											<div class="line-dot-2qiLT"></div>
											<div class="line-2dzLc"></div>
											<div class="line-dot-2qiLT"></div>
											<div class="metro-station-1i_60 last-station-1W-oc">
												<div class="icon-container-1p-by"><i class="fa fa-calendar-check-o"></i></div>
												<div class="metro-name-container-LKqt6">已结束</div>
											</div>
										</div>
									</div>
								</c:if>
								<c:if test="${item.state==4 }">
									<i style="color: rgba(105, 105, 105, 1);" class="fa fa-exclamation-circle fa-2x"></i>
									<span style="padding-left: 10px; padding-right: 20px;">项目已被取消.</span>
								</c:if>
							</div>
						</div>
						<div class="project-content-wrapper-8vp61">
							<div class="project-content-3yMyg">
								<!-- react-empty: 231 -->
								<div class="recruit-section-1zSjH">
									<div class="tip-3pB2E white-2Nkt3 shadow-2QXtv">
										<div><span class="orange">码市提供在线项目管理工具，为保障您的项目及资金安全，请勿线下交易。如有开发方诱导线下支付，可联系我们举报：0755-82788632</span></div>
										<div class="close-13i1p"><span class="fa fa-close"></span></div>
									</div>
									<div class="ui-panel-2YYb8 recruit-panel-1f8uD" style="min-height: 50rem;">
										<!-- <div class="ui-header-select-1zH7K ant-select ant-select-enabled" style="width: 106px;">
											<div class="ant-select-selection ant-select-selection--single" role="combobox" aria-autocomplete="list" aria-haspopup="true" aria-expanded="false" tabindex="0">
												<div class="ant-select-selection__rendered">
													<div class="ant-select-selection-selected-value" title="所有开发者" style="display: block; opacity: 1;">所有开发者</div>
												</div><span class="ant-select-arrow" unselectable="unselectable" style="-moz-user-select: none;"><b></b></span>
											</div>
										</div> -->
										<header class="panel-header-5j8Ad">
											<div>报名列表
												<small class="sub-title-OEcmf">
													<span>带<svg name="#reliance_1256e838ddffaa86c7256e1ee2a302be" class="icon" style="width: 16px; height: 16px;"><use xlink:href="#reliance_1256e838ddffaa86c7256e1ee2a302be"></use></svg><!-- react-text: 254 -->符号的开发者已缴纳保证金 ，承诺保证需求方权益，出问题保证金先行赔付。
														<a target="_blank" href="https://mart.coding.net/help/question/123">了解更多</a>
													</span>
												</small>
											</div>
										</header>
										<span style="display: none;"></span>
										<div class="apply-list-PXuEp">
											<!-- <div class="recruit-item-1hMhx">
												<div class="item-content-3nk3o">
													<div class="left-column-260cz">
														<div><img class="apply-avatar-1QsRa" src="img/zzw.png"></div>
														<div>
															<div class="reliance-icon-1m4Ia"></div>
														</div>
													</div>
													<div class="mid-column-ZqSKz">
														<div class="apply-name-2_o6s">张志炜&nbsp;
															<span class="">
																<svg data-tip="true" data-for="developerIcon-149607" name="#authCard_ddab5e98eb905c732e8602eea4278041" class="icon" style="width: 16px; height: 16px;" currentItem="false"><use xlink:href="#authCard_ddab5e98eb905c732e8602eea4278041"></use>
																	
																</svg>
																<div class="__react_component_tooltip place-top type-dark " data-id="tooltip"></div>
																<span class="vip-icon-xS1KS">react-empty: 302
																	<div class="__react_component_tooltip place-top type-dark " data-id="tooltip"></div>
																</span>
															</span>
															<span class="apply-location-2MaNx"><i class="fa fa-map-marker"></i>react-text: 306 /react-text --><!-- react-text: 307广东/react-text --><!-- react-text: 308 /react-text --><!-- react-text: 309深圳/react-text</span></div>
														<div class="apply-info-2Yrp3">独立开发者&nbsp;|&nbsp;较少时间兼职&nbsp; |&nbsp;
															<strong>评分</strong>&nbsp;
															<div class="star-label-1JKFb evaluation-star-NB8Dr">
																<span><i class="fa fa-star"></i></span>
																<span><i class="fa fa-star"></i></span>
																<span><i class="fa fa-star"></i></span>
																<span><i class="fa fa-star"></i></span>
																<span><i class="fa fa-star"></i></span>
															</div>
															5</div>
														<div class="apply-message-2EwTK">
															<span class="nowrap-knWkt">胜任理由：</span>
															<span class="message-content-25gNW">全栈工程师，8年开发经验，产品、设计、开发全能；精通JavaScript，也熟悉其他主流语言；精通所有主流js框架和库，包括但不限于react,vue,node.js,express,react-native,electron等等；精通PC/手机网站前/后端开发、微信/小程序开发、ReactNative手机客户端开发、Electron桌面客户端开发。</span>
														</div>
														<div class="apply-message-2EwTK"><span class="nowrap-knWkt">联系方式：</span>
															react-empty: 334<button class="button-3791w link-1Omym">查看</button>
															<span class="">12435743</span>
														</div>
														<div class="apply-message-2EwTK">报名时间：13 分钟前</div>
														<div class="apply-message-2EwTK">申请资料：<button class="button-3791w link-1Omym">查看</button></div>
													</div>
													<div class="column-divider-ifaAG"></div>
													<div class="right-column-1oumq">
														<div class="apply-action-3LuMe">
															<div class="apply-mark-container-3zpxq">
																<div class="apply-mark-1cmFq apply-nomark-kp1TB" data-tip="true" data-for="markedIcon-149607" currentitem="false"><img class="apply-unmark-Mr7lN" src="data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAACoAAAAqCAYAAADFw8lbAAAAAXNSR0IArs4c6QAAA6NJREFUWAntWEtMU0EUvTOvgIoBfxujxIWoW4mAcaVGjRFdaFBwoa6MFRYkGkUw/hZGWne6qMUlEgMtcWVd+YnBmBhjTHRljAaMEWMwhtIiv871PO0r9flap1hg4RsyzP313sOZeW9uIXLHf8qAyPZ3+4Khk8R8CTGRonmFDeNjE9uZeAsrrhRCrIG9lJiGSdB7yC8w7xvFiyKnj+yMQ87ryA400BVjomKzIoAlmNnQqB6VktqVWtjW2rjnm0Y8uGCJ/CpbbFagbYEu4JzeQOEvJPgyCdnR4q0bsmcBOHE1GK7CDjVD3gcqbrY21jfY4yw9Z6AA8AHoewXzOyHFKLa+kJnKWdBWULPCSmytQtAEQLyE/h6gTNkjiJdjrQDA0lQcie8tjfULLN2+euyGTLog8UiSvNjccKDXKcZkyBcMbxWkzgL4NisGcgERV0M3JwbgJtefS/IXrPPTdbusDZQ88lzzsQNP7QksHUyb9R+a09ce2s0JdR7yRsv/r6s+0Bwq4UxGEB7xB0Lr8EbYwazW468ow66YWzsB9gYhvyLJQ6zouk7qGQFqFT7TWPcGsjkdhy8Q3kWUcPTZjdJumE1dSpX1YU7HMqdA04H8TZ5ToApP4N8AWv45BWqB0FnnFCiOqMuozi5pxyih/9RP6z16vfNeyXgstlIpsVR6EqMGF3w84a0d0EY4jUBtoEKpzb4b3UfMezwejZZbtRKTuGrw0xbo/ooD14ubtGf+qpKeppqaMSsm0wpCce/+uvkzxVh27YdJKb6CxsOLpiIF0krya+WlKLpXMXXG+6Jv/cHQ/t/9f2pmF/qn1dmizajzxzNay5RSYbD8XEi+xex5Qjyvr2jZyOhK3JmfhooWjydGNyhOXMyYwebIFWg/3tF3QMQzVqpfFnhGJifJMIhXKFKbwHY9jsbqqRpchaajigjng2I0Nkj07qfz+1RIUgK36FUzD22gUoqzzd46P4A6fWUwG+O7OBrn/e3dhwDuMvSyzGUdPCyuOVhTJu0zylI+zgAylcz0txw/2LHEKF+N7v8wWHqATt6k03Gg1fuMmBuGR1aguz/tGJQ0ajOaLYnd5/VWmtvYaU7zVRaPDldLyWvxHa6EhIoLkgOk6HWyDbR/3FGfEaDplZoO1USh30/OdFdOsvbW55R1BoJdoPkm1WXUZTTfDOQ7n3tGXUadGEBXm/rPsSFEzClmtmzZz6iUFwAkig7n9qmjta9nC5Rbx2UgjYEflOk4jVkphdEAAAAASUVORK5CYII="><img class="apply-marked-3z735" src="data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAAC4AAAAuCAYAAABXuSs3AAAAAXNSR0IArs4c6QAAAlpJREFUaAXtmT1oU1EUx885L/Wr0oqbiFO1e6EW3BwEQVxESByqkxCbwaHYmgqKQ6G2mw61dSxFqoKTdaqDo4M4dHIpdFJcxLRRtPEe/0/TkD5yw33hXSl6L9zcez7euX9+ecM9CVEYgUAgsCsJsIuqe3NPR0n1LnKX9+7bM/Lj+9YZJT2tRgeZ+QT8vaS0QUxr2L/FXIm6Dy2PXTlbxd7LcBM+u7SpRN2xAgj9qaqRg5qKCM0bc3BqonT+s0M+2KigvnHJdRI+NbsE3Z0NCPlErJPEslAu5r8kq0Asz8w9O4lvcBz7C0DzaKJUGEnmJW3vwrcPZKYtiHoHew0i432OSY9gHYDg3kYe8bdyqXBg27atOVsga78qdRHpEOrGEwPy6+vvpf4B7/5m27YXW2C3+4Pwv/0NBeKBuCOB8Ko4gsosLRDPDKVjoUDcEVRmaYF4ZigdC3V6rV1Hg/Ac7cobNWZdunJfazWKItKjhswpXFkLuMb2OWrYkfbn3r7D1dJILVyEb40X89OWFituFF6gMbg9Pf9kWA1Nwj7W8mSbU/m+LdTsT/2Oq8hri+hG3ThevnZp4XB0vI+FL4PiK3Q6tUZCYsPEH5HzMMrJALqfsUS4pZmaeMsqFmexOIgWjRbj+WDxZU+1sjEkov3oiXuITZVJPpCh1Zul/HtLCavbq/DmU68Pn6vAXqnP5lBH+9SvSkeneHgoCPcAtW3JQLwtHg/BQNwD1LYlA/G2eDwE/23i+C268c9CxLzpAWDqkm7ERe6gcgU3uMc3rl5cTX1KeCAQCAT+HwK/AKg7m53HWJI6AAAAAElFTkSuQmCC">
																	
																</div>
																<div class="__react_component_tooltip place-top type-dark " data-id="tooltip"></div>
															</div><button class="button-3791w danger-3ddVW">不合适</button><button class="button-3791w primary-32yiR">确认合作</button></div>
														<div class="apply-remark-container-2oywv">
															<div class="remark-content-3NGJX not-editing-2HMKL">
																<div class="button-container-3SQdA"><button class="button-3791w add-remark-9IKB1 link-1Omym"><span class="fa fa-pencil"></span>react-text: 358 添加备注/react-text<br><small>备注信息不会显示给开发者</small></button></div>
																</div>
														</div>
													</div>
												</div>
											</div> -->
											
											<!--渲染申请者信息  -->
											<c:forEach items="${applys }" var="apply"> 
											<div class="recruit-item-1hMhx">
												<div class="item-content-3nk3o">
													<div class="left-column-260cz">
														<div><img class="apply-avatar-1QsRa" src="${apply.photoUrl }" ></div>
														<div>
															<!-- react-empty: 371 -->
														</div>
													</div>
													<div class="mid-column-ZqSKz">
														<div class="apply-name-2_o6s">${apply.realName }&nbsp;
															<span class=""><svg data-tip="true" data-for="developerIcon-149608" name="#authCard_ddab5e98eb905c732e8602eea4278041" class="icon" style="width: 16px; height: 16px;" currentItem="false">
															<use xlink:href="#authCard_ddab5e98eb905c732e8602eea4278041"></use></svg>
															<div class="__react_component_tooltip place-top type-dark " data-id="tooltip"></div>
															<span class="vip-icon-xS1KS"><!-- react-empty: 381 -->
															<div class="__react_component_tooltip place-top type-dark " data-id="tooltip"></div></span></span>
															<span class="apply-location-2MaNx"><i class="fa fa-map-marker"></i>
															${apply.provinceName} &nbsp; ${apply.cityName} </span></div>
														<div class="apply-info-2Yrp3">独立开发者&nbsp;|&nbsp;${apply.workStatus }</span>&nbsp; |&nbsp;
															<strong>评分</strong>&nbsp;
															<div class="star-label-1JKFb evaluation-star-NB8Dr">
																<span><i class="fa fa-star"></i></span>
																<span><i class="fa fa-star"></i></span>
																<span><i class="fa fa-star"></i></span>
																<span><i class="fa fa-star-o"></i></span>
																<span><i class="fa fa-star-o"></i></span>
															</div>3
														</div>
														<div class="apply-message-2EwTK">
															<span class="nowrap-knWkt">胜任理由：</span>
															<span class="message-content-25gNW">强！！！</span>
														</div>
														<div class="apply-message-2EwTK"><span class="nowrap-knWkt">联系方式：<%--  ${user.telephone } --%> </span>
															<!-- react-empty: 413 --><button class="button-3791w link-1Omym">${apply.telephone }</button></div>
														<div class="apply-message-2EwTK">报名时间：${apply.difftime }前
														</div>
														<div class="apply-message-2EwTK">
															<!-- react-text: 419 -->申请资料：
															<!-- /react-text --><button class="button-3791w link-1Omym">查看</button></div>
													</div>
													<div class="column-divider-ifaAG"></div>
													<div class="right-column-1oumq">
														<div class="apply-action-3LuMe">
															<div class="apply-mark-container-3zpxq">
																<div class="apply-mark-1cmFq apply-nomark-kp1TB" data-tip="true" data-for="markedIcon-149608" currentitem="false">
																	<img class="apply-unmark-Mr7lN" src="data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAACoAAAAqCAYAAADFw8lbAAAAAXNSR0IArs4c6QAAA6NJREFUWAntWEtMU0EUvTOvgIoBfxujxIWoW4mAcaVGjRFdaFBwoa6MFRYkGkUw/hZGWne6qMUlEgMtcWVd+YnBmBhjTHRljAaMEWMwhtIiv871PO0r9flap1hg4RsyzP313sOZeW9uIXLHf8qAyPZ3+4Khk8R8CTGRonmFDeNjE9uZeAsrrhRCrIG9lJiGSdB7yC8w7xvFiyKnj+yMQ87ryA400BVjomKzIoAlmNnQqB6VktqVWtjW2rjnm0Y8uGCJ/CpbbFagbYEu4JzeQOEvJPgyCdnR4q0bsmcBOHE1GK7CDjVD3gcqbrY21jfY4yw9Z6AA8AHoewXzOyHFKLa+kJnKWdBWULPCSmytQtAEQLyE/h6gTNkjiJdjrQDA0lQcie8tjfULLN2+euyGTLog8UiSvNjccKDXKcZkyBcMbxWkzgL4NisGcgERV0M3JwbgJtefS/IXrPPTdbusDZQ88lzzsQNP7QksHUyb9R+a09ce2s0JdR7yRsv/r6s+0Bwq4UxGEB7xB0Lr8EbYwazW468ow66YWzsB9gYhvyLJQ6zouk7qGQFqFT7TWPcGsjkdhy8Q3kWUcPTZjdJumE1dSpX1YU7HMqdA04H8TZ5ToApP4N8AWv45BWqB0FnnFCiOqMuozi5pxyih/9RP6z16vfNeyXgstlIpsVR6EqMGF3w84a0d0EY4jUBtoEKpzb4b3UfMezwejZZbtRKTuGrw0xbo/ooD14ubtGf+qpKeppqaMSsm0wpCce/+uvkzxVh27YdJKb6CxsOLpiIF0krya+WlKLpXMXXG+6Jv/cHQ/t/9f2pmF/qn1dmizajzxzNay5RSYbD8XEi+xex5Qjyvr2jZyOhK3JmfhooWjydGNyhOXMyYwebIFWg/3tF3QMQzVqpfFnhGJifJMIhXKFKbwHY9jsbqqRpchaajigjng2I0Nkj07qfz+1RIUgK36FUzD22gUoqzzd46P4A6fWUwG+O7OBrn/e3dhwDuMvSyzGUdPCyuOVhTJu0zylI+zgAylcz0txw/2LHEKF+N7v8wWHqATt6k03Gg1fuMmBuGR1aguz/tGJQ0ajOaLYnd5/VWmtvYaU7zVRaPDldLyWvxHa6EhIoLkgOk6HWyDbR/3FGfEaDplZoO1USh30/OdFdOsvbW55R1BoJdoPkm1WXUZTTfDOQ7n3tGXUadGEBXm/rPsSFEzClmtmzZz6iUFwAkig7n9qmjta9nC5Rbx2UgjYEflOk4jVkphdEAAAAASUVORK5CYII=">
																	<img class="apply-marked-3z735" src="data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAAC4AAAAuCAYAAABXuSs3AAAAAXNSR0IArs4c6QAAAlpJREFUaAXtmT1oU1EUx885L/Wr0oqbiFO1e6EW3BwEQVxESByqkxCbwaHYmgqKQ6G2mw61dSxFqoKTdaqDo4M4dHIpdFJcxLRRtPEe/0/TkD5yw33hXSl6L9zcez7euX9+ecM9CVEYgUAgsCsJsIuqe3NPR0n1LnKX9+7bM/Lj+9YZJT2tRgeZ+QT8vaS0QUxr2L/FXIm6Dy2PXTlbxd7LcBM+u7SpRN2xAgj9qaqRg5qKCM0bc3BqonT+s0M+2KigvnHJdRI+NbsE3Z0NCPlErJPEslAu5r8kq0Asz8w9O4lvcBz7C0DzaKJUGEnmJW3vwrcPZKYtiHoHew0i432OSY9gHYDg3kYe8bdyqXBg27atOVsga78qdRHpEOrGEwPy6+vvpf4B7/5m27YXW2C3+4Pwv/0NBeKBuCOB8Ko4gsosLRDPDKVjoUDcEVRmaYF4ZigdC3V6rV1Hg/Ac7cobNWZdunJfazWKItKjhswpXFkLuMb2OWrYkfbn3r7D1dJILVyEb40X89OWFituFF6gMbg9Pf9kWA1Nwj7W8mSbU/m+LdTsT/2Oq8hri+hG3ThevnZp4XB0vI+FL4PiK3Q6tUZCYsPEH5HzMMrJALqfsUS4pZmaeMsqFmexOIgWjRbj+WDxZU+1sjEkov3oiXuITZVJPpCh1Zul/HtLCavbq/DmU68Pn6vAXqnP5lBH+9SvSkeneHgoCPcAtW3JQLwtHg/BQNwD1LYlA/G2eDwE/23i+C268c9CxLzpAWDqkm7ERe6gcgU3uMc3rl5cTX1KeCAQCAT+HwK/AKg7m53HWJI6AAAAAElFTkSuQmCC">
																</div>
																<div class="__react_component_tooltip place-top type-dark " data-id="tooltip"></div>
															</div>
															<!--不合适，将本条apply记录中的state置为3已拒绝  -->
															<!--确认合作，将本条apply记录中的state置为2已通过    !!!!注通过时将项目状态置为开发中-->
															<c:if test="${apply.state == 1 }">
															<a href="ApplyServlet?way=updateState&applyId=${apply.id }&state=3&itemId=${item.id}">
															<button class="button-3791w danger-3ddVW">不合适</button></a>
															<a href="ApplyServlet?way=updateState&applyId=${apply.id }&state=2&itemId=${item.id}">
															<button class="button-3791w primary-32yiR">确认合作</button></a>
															</c:if>
															<c:if test="${apply.state == 2 }">
															<button class="button-3791w primary-32yiR">已开始合作</button>
															</c:if>
															<c:if test="${apply.state == 3 }">
															<button class="button-3791w danger-3ddVW">已拒绝</button>
															</c:if>
															<c:if test="${apply.state == 4 }">
															<button class="button-3791w danger-3ddVW">对方已取消</button>
															</c:if>
															<c:if test="${apply.state == 5 }">
															<button class="button-3791w danger-3ddVW">已取消需求</button>
															</c:if>
															</div>
														<div class="apply-remark-container-2oywv">
															<div class="remark-content-3NGJX not-editing-2HMKL"  style="position:relative;">
																<div class="button-container-3SQdA" id="notearea">
																	<p style="position:absolute;left: 5px;top:5px;">${apply.note }</p>
																	<button class="button-3791w add-remark-9IKB1 link-1Omym" data-applyId="${apply.id }" style="position: absolute;top:90px;">
																		<span class="fa fa-pencil"></span>添加备注<br>
																		<small>备注信息不会显示给开发者</small>
																	</button>
																</div>
															</div>
														</div>
													</div>
												</div>
											</div>
											</c:forEach>
											
										</div><span style="display: none;"></span>
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
	<script src="js/codemart-contact-us-v1.0.0.js"></script>
	<script src="jsmy/projectStatus.js"></script>
</body>

</html>