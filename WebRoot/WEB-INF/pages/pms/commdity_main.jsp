<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<jsp:include page="../common/meta.jsp" />

<script>
function searchOrders(){
	alert("123");
	document.forms[0].action = "${pageContext.request.contextPath}/pms/findById";
	document.forms[0].submit(); 
}
</script>
<title>商品主页</title>
</head>
<body>

<div>
	<td>
          <input type="image" src="${path }/commdity_images/1.jpg" id="submitBtn" onclick="searchOrders()"> 
       
         
    </td>
	</div>
	<div>
	
		<form action="/shopcenter/pms/findById" >
	<td>
	<input type="text" value="" name="commodityId">
	</td>
		<input type="submit" value="搜素">
	</form>
	</div>
	<div>${commodity.commodityId}</div>
	<div>${commodity.commodityName}</div>
	<div>${commodity.commodityPrice }</div>
	<div>${commodity.commodityType }</div>
	<div>${commodity.commodityDetail }</div>
	<div>
	<img align="top" src="${path }/${commodity.commodityImage }">
	</div>
</body>

</html>