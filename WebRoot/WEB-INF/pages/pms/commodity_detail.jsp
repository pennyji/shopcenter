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
   	<div class="center_title_bar">Motorola 156 MX-VL</div>
    
    	<div class="prod_box_big">
        	<div class="top_prod_box_big"></div>
            <div class="center_prod_box_big">            
                 
                 <div class="product_img_big">
                 <a href="javascript:popImage('${path}/${product.image}','Some Title')" title="header=[Zoom] body=[&nbsp;] fade=[on]"><img src="${path}/${product.image}" alt="" title="" border="0" /></a>
                 </div>
                     <div class="details_big_box">
                         <div class="product_title_big">${product.pname}</div>
                         <div class="specifications">
                           		分类: <span class="blue">${product.type}</span><br />

                            	详情: <span >${product.detail}</span><br />
                         </div>
                         <div class="prod_price_big"><span class="price">${product.price}</span></div>
                         
                         <a href="#" class="addtocart">加入购物车</a>
                         <a href="#" class="compare">compare</a>
                     </div>                        
            </div>
            <div class="bottom_prod_box_big"></div>                                
        </div>
   </div><!-- end of center content -->
		<!-- end of center content -->
		<jsp:include page="../common/right.jsp" />
	</div><!-- end main content -->
	<jsp:include page="../common/footer.jsp" />
	</div>
</body>

</html>

