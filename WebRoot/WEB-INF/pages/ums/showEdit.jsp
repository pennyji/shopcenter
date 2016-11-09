
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib prefix="shiro" uri="http://shiro.apache.org/tags"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<jsp:include page="../common/meta.jsp" />
<jsp:include page="../common/resources.jsp" />

<script src="${path}/scripts/ums/register.js?20161026" ></script>

<style type="text/css">
.form-signin {
  max-width: 330px;
  padding: 15px;
  margin: 0 auto;
}
.form-signin .form-control {
  position: relative;
  height: auto;
  -webkit-box-sizing: border-box;
     -moz-box-sizing: border-box;
          box-sizing: border-box;
  padding: 10px;
  font-size: 16px;
}
</style>

</head>
<body>

	<form action="${path}/ums/userUpdate/doUpdate" class="form-signin" method="post">
	<h3>个人信息</h3>
		<b>当前账号：${sessionScope.LOGIN_USER.account }</b>
		<input type="hidden" name = "account" value="${sessionScope.LOGIN_USER.account }">
		<br><br>
		姓名：<input name = "name" class="form-control" value="${sessionScope.LOGIN_USER.name } " />
		<br>
		昵称：<input name = "nickname" class="form-control" value="${sessionScope.LOGIN_USER.nickname }" />
		<br>
		<input type="hidden" name = "gender" class="form-control" value="${sessionScope.LOGIN_USER.gender }" />
		<br>
		<p align="center">返回<a href="${path}/ums/user/customerIndex">首页</a></p>
		<input class="btn btn-lg btn-primary btn-block" type="submit" value="保存修改"/>
	</form>

</body>

</html>

