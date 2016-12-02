<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<jsp:include page="../common/meta.jsp" />
<div class="left_content">
	<div class="title_box">类目</div>

	<ul class="left_menu">
		<c:forEach items="${typelist}" var="typelist" varStatus="tl">
		 <c:choose>
		 <c:when test="${tl.index % 2 != 0}"><li class="even"><a href="${path }/pms/product/findByType?page=1&type=${typelist.type}">${typelist.type}</a></li></c:when>
		 <c:otherwise><li class="odd"><a href="${path }/pms/product/findByType?page=1&type=${typelist.type}">${typelist.type}</a></li></c:otherwise>
		 </c:choose>
		</c:forEach>
	</ul>


	<div class="title_box">热门推荐</div>
	<div class="border_box">
		<div class="product_title">
			<a href="#">${hotlist.get(0).pname}</a>
		</div>
		<div class="product_img">
			<a href="${path}/pms/product/findById?pid=${hotlist.get(0).pid}"><img src="${path}/${hotlist.get(0).image}" alt=""
				title="" border="0" width="100" height="130"/></a>
		</div>
		<div class="prod_price">
			<span class="reduce">350$</span> <span class="price">${hotlist.get(0).price}</span>
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