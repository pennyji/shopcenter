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
				
				<c:if test="${sessionScope.LOGIN_USER.id == null}">
					<center>
					<h1>您好！请登录。</h1>
					<h4>登录后将显示您之前加入的商品。</h4>
					</center>
				</c:if>
				
				<c:if test="${sessionScope.LOGIN_USER.id != null}">
					<center>
						<h1>您的购物车中暂时没有商品！</h1>
						<br>
						<a href="${path}/ums/user/showIndex">去购物 Go</a>
					</center>
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