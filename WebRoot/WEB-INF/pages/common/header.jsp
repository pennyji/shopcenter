<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
	
		<div class="top_bar">
			<div class="welcome">
			<c:if test="${sessionScope.LOGIN_USER.nickname != null}">
				<span>欢迎您： ${sessionScope.LOGIN_USER.nickname } </span>
				<a style="color: #519ab9;" href="${path }/ums/user/logout" onclick="javascript:sessionStorage.clear();">退出登录</a>
			</c:if>
				
			</div>

			<div class="top_search">
				<div class="search_text">
					<a href="#">高级搜索</a>
				</div>
				<input type="text" class="search_input" name="search" /> <input
					type="image" src="/shopcenter/images/search.gif" class="search_bt" />
			</div>
		</div>
		<div id="header">
			<div id="logo">
				<a href="index.html"><img src="/shopcenter/images/logo.png" alt="" title=""
					border="0" width="237" height="140" /></a>
			</div>

			<div class="oferte_content">
				<div class="top_divider">
					<img src="/shopcenter/images/header_divider.png" alt="" title="" width="1"
						height="164" />
				</div>
				<div class="oferta">

					<div class="oferta_content">
						<img src="/shopcenter/${LATEST_PRODUCT.image}" width="94" height="92" border="0" class="oferta_img" />

						<div class="oferta_details">
							<div class="oferta_title">${LATEST_PRODUCT.pname}</div>
							<div class="oferta_text">${LATEST_PRODUCT.detail}</div>
							<a href="${path}/pms/product/findById?productId=${LATEST_PRODUCT.pid}" class="details">详情</a>
						</div>
					</div>
					<div class="oferta_pagination">

						<span class="current">1</span> <a href="#?page=2">2</a> <a
							href="#?page=3">3</a> <a href="#?page=3">4</a> <a href="#?page=3">5</a>

					</div>

				</div>
				<div class="top_divider">
					<img src="/shopcenter/images/header_divider.png" alt="" title="" width="1"
						height="164" />
				</div>

			</div>
			<!-- end of oferte_content-->
		</div>

