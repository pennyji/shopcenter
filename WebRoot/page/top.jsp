<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>top</title>
<style type="text/css">
	body {
		background: #15B69A;
		margin: 0px;
		color: #ffffff;
	}
	a {
		text-decoration:none;
		color: #ffffff;
		font-weight: 900;
	} 
	a:hover {
		text-decoration: underline;
		color: #ffffff;
		font-weight: 900;
	}
</style>
<jsp:include page="../WEB-INF/pages/common/meta.jsp" />

</head>
<body>
<h1 style="text-align: center;">其然网上购物商城</h1>
<div style="font-size: 10pt; line-height: 10px;">

<%-- 根据用户是否登录，显示不同的链接 --%>
<c:choose>
	<c:when test="${empty LOGIN_USER.account  }">
		  <a href="${path}/ums/user/login " target="_parent">其然会员登录</a> |&nbsp; 
		  <a href="${path}/ums/register/showRegister" target="_parent">注册其然会员</a>	
	</c:when>
	<c:otherwise>
		      其然会员：${LOGIN_USER.account }&nbsp;&nbsp;|&nbsp;&nbsp;
		  <a href="<c:url value=''/>" target="body">我的购物车</a>&nbsp;&nbsp;|&nbsp;&nbsp;
		  <a href="<c:url value=''/>" target="body">我的其然订单</a>&nbsp;&nbsp;|&nbsp;&nbsp;
		  <a href="<c:url value=''/>" target="body">修改密码</a>&nbsp;&nbsp;|&nbsp;&nbsp;
		  <a href="<c:url value=''/>" target="_parent">退出</a>&nbsp;&nbsp;|&nbsp;&nbsp;
		  <a href="其然网址" target="_top">联系我们</a>	
	</c:otherwise>
</c:choose>



</div>


</body>
</html>