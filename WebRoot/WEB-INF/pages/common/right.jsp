<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<jsp:include page="../common/meta.jsp" />
<div class="right_content">
	<div class="shopping_cart">
		<div class="cart_title">购物车</div>
	<c:if test="${sessionScope.LOGIN_USER.id != null}">
		<div class="cart_details">
			数量：${totalNum}条 <br /> <span class="border_cart"></span> 总价: <span
				class="price">${totalCount}元</span>
		</div>
	</c:if>
		<div class="cart_icon">
		
			<a href="${path}/ums/Shoppingcar/showShoppingCart?id=${sessionScope.LOGIN_USER.id}" title="header=[Checkout] body=[&nbsp;] fade=[on]"><img
				src="/shopcenter/images/shoppingcart.png" alt="" title="" width="48" height="48"
				border="0" /></a>
		
		</div>

	</div>


	<div class="title_box">新商品</div>
	<div class="border_box">
		<div class="product_title">
			<a href="${path}/pms/product/findById?pid=${LATEST_PRODUCT.pid}">${LATEST_PRODUCT.pname}</a>
		</div>
		<div class="product_img">
			<a href="${path}/pms/product/findById?pid=${LATEST_PRODUCT.pid}"><img src="/shopcenter/${LATEST_PRODUCT.image}" alt="" title=""
				border="0" width="80px" height="120px"/></a>
		</div>
		<div class="prod_price">
			<span class="price">${LATEST_PRODUCT.price}</span>
		</div>
	</div>



	<div class="title_box">品牌</div>

	<ul class="left_menu">
		<li class="odd"><a href="services.html">Sony</a></li>
		<li class="even"><a href="services.html">Samsung</a></li>
		<li class="odd"><a href="services.html">Daewoo</a></li>
		<li class="even"><a href="services.html">LG</a></li>
		<li class="odd"><a href="services.html">Fujitsu Siemens</a></li>
		<li class="even"><a href="services.html">Motorola</a></li>
		<li class="odd"><a href="services.html">Phillips</a></li>
		<li class="even"><a href="services.html">Beko</a></li>
	</ul>

	<div class="banner_adds">

		<a href="#"><img src="/shopcenter/images/bann1.jpg" alt="" title="" border="0" /></a>
	</div>

</div>
<!-- end of right content -->

</body>
</html>