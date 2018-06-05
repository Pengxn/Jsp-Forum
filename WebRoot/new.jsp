<%@page import="cn.huiyifyj.bean.User"%>
<%@page import="cn.huiyifyj.dao.UserDao"%>
<%@page import="cn.huiyifyj.dao.query.UserQuery"%>
<%@page import="cn.huiyifyj.dao.connect.UserConnect"%>

<%@page import="java.util.Map"%>
<%@page import="java.util.HashMap"%>

<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<%
	String path = request.getContextPath();
	String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<%
	User user = new User();
	
	user = (User) session.getAttribute("loginer");
	
	String name = user.getName();
	
	int userId = user.getUserId();
%>

<!DOCTYPE html>
<html lang="en">
<head>
	<meta charset="utf-8">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	
	<title>New topic</title>
	
	<!-- logo -->
	<link rel="shortcut icon" href="favicon.png">

	<!-- Bootstrap -->
	<link href="css/bootstrap.min.css" rel="stylesheet">

	<!-- Custom -->
	<link href="css/custom.css" rel="stylesheet">

	<!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
	<!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
	<!--[if lt IE 9]>
		<script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
		<script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
	<![endif]-->
	
	<!-- fonts -->
	<link href='http://fonts.googleapis.com/css?family=Open+Sans:300italic,400italic,600italic,700italic,800italic,400,300,600,700,800' rel='stylesheet' type='text/css'>
	<link rel="stylesheet" href="font-awesome-4.0.3/css/font-awesome.min.css">

	<!-- CSS STYLE-->
	<link rel="stylesheet" type="text/css" href="css/style.css" media="screen" />

	<!-- SLIDER REVOLUTION 4.x CSS SETTINGS -->
	<link rel="stylesheet" type="text/css" href="rs-plugin/css/settings.css" media="screen" />

</head>
<body>

	<div class="container-fluid">
	
		<!-- Header Nav -->
		<jsp:include page="header.jsp"></jsp:include>
		
		<!-- Content Nav -->
		<section class="content">
		
			<!-- Bread Crumbs Nav -->
			<div class="container">
				<div class="row">
					<div class="col-lg-8 breadcrumbf">
						<a href="#">Topic One</a> <span class="diviver">&gt;</span> <a href="#">General Discussion</a> <span class="diviver">&gt;</span> <a href="#">New Topic</a>
					</div>
				</div>
			</div><!-- Bread Crumbs Nav END -->
			
			<div class="container">
				<div class="row">
				
					<!-- New a Topic Nav -->
					<div class="col-lg-8 col-md-8">
					
					<!-- Type Word Nav -->
					<div class="post">
						<form action="PostAdd" class="form newtopic" method="post"> <!-- New Post Form -->
							<div class="topwrap">
								<div class="userinfo pull-left">
									<div class="avatar">
										<img src="images/avatar/avatar<%= userId %>.jpg" alt="<%= name %>" >
										<div class="status red">&nbsp;</div>
									</div>
									<div class="icons">
										<img src="images/icon3.jpg" alt="" /><img src="images/icon4.jpg" alt="" /><img src="images/icon5.jpg" alt="" /><img src="images/icon6.jpg" alt="" />
									</div>
								</div>
								<div class="posttext pull-left">
									<div>
										<input type="text" placeholder="Title(at most 50 chars)" class="form-control" name="title" />
									</div>
									<div class="row">
										<div class="col-lg-6 col-md-6">
											<select name="category" id="category"  class="form-control" >
												<option value="" disabled selected>Select Category</option>
												<option value="op1">Option1</option>
												<option value="op2">Option2</option>
											</select>
										</div>
									</div>
									<div>
										<textarea name="pContent" id="desc" placeholder="Description(at most 300 chars)"  class="form-control" ></textarea>
									</div>
									<div class="row newtopcheckbox">
										<div class="col-lg-6 col-md-6">
											<div><p>Who can see this?</p></div>
											<div class="row">
												<div class="col-lg-6 col-md-6">
													<div class="checkbox">
														<label>
															<input type="checkbox" id="everyone" /> Everyone
														</label>
													</div>
												</div>
												<div class="col-lg-6 col-md-6">
													<div class="checkbox">
														<label>
															<input type="checkbox" id="friends"  /> Only Friends
														</label>
													</div>
												</div>
											</div>
										</div>
									</div>
								</div>
								<div class="clearfix"></div>
							</div>                              
							<div class="postinfobot">
								<div class="pull-right postreply">
									<div class="pull-left smile">
										<a href="#"><i class="fa fa-smile-o"></i></a>
									</div>
									<div class="pull-left"><button type="submit" class="btn btn-primary">Post</button></div>
									<div class="clearfix"></div>
								</div>
								<div class="clearfix"></div>
							</div>
						</form>
					</div><!-- Type Word Nav END -->
						
						<!-- Feedback Nav -->
						<div class="row similarposts">
							<div class="col-lg-10">
								<i class="fa fa-info-circle"></i>
								<p>Have Some Question? <a href="mailto://i@huiyifyj.cn">Email Me.</a></p>
							</div>
							<div class="col-lg-2 loading">
								<i class="fa fa-spinner"></i>
							</div>
						</div><!-- Feedback Nav END -->
					
					</div><!-- New a Topic Nav END -->
				
					<!-- Right Side Nav -->
					<div class="col-lg-4 col-md-4">
				
						<!-- category nav -->
						<jsp:include page="category.jsp"></jsp:include>
						
						<!-- Poll of Week Nav -->
						<jsp:include page="poll.jsp"></jsp:include>
						
						<!-- Active Threads Nav -->
						<jsp:include page="active.jsp"></jsp:include>
						
					</div>
				
				</div>
			</div>
		
		</section>
		
		<!-- footer nav -->
		<jsp:include page="footer.jsp"></jsp:include>
	
	</div>
	
	<!-- jQuery -->
	<script type="text/javascript" src="js/jquery.js"></script>

	<!-- SLIDER REVOLUTION 4.x SCRIPTS  -->
	<script type="text/javascript" src="rs-plugin/js/jquery.themepunch.plugins.min.js"></script>
	<script type="text/javascript" src="rs-plugin/js/jquery.themepunch.revolution.min.js"></script>

	<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
	<!-- Include all compiled plugins (below), or include individual files as needed -->
	<script src="js/bootstrap.min.js"></script>

	<!-- LOOK THE DOCUMENTATION FOR MORE INFORMATIONS -->
	<script type="text/javascript">
		var revapi;

		jQuery(document).ready(function() {
			"use strict";
			revapi = jQuery('.tp-banner').revolution(
				{
					delay: 15000,
					startwidth: 1200,
					startheight: 278,
					hideThumbs: 10,
					fullWidth: "on"
				});
			});	//ready
	</script>

	<!-- END REVOLUTION SLIDER -->

</body>