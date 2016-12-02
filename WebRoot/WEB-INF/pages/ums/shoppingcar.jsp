<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="shiro" uri="http://shiro.apache.org/tags"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="zh-cn">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>my shoppingcart</title>
<head>
<jsp:include page="../common/meta.jsp" />
<jsp:include page="../common/resources.jsp" />
<script src="${path }/scripts/ums/login.js?20160811"></script>
<script src="${path }/scripts/ums/shoppingCar.js"></script>

<script type="text/javascript">
	
	$(function(){
		$("#select_All").click(function(){
			var flag = this.checked;
			$(":checkbox[name='item']").prop("checked",flag);
		});
		$(":checkbox[name='item']").click(function(){
			$("#select_All").attr("checked",$(":checkbox[name='item']").length == $(":checkbox[name='item']:checked").length);
			
		});
	});
	
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
			
				<c:if test="${sessionScope.LOGIN_USER.id == null}">
					<center>
					<h1>您好！请登录。</h1>
					<h4>登录后将显示您之前加入的商品。</h4>
					</center>
				</c:if>
				
				<c:if test="${sessionScope.LOGIN_USER.id != null}">
				<h1>我的购物车：</h1>
				<table cellspacing="10">
					<tr>
						<th style="width: 30px">全选<input type="checkbox" id="select_All"/></th>
						<th>图片</th>
						<th style="width:220px">商品</th>
						<th>单价</th>
						<th>数量</th>
						<th>小计（元）</th>
						<th>操作</th>
					</tr>
					<c:forEach items="${list}" var="myShoppingCart">
						<tr>
							<td><input type="checkbox" name="item" id="item"/><input type="hidden"  value="${myShoppingCart.pid}"></td>
							<td><img src="/shopcenter/${myShoppingCart.image}" width="30px" height="30px"/></td>
							<td>${myShoppingCart.pname}</td>
							<td id="price">${myShoppingCart.price}</td>
							<td id="number">
								<input id="min" name="" type="button" value="-" class="min" disabled="disabled"/>
								<input id="text_box" name="goodnum" type="text" value="${myShoppingCart.number}" style="width:20px;" />
								<input id="add" name="" type="button" value="+" class="add"/>
								<input type="hidden"  value="${myShoppingCart.price}">
							</td>
							<td id="subtotal">${myShoppingCart.subtotal}</td>
							<td><a href="${ path }/ums/Shoppingcar/deleteItem?pid=${myShoppingCart.pid}">删 除</a></td>
						</tr>
					</c:forEach>	
				</table>
				
				<div align="right">
					<h2>总 价：${totalMoney}元</h2>
					<a href="javascript:void(0);" id="jiesuan"> 去 结 算 </a>
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