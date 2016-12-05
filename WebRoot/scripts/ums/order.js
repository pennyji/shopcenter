$(function(){
	
//	alert("ok~");
	$("#submitOrder").click(function(){
		
		var productids = "";
		$(".pid").each(function(){
			var pid = $(this).val();
			productids = productids + ";" + pid;	
		});
		
		var name = $("#name").val();
		var phone = $("#phone").val();
		
		var str = $(this).prev().html();
		
		var sum =str.substring(str.indexOf(":")+1,str.indexOf("元"));
		var address = $("#address").val();
		$.ajax({
			url:_path + "/oms/order/toGenerateOrder",
			data:{"productids":productids,"name":name,"phone":phone,"address":address,"sum":sum},
			type :"post",
			dataType:"json",
			success:function(){
				window.location = _path + "/oms/order/toOrderSuccess";
			}
		});
		
	});
	
});

