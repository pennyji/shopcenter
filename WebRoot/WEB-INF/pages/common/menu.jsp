<%@ page language="java" pageEncoding="UTF-8" %>
<%@ taglib prefix="shiro" uri="http://shiro.apache.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>  
<%@ taglib uri="http://www.opensymphony.com/oscache" prefix="cache"%>

<script>

$(function(){
	
	$("#user_register").click(function(){
		window.location = _path + "/ums/register/showRegister";
	});
	
	$("#user_query").click(function(){
		window.location = _path + "/ums/query/doQuery";
	});
	
	$("#user_update").click(function(){
		window.location = _path + "/ums/userUpdate/update";
	});
	
});

</script>

<div class="col-xs-6 col-sm-2 sidebar-offcanvas" id="sidebar" role="navigation">
	<div class="list-group">
		<a href="#" class="list-group-item active">商品管理</a>
		<a href="#" class="list-group-item">商品发布</a>
		<a href="#" class="list-group-item">商品列表</a>
		
		<a href="#" class="list-group-item active">订单管理</a>
		<a href="#" class="list-group-item">订单列表</a>
		<a href="#" class="list-group-item">订单审核</a>
		
		<a href="#" class="list-group-item active">用户管理</a>
		<a href="#" class="list-group-item" id="user_register" >用户注册</a>
		<a href="#" class="list-group-item" id="user_update">修改个人信息</a>
		<a href="#" class="list-group-item" id="user_query">查询全部用户</a>
	</div>
</div><!--/.sidebar-offcanvas-->