<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
  <jsp:include page="../common/meta.jsp" />
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
 <script type="text/javascript" src="${path }/scripts/pms/jquery-1.9.1.js"></script>
<script type="text/javascript" src="${path }/scripts/pms/commodity.js"></script>
<script type="text/javascript">
function chooseCatagory(){
	var commodityCategory = document.getElementById("commodityCategory").value;
	window.location.href ="/shopcenter/pms/commodity/category?commodityCategory="+commodityCategory;
}
</script>
<style type="text/css">
	#site_one{position:relative; 
		left:10px;
		bottom:-20px;}
		
		#site_tow{position:relative; 
		left:260px;
		bottom:35px;}
		
		#site_three{position:relative; 
		left:700px;
		bottom:70px;}
		
		#site_five{position:relative; 
		left:30px;
		bottom:80px;}
		
		#site_zero{position:relative; 
		left:500px;
		bottom:-20px;}
		
		#table_one{width:150px;word-wrap:break-word;}
		
		.table_one{
	border:solid 1px black;
	width:100px;
}
</style>
</head>
<body>

	<div id="site_zero">
		<h2>欢迎来到cheer网上商城</h2>
	</div>
	<div>
		<div id="site_one">
			<form action="/shopcenter/pms/commodity/detail">
				<input type="text" name="commodityDetail" id="commodityDetailid"
					placeholder="请输入需要查询的商品"> <input type="submit" value="查询">
			</form>
		</div>

		<div id="site_five">


			<c:choose>
				<c:when test="${LOGIN_USER.account==null}">
					<a href="/shopcenter/pms/commodity/gotologin">登录</a>
					<a href="/shopcenter/pms/commodity/gotoregister">注册</a>
				</c:when>
				<c:otherwise>
					欢迎${LOGIN_USER.name}來到cheer商城
					<a href="#">我的购物车</a>
					<a href="${path}/ums/user/seeuser?userid=${LOGIN_USER.id}">个人信息</a>
					<a href="/shopcenter/ums/user/logout">退出登录</a>
				</c:otherwise>
			</c:choose>
		</div>




		<div id="site_tow">
			<form action="/shopcenter/pms/commodity/price">
				<input type="text" name="price1" value="" placeholder="请输入价格区间（小）"
					id="price1id"> <input type="text" name="price2" value=""
					placeholder="请输入价格区间（大）" id="price2id"> <input
					type="submit" value="提交" id="submitid">
			</form>
		</div>

		<div id="site_three">
			<table style="height: 20px">
				<tr>
					<td><select id="commodityCategory" name="commodityCategory"
						onchange="chooseCatagory();">
							<option>商品</option>
							<option>书籍</option>
							<option>水果</option>
							<option>电子产品</option>
							<option>家用电器</option>
							<option>其他</option>
					</select></td>
					<td><a href="${path}/pms/commodity/all">显示所有商品</a></td>
				</tr>

			</table>
		</div>





		<div id="site_four" style="width: 399px;margin-right: 385px;margin-left: 385px;">
			
				<c:forEach items="${list}" var="commodity">
					<div style="float: left;margin-left: 10px;">
						<div style="float: left;">
							<a href="${path}/pms/commodity/commodityId?commodityId=${commodity.commodityId}">
								<input type="image" src="${path}/${commodity.commodityPrint}"
								width="150px">
							</a>
						</div>
						<div>
							${commodity.commodityName}
						</div>
						<div>
							${commodity.commodityPrice}
						</div>
					</div>
				</c:forEach>
			
		</div>
</body>
</html>