<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"
%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<c:set var="ctx" value="${pageContext.request.contextPath }" />
<%
  String path = request.getContextPath();
  String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>   
        <div class="footer">
        <div class="left_footer">
        <img src="/shopcenter/images/footer_logo.png" alt="" title="" width="170" height="49"/>
        </div>    
        <div class="center_footer">
        版权所有：其然软件<br />
        <a href="http://www.houxue.com/xuexiao/91936/">cheer</a><br />
        <img src="/shopcenter/images/payment.gif" alt="" title="" />
        </div>
        
        <div class="right_footer">
        <a href="index.html">首页</a>
        <a href="contact.html">联系我们</a>
        </div>    
   </div>  