
$(function(){
	var registerMsg = $("#registerMsg").text();
	if(registerMsg){
		alert(registerMsg);
	}
	$("#btn_sub").css("display","none");
})

$("#agree").change(function(){
	if($("#agree").is(':checked')){
		$("#btn_sub").css("display","block");
	}else{
		$("#btn_sub").css("display","none");
	}
});

//根据选择的开发者/需求者按钮，确定类型
$("#usertype>label").click(function(t){
	var type = $(t.currentTarget).attr("data-usertype");
	$("#type_input").val(type);
	$("#usertype").css("display","none");
	$("#register_input").css("display","block");
	if(type == 0){//显示第一个
		$("#register_input>div:eq(1)").css("display","none");
	}else{//显示第二个
		$("#register_input>div:eq(0)").css("display","none");
	}
});

$("#agree").click(function(){
	var test = $("#agree").val();
	console.log(test);
})

//返回选择用户类型
$("#backselect").click(function(){
	$("#register_input>div:eq(0)").css("display","block");
	$("#register_input>div:eq(1)").css("display","block");
	$("#usertype").css("display","block");
	$("#register_input").css("display","none");
});

//验证输入的账号数据库中是否存在
$("#username").change(function(){
	var username = this.value;
	$.get("UserServlet",
			{"username":username, "way":"checkUsername"},
			function(response){
				
				if(response =="1") {
					// 可用
					$("#userMsg").css("display","none");
					// 让提交按钮可用
					$("#btn_sub").attr("disabled",false);
				}else {
					// 不可用
					$("#userMsg").css("display","block");
					// 让提交按钮不可用
					$("#btn_sub").attr("disabled",true);
				}
			},
			"text"
	);
});

//验证输入手机号是否存在
$("#phone").change(function(){
	var phone = this.value;
	$.get("UserServlet",
			{"telephone":phone, "way":"checkTelephone"},
			function(response){
				
				if(response =="1") {
					// 可用
					// 让提交按钮可用
					$("#btn_sub").attr("disabled",false);
					$("#sendCode").removeClass("buttonDisabled-m6ivW");
				}else {
					// 不可用
					// 让提交按钮不可用
					$("#sendCode").addClass("buttonDisabled-m6ivW");
					$("#btn_sub").attr("disabled",true);
				}
			},
			"text"
	);
});




//判断两次密码是否一致
$("#repassword").change(function(){
	var pwd = $("#password").val();
	var repwd = $("#repassword").val();
	if(pwd == repwd){
		//密码一致
		$("#checkPwdMsg").css("display","none");
		$("#btn_sub").attr("disabled",false);
	}else{
		$("#checkPwdMsg").css("display","block");
		// 让提交按钮不可用
		$("#btn_sub").attr("disabled",true);
	}
});


//显示验证码
$("#sendCode").click(function(){
	$("#code").css("display","inline-block");
	setTimeout(function(){
		$("#code").css("display","none");
	},3000);
})