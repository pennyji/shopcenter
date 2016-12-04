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
   	<div class="center_title_bar">联系我们</div>
    
    	<div class="prod_box_big">
        	<div class="top_prod_box_big"></div>
            <div class="center_prod_box_big">            
                 
              	<div class="contact_form">
                           
                    <div class="form_row">
                    <label class="contact"><strong>姓名：</strong></label>
                    <input type="text" class="contact_input" />
                    </div>  

                    <div class="form_row">
                    <label class="contact"><strong>邮箱：</strong></label>
                    <input type="text" class="contact_input" />
                    </div>


                    <div class="form_row">
                    <label class="contact"><strong>电话：</strong></label>
                    <input type="text" class="contact_input" />
                    </div>
                  


                    <div class="form_row">
                    <label class="contact"><strong>留言：</strong></label>
                    <textarea class="contact_textarea" ></textarea>
                    </div>

                    
                    <div class="form_row">
                    <a href="#" class="contact">发送</a>
                    </div>      
                    
                </div> 
                
                                     
            </div>
            <div class="bottom_prod_box_big"></div>                                
        </div>
       
    
   
   </div><!-- end of center content -->
		<jsp:include page="../common/right.jsp" />
	</div><!-- end main content -->
	<jsp:include page="../common/footer.jsp" />
	</div>
</body>

</html>
