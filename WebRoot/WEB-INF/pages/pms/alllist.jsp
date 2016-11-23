<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="shiro" uri="http://shiro.apache.org/tags"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html lang="zh-cn">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<head>
<jsp:include page="../common/meta.jsp" />
<jsp:include page="../common/resources.jsp" />
<script src="${path }/scripts/ums/login.js?20160811"></script>
</head>
<body>
	<div id="main_container">
	<jsp:include page="../common/header.jsp" />
	<div id="main_content">
		<jsp:include page="../common/menu.jsp" />
		<jsp:include page="../common/left.jsp" />
		<div class="center_content">
			<div class="center_title_bar">欢迎选购</div>
				
				
				<c:forEach items="${pageBean.list}" var="pg">
			<div class="prod_box">
				<div class="top_prod_box"></div>
				<div class="center_prod_box">
					<div class="product_title">
						<a href="details.html"></a>
					</div>
					<div class="product_img">
						<a  href="${path }/pms/product/findById?pid=${pg.pid}"><img src="${path }/${pg.image}" alt=""
							title="" border="0" height="130"  width="90" /></a>
					</div>
					<div class="prod_price">
						 <span class="price">${pg.price}</span>
					</div>
				</div>
				<div class="bottom_prod_box"></div>
				<div class="prod_details_tab">
					<a href="#" title="header=[Add to cart] body=[&nbsp;] fade=[on]"><img
						src="/shopcenter/images/cart.gif" alt="" title="" border="0" class="left_bt" /></a>
					<a href="#" title="header=[Specials] body=[&nbsp;] fade=[on]"><img
						src="/shopcenter/images/favs.gif" alt="" title="" border="0" class="left_bt" /></a>
					<a href="#" title="header=[Gifts] body=[&nbsp;] fade=[on]"><img
						src="/shopcenter/images/favorites.gif" alt="" title="" border="0"
						class="left_bt" /></a> <a href="details.html" class="prod_details">details</a>
				</div>
			</div>
			</c:forEach>


		



			<div class="center_title_bar">
			第${pageBean.page}/${pageBean.totalPage}页
			<c:if test="${pageBean.page != 1}">
			<a href="${path }/pms/product/findByAll?page=1">首页</a> 
			<a href="${path }/pms/product/findByAll?page=${pageBean.page-1}">上一页</a>
			</c:if>
			<c:if test="${pageBean.page != pageBean.totalPage}">
			<a href="${path }/pms/product/findByAll?page=${pageBean.page+1}">下一页</a>
			<a href="${path }/pms/product/findByAll?page=${pageBean.totalPage}">末页</a>
			</c:if>
			</div>
			
			
			
		</div>
		<!-- end of center content -->
		<jsp:include page="../common/right.jsp" />
	</div><!-- end main content -->
	<jsp:include page="../common/footer.jsp" />
	</div>
</body>

</html>
