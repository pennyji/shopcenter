<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib prefix="shiro" uri="http://shiro.apache.org/tags"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html lang="zh-cn">
<head>
 <jsp:include page="../common/meta.jsp" />
<jsp:include page="../common/resources.jsp" /> 
<script src="${path}/scripts/ums/login.js?20160811" ></script>
<style type="text/css">
body {
  padding-top: 40px;
  padding-bottom: 40px;
  background-color: #eee;
}
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

<script type="text/javascript">
$(function() {
	$("#account").blur(function() {
		var account = $("#account").val();
		if (account == null || account == "") {
			$("#act").html("<font color='red'> 用户名不能为空！</font>");
		}else {
			$("#act").html("<font color='red'> </font>");
		}
	});
	
	$("#password").blur(function() {
		var password = $("#password").val();
		if (password == null || password == "") {
			$("#pwd").html("<font color='red'> 密码不能为空！</font>");
		}else {
			$("#pwd").html("<font color='red'> </font>");
		}
	});
});
</script>

</head>
<body>
	<p align="center"><a href="${path}/ums/user/showIndex">商城首页</a></p>

	<div class="container">
		<form class="form-signin" role="form" id = "form" action="#">
		<h3>用户登录</h3>
			<input name="account" id="account" class="form-control" placeholder="账号" required autofocus>
			<span id="act"></span>
			<br>
			<input name="password" type="password" id="password" class="form-control" placeholder="密码" required>
			<span id="pwd"></span>
			<br>
			<p align="center">
			还没有账号?
			<a href="${path}/ums/register/showRegister">立即注册</a>&nbsp&nbsp&nbsp
			<a href="">忘记密码</a>
			</p>
			<button class="btn btn-lg btn-primary btn-block" type="button" onclick="login()">登录</button>

		</form>
	</div>
	
</body>

</html>
