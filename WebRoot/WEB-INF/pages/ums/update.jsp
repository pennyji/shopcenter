<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<jsp:include page="../common/meta.jsp" />
<jsp:include page="../common/resources.jsp" />

<script src="${path}/scripts/ums/register.js?20161026" ></script>

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

	<form action="${path}/ums/userUpdate/showEdit" >
		请输入要修改的账户:<input type="text" name="account"/>
		<input type="submit" value="Submit"/>
	</form>
	
</body>
</html>