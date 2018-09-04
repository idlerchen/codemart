$(function(){
	var type = 0;
	var id = $("#gettype").attr("data-type");
	$("#gettype li").eq(id-1).addClass("current-mtEW0");
	type = $(".current-mtEW0").length;

	//页面加载将下拉框加载， +如果是修改的回显，选中数据库中已有的选项
	var u_industry = $("#getindustry").attr("data-industry");
	var u_role = $("#getrole").attr("data-role");
	console.log(u_industry);
	$.get("ItemServlet",
			{"way":"getIndustrys"},function(response){
				if(response.code == 1){
					var industrys = response.industrys;
					$.each(industrys,function(i,industry){	
						$("#industry").append("<option value='"+industry.id+"'>"+industry.name+"</option>");
					})	
				}
				//回显项目已选的行业
				$("#industry option[value='"+u_industry+"']").attr("selected",true);
			}
	)
	$("[name=roleId][value='"+u_role+"']").attr("checked",true);
})

//项目类型
$(".type-2izPn").click(function(){
	//选中的开发类型显示边框	
	$(this).addClass("current-mtEW0");
	//其他类型取消边框
	$(this).siblings().removeClass("current-mtEW0");
	//获取选中的开发类型的值
	type = $(this).children().children().last().val();
});
//角色
$(".developer-checkbox-wHeLc").change(function(){
	//选择角色，将其他选项清空。这个傻屌网站既然要单选搞个多选框干毛
	$(this).siblings().children().children().children().removeAttr("checked");
	roleId = $(this).siblings().children().children().children().val();
})

//校验
function validate(){
	if(type==0){
		$(".toast-message").html("请选择开发类型");
		errormsg();	
		return false;	
	}
}


