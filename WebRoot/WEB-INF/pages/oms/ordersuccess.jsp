<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="shiro" uri="http://shiro.apache.org/tags"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="zh-cn">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>order success</title>
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
				<center>
					<br>
					<h2>
					<b style="color:green;">订单已提交</b>
					&nbsp;&nbsp;&nbsp;
					<a href="${path }/oms/order/showOrderDetail">查看订单</a>
					</h2>
					<br>
					<h1 style="color: red">选择支付方式：</h1>
					<input type="checkbox"/>货到付款
					&nbsp;
					<input type="checkbox"/>支付宝
					&nbsp;
					<input type="checkbox"/>微信
					<br><br>
					<h2><a href="#">立即支付</a></h2>
				</center>
			</div>
			<!-- end of center content -->
			<jsp:include page="../common/right.jsp" />
		</div>
		<!-- end main content -->
		<jsp:include page="../common/footer.jsp" />
	</div>
</body>
</html>