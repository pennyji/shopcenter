<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="shiro" uri="http://shiro.apache.org/tags"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="zh-cn">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>order page</title>
<head>
<jsp:include page="../common/meta.jsp" />
<jsp:include page="../common/resources.jsp" />
<script src="${path }/scripts/ums/login.js?20160811"></script>
<script type="text/javascript">
	function orderMsg(){
		var name = document.getElementById("name").value;
		var address = document.getElementById("address").value;
		var phone = document.getElementById("phone").value;
		datatype : "json";
		window.location.href = "${path}/oms/order/toGenerateOrder?name="+name+"&address="+address
				+"&phone="+phone+"&sum="+${totalMoney};
	}
</script>
<style type="text/css">
	table{text-align: center;}
</style>
</head>
<body>
	<div id="main_container">
		<jsp:include page="../common/header.jsp" />
		<div id="main_content">
			<jsp:include page="../common/menu.jsp" />
			<jsp:include page="../common/left.jsp" />
			<div class="center_content">
			
				<c:if test="${sessionScope.LOGIN_USER.id != null}">
				<h1>我的订单：</h1>
				<h2>收货人信息：</h2>
					<form action="#" method="post">
						<p>收货人姓名：<input type="text" name="${sessionScope.LOGIN_USER.name}" id="name"/></p>
						<p>收货地址：<input type="text" name="address" id="address"/></p>
						<p>联系电话：<input type="text" name="phone" id="phone"/></p>
					</form>
				<br>
				<h2>支付方式：</h2>
					货到付款
				<br><br>
				<h2>送货清单：</h2>
				<table align="center" cellpadding="10" cellspacing="0">
					<tr>
						<th>图片</th>
						<th style="width: 350px">商品</th>
						<th>单价</th>
						<th style="width:30px">数量</th>
						<th>小计（元）</th>
					</tr>
					<c:forEach items="${listcat}" var="product">
						<tr>
							<td><img src="/shopcenter/${product.image}" width="30px" height="30px"/></td>
							<td>${product.pname}</td>
							<td>${product.price}</td>
							<td>${product.number}</td>
							<td>${product.price*product.number}</td>
						</tr>
					</c:forEach>	
				</table>
				
				<div align="right">
					<h2>总 价：${sutotal}元</h2>
					<input type="button" id="button" value="提交订单" onclick="orderMsg()">
				</div>
				
				</c:if>
				
			</div>
			<!-- end of center content -->
			<jsp:include page="../common/right.jsp" />
		</div>
		<!-- end main content -->
		<jsp:include page="../common/footer.jsp" />
	</div>
</body>
</html>