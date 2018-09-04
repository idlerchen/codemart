

//添加备注
$(".button-3791w.add-remark-9IKB1.link-1Omym").click(function(){
	//$("#noteInput").css("display","block");
	var applyId = $(this).attr("data-applyId");
	
	var note =  prompt("请输入备注信息");
	
	if(note){
		$.get("ApplyServlet",
				{"way":"updateNoteByApplyId","note":note,"applyId":applyId}	,
				function(response){
					if(response.code==1){
						$("#notearea p").text(note);
					}
				},"JSON"
			);
	}
	
})


$(function(){
	var state = $("#ifdeveloping").attr("data-state");
	if(state>=2){
		$("#ifdeveloping>div:not(.metro-station-1i_60)").addClass("passed-line-2EbQh");
		$("#ifdeveloping>div:last-child").addClass("passedStation-2Rq3J");
		//$("#ifdeveloping>div.metro-station-1i_60 i").removeClass("fa-briefcase");
		//$("#ifdeveloping>div.metro-station-1i_60 i").addClass("fa-money");		
		if(state>=3){
			$("#iffinished>div:not(.metro-station-1i_60)").addClass("passed-line-2EbQh");
			$("#iffinished>div:last-child").addClass("passedStation-2Rq3J");	
		}
	}
	
})

