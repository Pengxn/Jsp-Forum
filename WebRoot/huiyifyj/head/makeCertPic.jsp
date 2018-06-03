<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<%@ page import="cn.huiyifyj.servlet.MakeCertPic"%>

<%
	String path = request.getContextPath();
	String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE html>
<html>
<head>
	<meta charset="utf-8">
	<meta content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=0;" name="viewport" />
	
	<base href="<%=basePath%>">
    
    <title>验证码</title>
    
	<link rel="shortcut icon" href="head/images/favicon.ico">
    
    <meta name="description" content="This is forum base on Jsp + MySQL.">
	<meta name="author" content="Huiyi.FYJ | huiyifyj.cn">
	
</head>
<body>
	<jsp:useBean id="image" scope="page" class="cn.huiyifyj.servlet.MakeCertPic"></jsp:useBean>
	
	<%
		String str = image.getCertPic(0,0,response.getOutputStream());
		
		// 将认证码存入session
		session.setAttribute("certCode", str);
		
		out.clear();
		out = pageContext.pushBody();
	%>
</body>
</html>