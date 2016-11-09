<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     <%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
  <jsp:include page="../common/meta.jsp" />
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<style type="text/css">


</style>
</head>
<body>
  <div id="site_one">
  <table>
  <tr>
  	<td>姓名</td><td>昵称</td><td>账号</td>
  	</tr>
  <c:forEach items="${LOGIN_USER}" var="user">
  	<tr>
  	<td>${user.name}</td><td>${user.nickname}</td><td>${user.account}</td>
  	</tr>
  	</table>
  </c:forEach>
  </div> 
</body>
</html>