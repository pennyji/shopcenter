<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<jsp:include page="../common/meta.jsp" />
<jsp:include page="../common/resources.jsp" />

<script src="${path}/scripts/ums/register.js?20161031" ></script>

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

	<form id="form" name="a">
	<h3>请注册：</h3>
		姓名：<input type="text" name="name"/><br><br>
		昵称：<input type="text" name="nickname"/><br><br>
		账号：<input type="text" name="account"/><br><br>
		密码：<input type="password" name="password" class="form-signin"/><br><br>
		用户性别：<input name="gender" type="radio" value="1"/>男
		<input name="gender" type="radio" value="2"/>女<br><br>
		账户类型：<input name="accountTypeFk" type="radio" value="100"/>客户
		<input name="accountTypeFk" type="radio" value="200"/>管理员<br><br>
		<input type="button" value="注   册" onclick="register()"/>
		<input type="button" value="重   置" onclick="a.reset()"/>
	</form>
	
</body>
</html>