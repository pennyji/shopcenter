$(function(){
	
	$("#jiesuan").click(function(){
		var productids ="";
		var flag = false;
		$(":checkbox").each(function(){
			var pid = $(this).next().val();
			if(this.checked == true){
				flag = true;
				productids = productids + ";" + pid;	
			}
		});
		if(flag == false){
			alert("请至少选择一件商品进行结算");
			return false;
		}
		$.ajax({
			url:_path + "/oms/order/showOrderPage",
			data:{"pids":productids},
			type :"post",
			dataType:"json",
			success:function(result){
				if(result.list.length>0){
					window.location = _path + "/oms/order/showOrder";
				}else{
					window.location = _path + "/ums/Shoppingcar/showShoppingCart";
				}
				
			}
		});
	});
	
	$(".add").click(function(){
		$(".min").attr("disabled",false);
		$(this).prev().css("color","#000000");
		var value = $(this).prev().val();//+号这个对象的上一个html对象的值
		var number = parseInt(value)+1;
		$(this).prev().val(number);//赋值
		var num = $(this).prev().val();
		var price = $(this).next().val();
		$(this).parent().next().next().html(num*price);//计算subtotal的值
		//
		var pid = $(this).parent().next().find("input").val();
		var uid = $(this).parent().next().find('input').attr("class");
		updateTotal(number,pid,uid);
	});
	
	$(".min").click(function(){
		var value = $(this).next().val();
		var number = parseInt(value)-1;
		$(this).next().val(number);
		var num = $(this).next().val();
		if(num == "1"){
			$(this).attr("disabled",true);
			$(this).next().css("color","#bdbcbc");
		}
		var price = $(this).next().next().next().val();
		//var price = $(this).parent().prev().html();
		$(this).parent().next().next().html(num*price);
		var pid = $(this).parent().next().find("input").val();
		var uid = $(this).parent().next().find('input').attr("class");
		updateTotal(number,pid,uid);
	});
	
	//修改总价
	function updateTotal(num,pid,uid){
//		$("input:checkbox[name='item']:checked").each(function(){
//			alert(1111);
//			
//		});
		
		$.ajax({
			url:_path+"/ums/Shoppingcar/updateItem",
			data:{"number":num,"pid":pid,"uid":uid},
			dataType:"json",
			type:"post",
			success :function(result){
//				alert(result.message);
				window.location=_path+"/ums/Shoppingcar/showShoppingCart";
				
			}
			
			
		});
	}
	
});

