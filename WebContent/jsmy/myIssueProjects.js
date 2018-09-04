$(function() {
	//$("#statusarea").addClass("ant-popover-hidden");
	$(".ant-popover-open").hover(function() {
		$("#statusarea").removeClass("ant-popover-hidden");
	}, function() {
		$("#statusarea").addClass("ant-popover-hidden");
	});
	
	
	//页面加载后展示所有状态列表
	/*$.get("ItemServlet",
			{"way":"getItemStatusList"},
			function(response){
				if(response.code==1){
					var itemStates= response.itemStateList;
					$.each(itemStates,function(i,itemState){
						var id = itemState.id;
						var name=itemState.name;
						$(".ant-menu-root").append("<li class='ant-menu-item' role='menuitem'  value='"+id+"' aria-selected='false'>"+name+"</li>");
					});
				}
			},
			"json"		
	);*/
	
	var stateid = $(".ant-popover-open span:first-child").attr("data-stateId");
	if(stateid==0){
		$(".ant-popover-open span:first-child").html("所有状态");
	}else if(stateid==1){
		$(".ant-popover-open span:first-child").html("招募中");
	}else if(stateid==2){
		$(".ant-popover-open span:first-child").html("开发中");
	}else if(stateid==3){
		$(".ant-popover-open span:first-child").html("已结束");
	}else if(stateid==4){
		$(".ant-popover-open span:first-child").html("已取消");
	}
})

$(".ant-menu-root li").click(function(t){
		var stateid = $(t.currentTarget).val();
		var text = $(this).html();
		if(stateid==0){
			window.location = "ItemServlet?way=getMyItems";	
		}else{
			//var statename = $(t.currentTarget).text();	
			window.location = "ItemServlet?way=getMyitemBystate&stateid="+stateid;	
			//$(".ant-popover-open span:first-child").html(statename);
		}
		
		
})













