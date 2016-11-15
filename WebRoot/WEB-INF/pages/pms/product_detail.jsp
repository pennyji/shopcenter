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
                 <a href="javascript:popImage('images/big_pic.jpg','Some Title')" title="header=[Zoom] body=[&nbsp;] fade=[on]"><img src="${path }/images/laptop.gif" alt="" title="" border="0" /></a>
                 <div class="thumbs">
                 <a href="#" title="header=[Thumb1] body=[&nbsp;] fade=[on]"><img src="${path }/images/thumb1.gif" alt="" title="" border="0" /></a>
                 <a href="#" title="header=[Thumb2] body=[&nbsp;] fade=[on]"><img src="${path }/images/thumb1.gif" alt="" title="" border="0" /></a>
                 <a href="#" title="header=[Thumb3] body=[&nbsp;] fade=[on]"><img src="${path }/images/thumb1.gif" alt="" title="" border="0" /></a>
                 </div>
                 </div>
                     <div class="details_big_box">
                         <div class="product_title_big">${product.detail}</div>
                         <div class="specifications">
                            

                          	  品质有保障: <span class="blue">一旦发货概不退换</span><br />
                            
                                                                        商品名称: <span class="blue">${product.pname}</span><br />
                            
                                                                             
                         </div>
                         <div class="prod_price_big">价格：<span class="price">${product.price}</span></div>
                         
                         <a href="#" class="addtocart">添加到购物车</a>
                         <a href="#" class="compare">进行比较</a>
                     </div>                        
            </div>
            <div class="bottom_prod_box_big"></div>                                
        </div>
   </div>
		<!-- end of center content -->
		<jsp:include page="../common/right.jsp" />
	</div><!-- end main content -->
	<jsp:include page="../common/footer.jsp" />
	</div>
</body>

</html>
