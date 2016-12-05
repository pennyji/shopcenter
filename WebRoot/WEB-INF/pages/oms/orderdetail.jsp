<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="shiro" uri="http://shiro.apache.org/tags"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="zh-cn">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>order detail</title>
<head>
<jsp:include page="../common/meta.jsp" />
<jsp:include page="../common/resources.jsp" />
<script src="${path }/scripts/ums/login.js?20160811"></script>
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
					<h4>登录后将显示您的订单。</h4>
				</center>
			</c:if>
			
			<c:if test="${sessionScope.LOGIN_USER.id != null}">
				<c:if test="${orders.size() == 0}">
					<center>
						<h1>您还未购买过商品</h1>
						<br>
						<a href="${path}/ums/user/showIndex">去购物 Go</a>
					</center>
				</c:if>
			</c:if>
			
			<c:if test="${sessionScope.LOGIN_USER.id != null}">
				<c:if test="${orders.size() != 0}">
					<h1>订单详情：</h1>
					<c:forEach items="${orders}" var="orders" >
						<p style="color: red">
							<b>订单编号：${orders.orderId}</b>
							&nbsp;&nbsp;&nbsp;
							<b>订单状态：未付款</b>
							&nbsp;&nbsp;&nbsp;
							<b>总金额：${orders.totalSum}</b>
						</p>
				    	<p>收货人姓名：${orders.name}</p>
				    	<p>收货地址：${orders.address}</p>
				    	<p>联系电话：${orders.phone}</p>
			        	<table cellspacing="10">
				        	<tr>
					        	<th>图片</th>
					        	<th style="width:360px;">商品</th>
					        	<th>单价</th>
					        	<th>数量</th>
					        	<th>小计（元）</th>
					        </tr>
			        		<c:forEach items="${orders.myShoppingCarts}" var="products">
				        		<tr>
					        		<td><img src="/shopcenter/${products.image }" width="30" height="30"></td>
					        		<td>${products.pname }</td>
					        		<td>${products.price }</td>
					        		<td>${products.number }</td>
					        		<td>${products.price * products.number }</td>
				        		</tr> 
			        		</c:forEach>  
			        	 </table>
			        	 <br><br>
	        	 	</c:forEach>
				</c:if>	
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