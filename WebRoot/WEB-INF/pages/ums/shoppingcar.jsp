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

</head>
<body>
	<div id="main_container">
		<jsp:include page="../common/header.jsp" />
		<div id="main_content">
			<jsp:include page="../common/menu.jsp" />
			<jsp:include page="../common/left.jsp" />
			<div class="center_content">
			
				<h3>我的购物车：</h3>
				<table border="1" align="center" cellpadding="10" cellspacing="0">
					<tr>
						<th>商品</th>
						<th>单价</th>
						<th>数量</th>
						<th>小计（元）</th>
						<th>操作</th>
					</tr>
					<c:forEach items="${list}" var="myShoppingCart">
						<tr>
							<td>${myShoppingCart.pname}</td>
							<td>${myShoppingCart.price}</td>
							<td>${myShoppingCart.number}</td>
							<td>${myShoppingCart.subtotal}</td>
							<td><a href="#"><input type="button" value="删 除"/></a></td>
						</tr>
					</c:forEach>	
				</table>
			
			</div>
			<!-- end of center content -->
			<jsp:include page="../common/right.jsp" />
		</div>
		<!-- end main content -->
		<jsp:include page="../common/footer.jsp" />
	</div>
</body>
</html>