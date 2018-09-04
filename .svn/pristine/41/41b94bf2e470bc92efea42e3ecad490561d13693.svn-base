$(function(){

	//页面加载完将地址加载进来
	$.get("AddressServlet",
			{"way":"getProvinces"},
			function(response){
				if(response.code == 1){
					$("#cityCode option:gt(0)").remove();
					$("#countyCode option:gt(0)").remove();
					var provinces = response.provinces;				
					$.each(provinces,function(i,province){
						var provinceId = province.id;
						var name = province.name;
						$("#provinceCode").append(
								"<option value='"+provinceId+"'>" + name
								+ "</option>");
					});
					var pid = $("#province").val();
					console.log(pid);
					if(pid){
					 $("#provinceCode>option[value='" + pid + "']").attr("selected","selected");
					 var cid = $("#city").val();
					 console.log(cid);
					 var ctid = $("#county").val();
					 console.log(ctid);
				    getCitySelected(pid,cid);
				    getCountySelected(cid,ctid);
					}
				}else{
					alert(response.msg);
				}
			},
	'json');
	
	//根据省响应市
	$("#provinceCode").change(function(){
		var provinceId = this.value;
		//改变字体颜色
		$(".select").css("color","#999");
		//获取到省Id，发送ajax请求获取所有市
		$.get("AddressServlet",
				{"way":"getCitysByProvinceId","provinceId":provinceId},
				function(response){
					$("#cityCode option:gt(0)").remove();
					$("#countyCode option:gt(0)").remove();
					if(response.code == 1){
						var citys = response.citys;
						$.each(citys,function(i,city){
							var cityId = city.id;
							var cityname = city.name;
							$("#cityCode").append(
									"<option value='"+cityId+"'>" + cityname
									+ "</option>");
	
						});
					}else{
						alert(response.msg);
					}
				},
		'json');
	});
	
	$("#cityCode").change(function(){
		var cityId = this.value;
		//获取到省Id，发送ajax请求获取所有市
		$.get("AddressServlet",
				{"way":"getCountysByCityId","cityId":cityId},
				function(response){
					$("#countyCode option:gt(0)").remove();
					if(response.code == 1){
						var countys = response.countys;
						$.each(countys,function(i,county){
							var countyId = county.id;
							var countyName = county.name;
								$("#countyCode").append(
										"<option value='"+countyId+"'>" + countyName
										+ "</option>");
						});
					}else{
						alert(response.msg);
					}
				},
		'json');
	});
	
})

//根据省份id获取城市,并将指定的id的城市选中
function getCitySelected(provinceId,cityId) {
	
	$("#cityCode option:gt(0)").remove();
	$("#countyCode option:gt(0)").remove();
	
	$.getJSON(
			"AddressServlet",
			{"provinceId":provinceId,"way":"getCitysByProvinceId"},
			function(response){
				if(response.code == 1) {
					$(response.citys).each(function(){
						// 获取城市的id和name
						var id = this.id;
						var name = this.name;
						$("#cityCode").append("<option value='"+id+"'>"+name+"</option>");
					});
					$("#cityCode>option[value='" + cityId + "']").attr("selected","selected");
				}else {
					alert(response.msg);
				}
			}
		);
};

//根据城市id获取区县,并将指定的区县id的选中
function getCountySelected(cityId,countyId) {
	// 当城市发生改变以后，需要将原先的所有的县清除掉
	$("#countyCode option:gt(0)").remove();
	
	// 发送请求获取区县的信息
	$.getJSON("AddressServlet",{
			"cityId":cityId,"way":"getCountysByCityId"},
			function(response){
				if(response.code == 1) {
					$(response.countys).each(function(){
						$("#countyCode").append("<option value='"+this.id+"'>"+this.name+"</option>");
					});
					$("#countyCode>option[value='" + countyId + "']").attr("selected","selected");

				}else {
					alert(response.msg);
				}
			}
		);
}







//修改事件，隐藏原先显示邮箱，显示修改框，取消确定按钮
$("#upemail").click(function(){
	$("#email_view").css("display","none");
	$("#email_input").css("display","inline-block");
	$("#upemail").css("display","none");
	$("#email_edit").css("display","inline-block");
	
});
//取消事件，显示原来邮箱，隐藏修改框，取消确定按钮
$("#cancel").click(function(){
	$("#email_view").css("display","inline-block");
	$("#email_input").css("display","none");
	$("#upemail").css("display","inline-block");
	$("#email_edit").css("display","none");
	//判断是否有值了，显示是否验证

	
});
//确定事件，显示更改的邮箱，隐藏修改框，取消确定按钮,并且ajax传参修改用户email
$("#confirm").click(function(){
	$("#email_view").css("display","inline-block");
	$("#email_input").css("display","none");
	$("#upemail").css("display","inline-block");
	$("#email_edit").css("display","none");
	var email = $("#inputemail").val();
	$("#realemail").text(email);
	//判断是否有值了，显示是否验证

	$.post("UserInfoServlet",
			{"way":"updateUseremail","email":email},
			function(response){
				location.reload();
			},
			'json'
	);
});

//修改事件，隐藏原先显示telephone，显示修改框，取消确定按钮
$("#uptelephone").click(function(){
	$("#telephone_view").css("display","none");
	$("#telephone_input").css("display","inline-block");
	$("#uptelephone").css("display","none");
	$("#telephone_edit").css("display","inline-block");
	
});
//取消事件，显示原来telephone，隐藏秀概况，取消确定按钮
$("#canceltelephone").click(function(){
	$("#telephone_view").css("display","inline-block");
	$("#telephone_input").css("display","none");
	$("#uptelephone").css("display","inline-block");
	$("#telephone_edit").css("display","none");
	
});
//确定事件，显示更改的telephone，隐藏修改框，取消确定按钮 并且ajax传参修改用户phone
$("#confirmtelephone").click(function(){
	$("#telephone_view").css("display","inline-block");
	$("#telephone_input").css("display","none");
	$("#uptelephone").css("display","inline-block");
	$("#telephone_edit").css("display","none");
	var telephone = $("#inputtelephone").val();
	$("#realtelephone").text(telephone);
	$.post("UserInfoServlet",
			{"way":"updateUserphone","telephone":telephone},
			function(response){
				location.reload();
			},
			'json'
	);
});




//上传头像
function preview(file) {
	var url;
    if (file.files && file.files[0]) {
        var reader = new FileReader();
        reader.onload = function(evt) {
        	url = evt.target.result;
            $("#img").attr("src",evt.target.result);
        }
        reader.readAsDataURL(file.files[0]);
    } else {
    	 $("#img").attr("src","img/headImg.png");
    }
    console.log(url);
}
