$(function(){
	$("#submitid").click(function(){
		var name1 = $("#price1id").val();
		name1 = $.trim(name1);
		
		var name2 = $("#price2id").val();
		name2 = $.trim(name2);
		if(name1==null||name1==""||name2==null||name2==""){
			return false
		}else {
			$("#submitid").unbind();
		}
	});
});


