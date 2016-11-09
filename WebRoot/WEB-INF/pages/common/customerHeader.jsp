<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<div>
	<span>欢迎 <a href="${path }/ums/userUpdate/showEdit">${sessionScope.LOGIN_USER.nickname }</a> 
	来到cheer商城!</span>
	<a href="${path }/ums/user/logout" onclick="javascript:sessionStorage.clear();">退出登录</a>
</div>