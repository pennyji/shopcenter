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
	$(function(){
		
		$("#name").blur(function(){
			var name = $("#name").val();
			if (name == null || name == "") {
				$("#name_msg").html("<font color='red'> 姓名不能为空！ </font>");
			}else{
				$("#name_msg").html("<font color='green'></font>");
			}
		});
		
		$("#nickname").blur(function(){
			var nickname = $("#nickname").val();
			if (nickname == null || nickname == "") {
				$("#nickname_msg").html("<font color='red'> 昵称不能为空！ </font>");
			}else{
				$("#nickname_msg").html("<font color='green'></font>");
			}
		});
		
		$("#account").blur(function(){
			var formData = $("#form").serialize2Json();
			var account = $("#account").val();
			if (account == null || account == "") {
				$("#account_msg").html("<font color='red'> 账号不能为空！ </font>");
			} else {
				$.ajax({
					type : "POST",
					contentType : "application/json;charset=utf-8",
					url : _path + "/ums/validate/validateAjax",
					dataType : "json",
					data : JSON.stringify(formData),
					success : function(data) {
						if (data.status == "S") {
							$("#account_msg").html("<font color='green'> 恭喜，该账号可以使用！</font>");
						} else {
							$("#account_msg").html("<font color='red'> 该账号已被使用！</font>");
						}
					},
					error : function() {
						alert("error~");
					},
				});
			};
		});
		
		$("#password").blur(function(){
			var password = $("#password").val();
			if (password == null || password == "") {
				$("#password_msg").html("<font color='red'> 密码不能为空！ </font>");
			}else{
				$("#password_msg").html("<font color='green'></font>");
			}
		});
		
		$("#gender").blur(function(){
			var gender_male = $("#gender_male").val();
			var gender_female = $("#gender_female").val();
			if (gender_male == null || gender_male == "" & gender_female == null || gender_female == "") {
				$("#gender_msg").html("<font color='red'> 请选择性别！ </font>");
			}else{
				$("#gender_msg").html("<font color='green'></font>");
			}
		});
		
		$("#accountTypeFk").blur(function(){
			var account_c = $("#account_c").val();
			var account_a = $("#account_a").val();
			if (account_c == null || account_c == "" & account_a == null || account_a == "") {
				$("#accountTypeFk_msg").html("<font color='red'> 请选择账号类型！ </font>");
			}else{
				$("#accountTypeFk_msg").html("<font color='green'></font>");
			}
		});
		
	})
</script>

</head>

<body>

	<p align="center"><a href="${path}/pms/product/showIndex">商城首页</a></p>

	<form id="form" class="form-signin">
		<h3>用户注册</h3>

		<input type="text" name="name" id="name" class="form-control" placeholder="姓名" required autofocus/>
		<span id="name_msg"></span>
		<br>
		<input type="text" name="nickname" id="nickname" class="form-control" placeholder="昵称"/>
		<span id="nickname_msg"></span>
		<br>
		<input type="text" name="account" id="account" class="form-control" placeholder="账号"/>
		<span id="account_msg"></span>
		<br>
		<input type="password" name="password" id="password" class="form-control" placeholder="密码"/>
		<span id="password_msg"></span>
		<br>
		<div id="gender">
		用户性别：<input name="gender" type="radio" id="gender_male" value="1"/>男
		<input name="gender" type="radio" id="gender_female" value="2"/>女
		<span id="gender_msg"></span>
		</div>
		<br>
		<div id="accountTypeFk">
		账户类型：<input name="accountTypeFk" type="radio" id="account_c" value="100"/>客户
		<input name="accountTypeFk" type="radio" id="account_a" value="200"/>管理员
		<span id="accountTypeFk_msg"></span>
		</div>
		<br>
		<p align="center">已有账号 我要<a href="${path}/ums/user/showLogin">登录</a></p>
		<button class="btn btn-lg btn-primary btn-block" type="button" onclick="register()">注册</button>
	</form>
	
</body>
</html>