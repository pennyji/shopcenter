<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>


<div class="left_content">
	<div class="title_box">类目</div>

	<ul class="left_menu">
		<li class="odd"><a href="services.html">Processors</a></li>
		<li class="even"><a href="services.html">Motherboards</a></li>
		<li class="odd"><a href="services.html">Desktops</a></li>
		<li class="even"><a href="services.html">Laptops & Notebooks</a></li>
		<li class="odd"><a href="services.html">Processors</a></li>
		<li class="even"><a href="services.html">Motherboards</a></li>
		<li class="odd"><a href="services.html">Processors</a></li>
		<li class="even"><a href="services.html">Motherboards</a></li>
		<li class="odd"><a href="services.html">Desktops</a></li>
		<li class="even"><a href="services.html">Laptops & Notebooks</a></li>
		<li class="odd"><a href="services.html">Processors</a></li>
		<li class="even"><a href="services.html">Motherboards</a></li>
	</ul>


	<div class="title_box">热门推荐</div>
	<div class="border_box">
		<div class="product_title">
			<a href="details.html">Motorola 156 MX-VL</a>
		</div>
		<div class="product_img">
			<a href="${path}/pms/product/findById?productId=${hotlist.get(0).pid}"><img src="${path}/${hotlist.get(0).image}" alt=""
				title="" border="0" width="100" height="130"/></a>
		</div>
		<div class="prod_price">
			<span class="reduce">350$</span> <span class="price">270$</span>
		</div>
	</div>


	<div class="title_box">Newsletter</div>
	<div class="border_box">
		<input type="text" name="newsletter" class="newsletter_input"
			value="your email" /> <a href="#" class="join">join</a>
	</div>

	<div class="banner_adds">

		<a href="#"><img src="/shopcenter/images/bann2.jpg" alt="" title="" border="0" /></a>
	</div>


</div>
<!-- end of left content -->

</body>
</html>