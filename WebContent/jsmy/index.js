
$(function(){
	$.get("StatisticServlet",
			{"way":"getSum"},
			function(response){
				$("#sum").text(response.money);
				$("#items").text(response.items);
				$("#developers").text(response.developers);
		},
		"JSON");
})
