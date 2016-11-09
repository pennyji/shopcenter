<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<div>
		<table>
			
			<tr>
				<td>姓名</td>
			</tr>
			<tr>
				<td>昵称</td>
			</tr>
			<tr>
				<td>账号</td>
			</tr>

			<tr>
				<td>${LOGIN_USER.name}</td>
			</tr>
			<tr>
				<td>${LOGIN_USER.nickname}</td>
			</tr>
			<tr>
				<td>${LOGIN_USER.account}</td>
			</tr>

		</table>
	</div>
</body>
</html>