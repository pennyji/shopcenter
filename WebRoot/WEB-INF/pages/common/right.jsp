<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<jsp:include page="../common/meta.jsp" />
<jsp:include page="../common/resources.jsp" /> 
<div class="right_content">
	<div class="shopping_cart">
		<div class="cart_title">购物车</div>

		<div class="cart_details">
			${mycart.number} items <br /> <span class="border_cart"></span> 总价: <span
				class="price">${mycart.number*mycart.price}元</span>
		</div>

		<div class="cart_icon">
			<a href="#" title="header=[Checkout] body=[&nbsp;] fade=[on]"><img
				src="/shopcenter/images/shoppingcart.png" alt="" title="" width="48" height="48"
				border="0" /></a>
		</div>

	</div>


	<div class="title_box">新商品</div>
	<div class="border_box">
		<div class="product_title">
			<a href="details.html">Motorola 156 MX-VL</a>
		</div>
		<div class="product_img">
			<a href="details.html"><img src="/shopcenter/images/p2.gif" alt="" title=""
				border="0" /></a>
		</div>
		<div class="prod_price">
			<span class="reduce">350$</span> <span class="price">270$</span>
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