<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <jsp:include page="../common/meta.jsp" />
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	
	

<table >
			

 		
				<div>			
				<tr>
					<a><input type="image"
					src="${path}/${commodity.commodityPrint}" / width="300px"></a>
				</tr>
				<td></td>
				
				</div>
				<tr></tr>
				<div>
				<tr >${commodity.commodityName}</tr>
				</div>
				<tr></tr>
				<div>
				<tr>${commodity.commodityPrice}</tr>	
				</div>
				
				<table width="50" height="100">
				<tr></tr>
 				<div >
				<tr>${commodity.commodityDetail}</tr>
				</div>
				
				<td>
				<input type="submit" value="提交购物车" >
				</td>
				</table>
   </table>
</body>
</html>