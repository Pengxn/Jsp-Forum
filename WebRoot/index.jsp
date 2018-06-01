<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML>
<html>
<head>
	<meta charset="utf-8">
	<meta content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=0;" name="viewport" />
	
    <base href="<%=basePath%>">
    
    <title>Forum | 首页</title>
    
    <link rel="shortcut icon" href="favicon.ico">
    
	<meta name="description" content="This is forum base on Jsp + MySQL.">
	
</head>
<body>

	<jsp:include page="head/head.jsp"></jsp:include>
	<jsp:include page="content/content.jsp"></jsp:include>

</body>
</html>
