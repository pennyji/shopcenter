<%@ page language="java" pageEncoding="UTF-8" %>
<%@taglib prefix="shiro" uri="http://shiro.apache.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>  
<%@ taglib uri="http://www.opensymphony.com/oscache" prefix="cache"%>

<script>


$(function(){
	
	$("#product").click(function(){
		alert("!!!!");
		
	});
	
	$("#creatuser").click(function(){
		window.location = _path + "/ums/creat/register";
	});
	
	$("#orderlist").click(function(){
		window.location = "${pageContext.request.contextPath}/taishan/list";
	});
	
	$("#addorder").click(function(){
		window.location = "${pageContext.request.contextPath}/taishan/save";
	});
		
});



</script>

	  <div class="col-xs-6 col-sm-2 sidebar-offcanvas" id="sidebar" role="navigation">
          <div class="list-group">
 
            <a href="#" class="list-group-item" id ="product">商品列表</a>
      
   
          </div>
        </div><!--/.sidebar-offcanvas-->