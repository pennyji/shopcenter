<%@page import="com.cheer.mini.ums.model.User"%>
<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<jsp:include page="../common/meta.jsp" />
<jsp:include page="../common/resources.jsp" />
<script src="${path }/scripts/demo/portal.js"></script>

<style type="text/css">
body {
  padding-top: 40px;
  padding-bottom: 40px;
  background-color: #eee;
}
</style>

</head>

<body>

	<jsp:include page="../common/menu.jsp" />

	<table border="1">
		<tr>
			<th>姓名</th>
			<th>昵称</th>
			<th>账户</th>
			<th>密码</th>
			<th>性别</th>
		</tr>	
		<c:forEach items="${list}" var="user">
			<tr>
				<td>${user.name}</td>
				<td>${user.nickname}</td>
				<td>${user.account}</td>
				<td>${user.password}</td>
				<td>${user.gender}</td>
			</tr>		
		</c:forEach>
	</table>
	
</body>
</html>
