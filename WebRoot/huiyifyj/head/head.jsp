<%@page import="cn.huiyifyj.bean.User"%>

<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<% 
	String path = request.getContextPath(); 
	String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/"; 
%> 

<!DOCTYPE html>
<html>
<head>
	<meta charset="utf-8">
	<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
	
	<title>论坛头部</title>
	
	<link rel="shortcut icon" href="head/images/favicon.ico">
    
	<meta name="description" content="This is forum base on Jsp + MySQL.">
	<meta name="author" content="Huiyi.FYJ | huiyifyj.cn">
    
    <!-- css file -->
  	<link rel="stylesheet" href="head/css/zerogrid.css">
	<link rel="stylesheet" href="head/css/style.css">
	<link rel="stylesheet" href="head/css/css.css">
    <link rel="stylesheet" href="head/css/responsive.css">
</head>
<body>

<div class="wrap-body">
<!----------------------------Header------------------------------------>
<header>
	<div class="wrap-header zerogrid">
		<div id="logo">
			<a href="index.jsp">
				<img src="Head/images/logo.png"/>
			</a>
		</div>
		
		<nav>
			<div class="wrap-nav">
				<div class="menu">
					<ul>
						<li><a href="index.jsp">首页</a></li>
						<li><a href="index.jsp#">个人</a></li>
						<li><a href="index.jsp#">关于</a></li>
						<li><a href="index.jsp#">联系</a></li>
						
						<c:if test="${empty user}">
							<li><a href="index.jsp#" class="tc">登录</a></li>
						</c:if>
						
						<c:if test="${!empty user}">
							<li class="menu1">
							<a href="#">${user.getName()}</a>
							 <ul class="menu2">
				                <li class="list2"><a href="myself/mycenter.jsp">个人主页</a></li>
				                <li class="list2"><a href="Exit">退出</a></li>
				            </ul>	
							</li>
						</c:if>
						
					</ul>
				</div>
			</div>
		</nav>
		
	</div>
</header>
<!----------------------------Header-end------------------------------------>

<!----------------------- 登录、注册 ------------------------------->
<jsp:include page="../head/login/login.jsp"></jsp:include>
<!----------------------- 登录、注册-end ------------------------------->

<!-- js -->
<script type="text/javascript" src="head/login/js/js.js"></script>

</div>
</body>
</html>