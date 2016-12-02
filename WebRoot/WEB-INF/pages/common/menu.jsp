<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib prefix="shiro" uri="http://shiro.apache.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@ taglib uri="http://www.opensymphony.com/oscache" prefix="cache"%>

<jsp:include page="../common/meta.jsp" />

<script>
	$(function() {

		$("#user_register").click(function() {
			window.location = _path + "/ums/register/showRegister";
		});

	});
</script>

	<div id="menu_tab">
		<div class="left_menu_corner"></div>
		<ul class="menu">
			<li><a href="${path }/ums/user/showIndex" class="nav1">首页</a></li>
			<li class="divider"></li>
			<li><a href="#" class="nav3">推荐商品</a></li>
			<li class="divider" ></li>
			<li><a href="${path }/oms/order/showOrderDetail" class="nav3">我的订单</a></li>
			<li class="divider" ></li>
			<li><a href="${path}/pages/common/contacts.jsp" class="nav6">联系我们</a></li>
			<li class="divider" style="margin-right: 290px;"></li>
			<li><a href="${path}/ums/user/showLogin" class="nav4">登录</a></li>
			<li class="divider"></li>
			<li><a href="${path}/ums/register/showRegister" class="nav4">注册</a></li>
			<li class="divider"></li>
			
			<c:if test="${sessionScope.LOGIN_USER.id != null}">
			<li><a href="${path }/ums/userUpdate/showEdit" class="nav2">个人中心</a></li>
			</c:if>
			
		</ul>

		<div class="right_menu_corner"></div>
	</div>
	<!-- end of menu tab -->
	
	<!--  
	<div class="crumb_navigation">
		当前位置: <span class="current">首页</span>
	</div>
	-->
	<!-- end of menu tab -->



