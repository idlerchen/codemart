$("#rem").click(function(){
	var state = $("#rem").val();
	console.log(state);
});

//错误信息动画
$(function(){
	var msg = $("#myMsg").attr("data-msg");
	if(msg== "1"){
		$(".toast-message").html("账号或者密码错误");
		errormsg();	
	}
})

function errormsg(){	
	$(".toast.toast-error").show(1000);
	$(".toast.toast-error").css("display","block");
	setTimeout(function(){
		$(".toast.toast-error").hide(1800);
	},3200);	
}