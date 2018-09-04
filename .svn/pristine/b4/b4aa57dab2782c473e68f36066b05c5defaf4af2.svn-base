<%@ page language="java" contentType="text/html; charset=UTF-8"  pageEncoding="UTF-8"%>
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
	<%@ include file="/page/base/svgstyle.jsp"%>
	<%@ include file="/page/base/base.jsp"%>
	
</head>

	<body>
		<%@include file="/page/base/svg.jsp"%>
		<div id="container" style="height: 100%;">
			<div data-reactroot="" style="height: 100%;">
				<!-- react-empty: 3 -->
				<div class="container-1weyJ">
					<%@include file="/page/base/header.jsp"%>
					<div class="content-wrapper-Ssu-q">
						<div class="publish-container-1HGT9">
							<div class="publish-layout-36qrT">
								<div class="left-zone-SkmeB">
									<div class="zone-container-TZ2Oi">
										<form action="ItemServlet?way=updateItem&id=${item.id }" method="POST" onsubmit="return validate();">
										<div class="form-container-1KbJe">
											<div id="type">
												<div class="form-title-1uBG7" >选择您的开发类型</div>
												<div class="types-3nBQo clearfix visible" id="gettype" data-type="${item.itemtype }">
													<ul>
														<li class="column-type type-2izPn" title="Web 网站"><label for="type-WEB"><svg class="icon" name="#typeWeb_715e1daeba82bc5de7be5c8f37254532" width="42" height="42" style="width: 42px; height: 42px;"><use xlink:href="#typeWeb_715e1daeba82bc5de7be5c8f37254532"></use></svg><em class="ellipsis">Web 网站</em><input type="checkbox" id="type-WEB" name="itemtype" value="1"></label></li>
														<li class="column-type type-2izPn" title="App 开发"><label for="type-APP"><svg class="icon" name="#typeApp_c567eeea20808ca13868e7f45c8d99de" width="42" height="42" style="width: 42px; height: 42px;"><use xlink:href="#typeApp_c567eeea20808ca13868e7f45c8d99de"></use></svg><em class="ellipsis">App 开发</em><input type="checkbox" id="type-APP" name="itemtype" value="2"></label></li>
														<li class="column-type type-2izPn" title="微信公众号"><label for="type-WECHAT"><svg class="icon" name="#typeWechat_858f44809f0c19ec228f04d9fc911855" width="42" height="42" style="width: 42px; height: 42px;"><use xlink:href="#typeWechat_858f44809f0c19ec228f04d9fc911855"></use></svg><em class="ellipsis">微信公众号</em><input type="checkbox" id="type-WECHAT" name="itemtype" value="3"></label></li>
														<li class="column-type type-2izPn" title="小程序"><label for="type-WEAPP"><svg class="icon" name="#typeWeapp_74dafd2bc758683543fa79a8768ee3f5" width="42" height="42" style="width: 42px; height: 42px;"><use xlink:href="#typeWeapp_74dafd2bc758683543fa79a8768ee3f5"></use></svg><em class="ellipsis">小程序</em><input type="checkbox" id="type-WEAPP" name="itemtype" value="4"></label></li>
														<li class="column-type type-2izPn" title="HTML5 应用"><label for="type-HTML5"><svg class="icon" name="#typeHtml5_f4f8390d7ed48ceab28f8ed730084682" width="42" height="42" style="width: 42px; height: 42px;"><use xlink:href="#typeHtml5_f4f8390d7ed48ceab28f8ed730084682"></use></svg><em class="ellipsis">HTML5 应用</em><input type="checkbox" id="type-HTML5" name="itemtype" value="5"></label></li>
														<li class="column-type type-2izPn" title="其它项目"><label for="type-OTHER"><svg class="icon" name="#typeOther_7ae41763040112179377332a00b2f44e" width="42" height="42" style="width: 42px; height: 42px;"><use xlink:href="#typeOther_7ae41763040112179377332a00b2f44e"></use></svg><em class="ellipsis">其它项目</em><input type="checkbox" id="type-OTHER" name="itemtype"  value="6"></label></li>
													</ul>
												</div>
											</div>
											<div class="developer-type-2OQ8r" id="developerType">
												<div class="form-title-1uBG7" id="getrole" data-role=${item.roleId }>选择您招募的开发者类型</div>
												<div>
													<div class="ant-radio-group">
														
														<div class="radio-label-3Bjgj">
															<div class="radio-title-2OKqu"><label class="radio-2ZfaK large-3IyYX ant-radio-wrapper"><span class="ant-radio"><input type="radio" class="ant-radio-input" value="on" checked="checked"><span class="ant-radio-inner"></span></span><span>招募个人</span></label></div>
															<div class="radio-tip-2_H8W">个人项目金额必须低于 50,000 元</div>
														</div>
													</div>
													<div class="developer-type-box-3uG5r clearfix dropdown-rHKo-">
														<div class="multi-tip-21SVc">如果要招募多个角色，请发多个项目</div>
														<div class="ant-checkbox-group" id="roleArea">
															<div class="developer-checkbox-wHeLc"><label class="checkbox-3Bx_n large-B-ppK ant-checkbox-wrapper"><span class="ant-checkbox"><input type="checkbox" class="ant-checkbox-input" name="roleId" value="12"><span class="ant-checkbox-inner"></span></span><span>项目经理</span></label></div>
															<div class="developer-checkbox-wHeLc"><label class="checkbox-3Bx_n large-B-ppK ant-checkbox-wrapper"><span class="ant-checkbox"><input type="checkbox" class="ant-checkbox-input" name="roleId" value="14"><span class="ant-checkbox-inner"></span></span><span>产品经理</span></label></div>
															<div class="developer-checkbox-wHeLc"><label class="checkbox-3Bx_n large-B-ppK ant-checkbox-wrapper"><span class="ant-checkbox"><input type="checkbox" class="ant-checkbox-input" name="roleId" value="13"><span class="ant-checkbox-inner"></span></span><span>设计师</span></label></div>
															<div class="developer-checkbox-wHeLc"><label class="checkbox-3Bx_n large-B-ppK ant-checkbox-wrapper"><span class="ant-checkbox"><input type="checkbox" class="ant-checkbox-input" name="roleId" value="9"><span class="ant-checkbox-inner"></span></span><span>Android开发</span></label></div>
															<div class="developer-checkbox-wHeLc"><label class="checkbox-3Bx_n large-B-ppK ant-checkbox-wrapper"><span class="ant-checkbox"><input type="checkbox" class="ant-checkbox-input" name="roleId" value="8"><span class="ant-checkbox-inner"></span></span><span>iOS开发</span></label></div>
															<div class="developer-checkbox-wHeLc"><label class="checkbox-3Bx_n large-B-ppK ant-checkbox-wrapper"><span class="ant-checkbox"><input type="checkbox" class="ant-checkbox-input" name="roleId" value="6"><span class="ant-checkbox-inner"></span></span><span>前端开发</span></label></div>
															<div class="developer-checkbox-wHeLc"><label class="checkbox-3Bx_n large-B-ppK ant-checkbox-wrapper"><span class="ant-checkbox"><input type="checkbox" class="ant-checkbox-input" name="roleId" value="7"><span class="ant-checkbox-inner"></span></span><span>后端开发</span></label></div>
															<div class="developer-checkbox-wHeLc"><label class="checkbox-3Bx_n large-B-ppK ant-checkbox-wrapper"><span class="ant-checkbox"><input type="checkbox" class="ant-checkbox-input" name="roleId" value="11"><span class="ant-checkbox-inner"></span></span><span>全栈开发</span></label></div>
															<div class="developer-checkbox-wHeLc"><label class="checkbox-3Bx_n large-B-ppK ant-checkbox-wrapper"><span class="ant-checkbox"><input type="checkbox" class="ant-checkbox-input" name="roleId" value="10"><span class="ant-checkbox-inner"></span></span><span>微信应用开发</span></label></div>
															<div class="developer-checkbox-wHeLc"><label class="checkbox-3Bx_n large-B-ppK ant-checkbox-wrapper"><span class="ant-checkbox"><input type="checkbox" class="ant-checkbox-input" name="roleId" value="15"><span class="ant-checkbox-inner"></span></span><span>测试工程师</span></label></div>
														</div>
													</div>
												</div>
											</div>
											
											<div class="form-item-3JClL" id="name">
												<div class="form-item-content-2qXWl">
													<div class="form-label-2oVVe">项目名称</div>
													<div class="form-input-3zb0m">
														<div class="form-input-content-1jr_Y">
															<div><input type="text" maxlength="30" placeholder="30 字符以内" name="name" class="input-DvJ_0 block-1EHlh" value="${item.name }"></div>
														</div>
													</div>
												</div>
											</div>
											<div class="form-item-3JClL">
												<div class="form-item-content-2qXWl">
													<div class="form-label-2oVVe" id="getindustry" data-industry=${item.industryId }>项目行业</div>
													<div class="form-input-3zb0m">
														<div class="form-input-content-1jr_Y">	
															<div>
															<select id="industry" name="industryId">
																<option>请选择</option>															
															</select>
																<!-- <div class="industry-input-6c7z1">
																	<div class="Select Select--multi is-searchable is-open is-focused">
																		
																		<input type="hidden"  value="" name="industryId">
																		
																		<div class="Select-control">
																			<div class="Select-placeholder">行业信息</div>
																			<div class="Select-input " style="display: inline-block;">
																				<input  tabindex="0" style="width: 5px; box-sizing: content-box;"  value="">
																				<div style="position: absolute; visibility: hidden; height: 0px; width: 0px; overflow: scroll; white-space: pre; font-size: 14px; font-family: &quot;PingFang SC&quot;, &quot;Helvetica Neue&quot;, Helvetica, &quot;Hiragino Sans GB&quot;, Arial, &quot;Microsoft YaHei&quot;, &quot;\\5FAE软雅黑&quot;, sans-serif; font-weight: normal; font-style: normal; letter-spacing: normal;">
																					
																				</div>
																			</div>
																			
																			
																			<span class="Select-arrow-zone">
																				<span class="Select-arrow"></span>
																			</span>
																			
																		</div>
																	</div>
																</div> -->
															</div>
															<!-- react-empty: 277 -->
														</div>
													</div>
												</div>
											</div>
											<div class="form-item-3JClL" id="price">
												<div class="form-item-content-2qXWl">
													<div class="form-label-2oVVe">项目预算</div>
													<div class="form-input-3zb0m">
														<div class="form-input-content-1jr_Y">
															<div><input type="text" name="money" value="${item.money }" maxlength="7" placeholder="个人项目金额≦ ¥50,000" class="input-DvJ_0 mid-input-idDSz" id="moneyinput"><span class="unit-1Abif">元</span><span class="bargain-3OiAD">
																</span>
															</div>
															<div class="placeholder-29k6o">
																<div>该项目金额不含税，如需发票，请<a target="_blank" href="https://codemart.com/help/question/16">查看操作文档</a>
																</div>
															</div>
														</div>
													</div>
												</div>
											</div>
											<div class="form-item-3JClL" id="duration">
												<div class="form-item-content-2qXWl">
													<div class="form-label-2oVVe">期望交付周期</div>
													<div class="form-input-3zb0m">
														<div class="form-input-content-1jr_Y">
															<div><input type="text" name="period" value="${item.period }" maxlength="7" placeholder="请输入交付周期" class="input-DvJ_0 mid-input-idDSz" id="periodinput"><span class="unit-1Abif">天</span></div>
														</div>
													</div>
												</div>
											</div>
											<div class="form-item-3JClL" id="description">
												<div class="form-item-content-2qXWl">
													<div class="form-label-2oVVe top-2yEeC">项目描述</div>
													<div class="form-input-3zb0m">
														<div class="form-input-content-1jr_Y">
															<div><textarea id="detailinput" class="ant-input textarea-1WPnK" type="textarea" rows="4" placeholder="请尽量详细描述您的项目，以吸引更多有相关开发经验的开发者报名（20 个字符以上）" name="detail" style="height: 94px; min-height: 94px; overflow-y: hidden;">${item.detail }</textarea>
																<div class="publish-example-1z4sk">
																	<div class="example-label-32aCY"><label></label><span class="open-o4Qdj"><i class="fa fa-angle-double-down"></i><!-- react-text: 318 -->查看范例<!-- /react-text --></span></div>
																	<div class="example-content-21mhF" style="display:none"><p><strong>简介</strong><!-- react-text: 1980 -->本项目是理财产品的手机&nbsp;APP&nbsp;开发,旨在为⽤用户提供便利的⼿机端理财产品； 产品主要功能为购买、交易理财产品。<!-- /react-text --></p><p><strong>功能需求</strong><!-- react-text: 1983 -->适配&nbsp;iPhone 4s&nbsp;及以上&nbsp;iPhone&nbsp;设备， iOS7.0&nbsp;及以上版本。功能包含： 启动引导页、账户功能、交易功能、收益计算器、银行卡绑定、消息通知与推送<!-- /react-text --></p><p><strong>APP 架构</strong><!-- react-text: 1986 -->APP&nbsp;主要有“热门推荐”、“理财超市”、“我的资产”、“更多”等页面：<!-- /react-text --><br><!-- react-text: 1988 -->[热门推荐] - 包含消息中心、轮播广告位、产品推荐等功能；<!-- /react-text --><br><!-- react-text: 1990 -->[理财超市] - 包含由分段控制切换的三个页面，三个页面为三种不同类型产品的列表， 点击进入产品详情页；<!-- /react-text --><br><!-- react-text: 1992 -->[我的资产] - 包含收益展示、图标展示资产明细、交易记录、银行卡管理、取现等功能。<!-- /react-text --></p></div>
																</div>
																<div>
																	<div class="sub-label-1Xw6E">
																		<!-- react-text: 321 -->参考网站或应用
																		<!-- /react-text --><small>（选填）</small></div>
																	<div class="sample-link-1J0FZ">
																		<div class="input-box-2x92T"><input type="text" name="refer" value="${item.refer }" placeholder="请输入网址或应用名称" class="input-DvJ_0"><label class="no-3Baem">1</label></div>
																	</div>
																	<div class="sample-link-1J0FZ">
																		<div class="input-box-2x92T"><input type="text" name="secondSample" value="" placeholder="请输入网址或应用名称" class="input-DvJ_0"><label class="no-3Baem">2</label></div>
																	</div>
																</div>
															</div>
														</div>
													</div>
												</div>
											</div>
											<div class="form-item-3JClL" id="files">
												<div class="form-item-content-2qXWl">
													<div class="form-label-2oVVe top-2yEeC"><span>相关文档<small>（选填）</small></span></div>
													<div class="form-input-3zb0m">
														<div class="form-input-content-1jr_Y">
															<div>
																<div class="file-upload-2P448 light-style-1VBNZ" tabindex="-1"><label class="upload-button-3AI2Y dz-clickable"><span><i class="fa fa-plus-circle"></i><!-- react-text: 346 -->&nbsp;<!-- /react-text --><!-- react-text: 347 -->上传文件<!-- /react-text --></span><div class="progress-3RZY7" style="width: 0%;"></div></label></div>
															</div>
															<div class="placeholder-29k6o">请上传您可以公开的的项目文档，例如产品的需求文档、设计稿、概念视频等，20 MB 以内</div>
														</div>
													</div>
												</div>
											</div>
											<div class="form-item-3JClL" id="rewardDemand">
												<div class="form-item-content-2qXWl">
												<!-- 没有这个字段 -->
													<div class="form-label-2oVVe top-2yEeC">招募要求<small>（选填）</small></div>
													<div class="form-input-3zb0m">
														<div class="form-input-content-1jr_Y">
															<div><textarea class="ant-input textarea-1WPnK" type="textarea" rows="4" name="rewardDemand" placeholder="您可以对开发者所在地区、从事行业、擅长技能等方面提出要求" style="height: 94px; min-height: 94px; overflow-y: hidden;"></textarea>
																<div class="publish-example-1z4sk">
																	<div class="example-label-32aCY"><label></label><span class="open-o4Qdj"><i class="fa fa-angle-double-down"></i><!-- react-text: 362 -->查看范例<!-- /react-text --></span></div>
																	<div class="example-content-21mhF" style="display:none"><p><!-- react-text: 1948 -->1. 有&nbsp;O2O、移动商城相关产品开发经验；<!-- /react-text --><br><!-- react-text: 1950 -->2. 精通&nbsp;Java 或 PHP，熟悉&nbsp;jQuery、 JavaScript、Maven、Redis&nbsp;等技术，熟练使用&nbsp; MySQL、Oracle、SQLServer 等关系型数据库，熟悉 NoSQL&nbsp;数据库如&nbsp;mongo、redis 等；<!-- /react-text --><br><!-- react-text: 1952 -->3. 参与项目的开发成员需要提前全面了解项目和代码管理工具&nbsp;Coding&nbsp;的使用方法；<!-- /react-text --><br><!-- react-text: 1954 -->4. 深圳地区开发者优先；<!-- /react-text --><br><!-- react-text: 1956 -->5. 时间较为自由充裕，可以在工作日的工作时间进行沟通交流。<!-- /react-text --></p></div>
																</div>
															</div>
														</div>
													</div>
												</div>
											</div>
											<div class="form-item-3JClL">
												<div class="form-item-content-2qXWl">
													<div class="form-label-2oVVe top-2yEeC">联系信息</div>
													<div class="form-input-3zb0m">
														<div class="form-input-content-1jr_Y">
															<div>
																<div class="contact-2OFCL clearfix">
																	<div class="contact-content-1F2RU">
																		<div class="contact-item-tg0Dg">
																			<div class="sub-label-1Xw6E">您的姓名</div><input name="linkMan" value="${item.linkMan }" placeholder="姓名" class="input-DvJ_0 block-1EHlh" id="linkMan"></div>
																		<div class="contact-item-tg0Dg">
																			<div class="sub-label-1Xw6E">您的邮箱</div><input name="linkEmail" value="${item.linkEmail }" placeholder="邮箱" class="input-DvJ_0 block-1EHlh" id="linkEmail"></div>
																		<div class="contact-item-tg0Dg">
																			<div class="sub-label-1Xw6E">您的手机</div>
																			<div class="phone-2WGv-" tabindex="-1">
																				<div class="phone-content-2zkFs">
																					<div class="icon-GRoPD"><i class="cn flag X1"></i><i class="fa fa-caret-down"></i></div>
																					<div class="country-code-I4JHX">+86</div><input class="input-3fxHA" name="linkTelephone" value="${item.linkTelephone}" placeholder="手机号" id="linkTelephone"></div>
																				<div class="dropdown-2nXA-"><input type="text" placeholder="搜索">
																					<ul>			
																						<li id="cn"><i class="cn flag X1"></i><span><!-- react-text: 645 -->China<!-- /react-text --><!-- react-text: 646 --> <!-- /react-text --><!-- react-text: 647 -->+86<!-- /react-text --></span></li>
																					</ul>
																				</div>
																			</div>
																		</div>
																		<!-- 验证码，有空再做 -->
																		<!-- <div class="contact-item-tg0Dg">
																			<div class="sub-label-1Xw6E">验证码</div>
																			<div class="phone-code-3ny7t">
																				<div class="phone-code-content-LuCiA" tabindex="-1"><input name="verifyCode" value="" placeholder="验证码" maxlength="6" class="input-DvJ_0 block-1EHlh">
																					<div class="button-3lIhN" tabindex="-1">发送验证码</div>
																				</div>
																			</div>
																		</div> -->
																	</div>
																</div>
																<!-- react-empty: 1818 -->
															</div>
														</div>
													</div>
												</div>
											</div>
											<div class="form-item-3JClL" id="agree">
												<div class="form-item-content-2qXWl">
													<div class="form-label-2oVVe top-2yEeC">项目发布费</div>
													<div class="form-input-3zb0m">
														<div class="form-input-content-1jr_Y">
															<div>
																<div class="fee-nLyIu"><span class="limited-3Os9j"><span>限时免费</span></span><span class="currency-3YtvE"><span><span>¥0.0</span></span><small>/ 次</small></span><span class="origin-3IwIB"><!-- react-text: 1833 -->原价：<!-- /react-text --><span class="line-1I5pj"><span><span>¥99.0</span></span><small>/ 次</small></span>
																	</span>
																	<div class="tip-1NEls"><span> </span><span> </span></div>
																</div>
																<!-- <div class="" id="agree"><label class="checkbox-3Bx_n ant-checkbox-wrapper"><span class="ant-checkbox"><input type="checkbox" class="ant-checkbox-input""><span class="ant-checkbox-inner"></span></span><span>我同意遵守<a href="https://codemart.com/terms.html" target="_blank">《码市用户权责条款》</a></span></label>
																	react-empty: 1849
																</div> -->
															</div>
															<!-- react-empty: 1850 -->
														</div>
													</div>
												</div>
											</div>
											<div class="footer-3KelO clearfix"><span>
												<input class="button-3791w primary-32yiR" id="submitbutton" type="submit"  value="修改" style="width:100px">
											
											<!-- <button class="button-3791w primary-32yiR">发布</button> --></span></div>
										</div>
										<a id="zone-container-bottom"></a>
										<!-- 隐藏id用于传值，根据id修改项目 -->
											<%-- <input type="hidden" name="id" value="${item.id }" /> --%>
											
										</form>
									</div>
								</div>
								<!-- 右侧提示栏 -->
								<div class="right-zone-lrDrF">
									<div class="sticky-outer-wrapper">
										<div class="sticky-inner-wrapper" style="position: relative; top: 0px;">
											<div class="zone-container-TZ2Oi">
												<div class="notice-container-Hq2YB">
													<div class="title-5z_pV">码市提醒</div>
													<div class="content-YvvC8">
														<div>越详细的需求描述可以获得越多的开发者关注，您可参考以下的建议：</div>
														<ul>
															<li>
																<a href="https://mart.coding.net/help/question/5" target="_blank">1. 如何给项目估价？</a>
															</li>
															<li>
																<a href="https://mart.coding.net/help/question/126" target="_blank">2. 团队项目和个人项目的区别？</a>
															</li>
															<li>
																<a href="https://mart.coding.net/help/question/9" target="_blank">3. 项目发布后如何查看报名者信息？</a>
															</li>
															<li>
																<a href="https://mart.coding.net/help/question/20" target="_blank">4. 确定人选后如何启动项目？</a>
															</li>
														</ul>
														<div class="gray-2fD2L">
															<!-- react-text: 1875 -->更多指引请查看
															<!-- /react-text -->
															<a>帮助中心</a><br>
															<!-- react-text: 1878 -->如有疑问请
															<!-- /react-text -->
															<a>联系客服</a><br>
															<!-- react-text: 1881 -->或
															<!-- /react-text -->
															<a>邮件反馈</a>
														</div>
													</div>
												</div>
											</div>
										</div>
									</div>
								</div>
							</div>
						</div>
					</div>
					<%@ include file="/page/base/footer.jsp"%>
				</div>
			</div>
		</div>
		<!-- 错误提示 -->
		<div id="toast-container" class="toast-top-right" aria-live="polite" role="alert"><div class="toast toast-error" style="display: none;"><div class="toast-message">请选择开发类型</div></div></div>
		
		<!-- 联系我们 -->
		<!-- <script src="js/codemart-contact-us-v1.0.0.js"></script> -->
		<script src="jsmy/demandUpdate.js"></script>
		<script src="jsmy/demandUpdate.js"></script>
</body>

</html>