<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<jsp:include page="../WEB-INF/pages/common/meta.jsp" />
<title>left</title>
 <base target="body"/>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<meta http-equiv="content-type" content="text/html;charset=utf-8">
	<!-- /shopcenter/WebRoot/menu/mymenu.js -->
	<script type="text/javascript" src="<c:url value='../jquery/jquery-1.5.1.js'/>"></script>
	<script type="text/javascript" src="<c:url value='../menu/mymenu.js'/>"></script>
	<link rel="stylesheet" href="<c:url value='../menu/mymenu.css'/>" type="text/css" media="all">
	<link rel="stylesheet" type="text/css" href="<c:url value='/styles/left.css'/>">
	
	<script language="javascript">
var bar = new Q6MenuBar("bar", "其然网上购物商城");
$(function() {
	bar.colorStyle = 4;
	bar.config.imgDir = "<c:url value='/menu/img/'/>";
	bar.config.radioButton=true;
	
	
	<c:forEach items="${parents}" var="parent">
	  <c:forEach items="${parent.children}" var="child">
		bar.add("${parent.cname}", "${child.cname}", "", "body");
	  </c:forEach>
	</c:forEach>
	/* bar.add("图书", "武侠", "/shopcenter/page/list.jsp", "body");
	bar.add("图书", "玄幻", "/shopcenter/page/list.jsp", "body");
	bar.add("图书", "修真", "/shopcenter/page/list.jsp", "body");
	
	bar.add("家用电器", "电视", "/shopcenter/page/list.jsp", "body");
	bar.add("家用电器", "空调", "/shopcenter/page/list.jsp", "body");
	bar.add("家用电器", "洗衣机", "/shopcenter/page/list.jsp", "body");
	
	bar.add("医药保健", "中西药品", "/shopcenter/page/list.jsp", "body");
	bar.add("医药保健", "营养健康", "/shopcenter/page/list.jsp", "body");
	bar.add("医药保健", "营养成分", "/shopcenter/page/list.jsp", "body");
	bar.add("医药保健", "滋补养生", "/shopcenter/page/list.jsp", "body");
	
	bar.add("电脑/办公用品", "电脑整机", "/shopcenter/page/list.jsp", "body");
	bar.add("电脑/办公用品", "电脑配件", "/shopcenter/page/list.jsp", "body");
	bar.add("电脑/办公用品", "游戏设备", "/shopcenter/page/list.jsp", "body");
	bar.add("电脑/办公用品", "网络设备", "/shopcenter/page/list.jsp", "body"); */
	
	$("#menu").html(bar.toString());
});
</script>

</head>
<body>
	<div id="menu"></div>
</body>
</html>