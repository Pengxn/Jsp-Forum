<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<%
	String path = request.getContextPath();
	String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE html>
<html lang="en">
<head>
	<meta charset="utf-8">
	<meta name="viewport" content="width=device-width, initial-scale=1">

	<title>Forum :: New account</title>
	
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
<body class="newaccountpage">

	<div class="container-fluid">
	
		<!-- header nav -->
		<jsp:include page="header.jsp"></jsp:include>

		<!-- content nav -->
		<section class="content">
		
			<!-- Bread Crumbs Nav -->
			<div class="container">
				<div class="row">
					<div class="col-lg-8 breadcrumbf">
						<a href="#">To Your Profile</a>
					</div>
				</div>
			</div><!-- Bread Crumbs Nav END -->

			<div class="container">
				<div class="row">
					<div class="col-lg-8 col-md-8">

						<!-- Login Nav -->
						<div class="post">
							<form action="Login" class="form newtopic" method="post">	<!-- Login Form -->
								<div class="postinfotop">
									<h2>Login</h2>
								</div>
						
								<!-- acc section 登陆时必填项信息 -->
								<div class="accsection">
									<div class="topwrap">
										<div class="userinfo pull-left">
											<div class="avatar">
												<img src="images/logo.jpg" alt="Logo" />
											</div>
										</div>
										<div class="posttext pull-left">
											<div class="row">
												<div class="col-lg-6 col-md-6">
													<input type="text" name="name" placeholder="User Name" class="form-control" />
												</div>
											</div>
											<div class="row">
												<div class="col-lg-6 col-md-6">
													<input type="text" name="password" placeholder="Password" class="form-control" />
												</div>
											</div>
										</div>
										<div class="clearfix"></div>
									</div>
								</div><!-- acc section END -->
								
								<div class="accsection networks">
									<div class="acccap">
										<div class="userinfo pull-left">&nbsp;</div>
										<div class="posttext pull-left">
											<a href="register.jsp">
												<h3>New a Account</h3>
											</a>
										</div>
									</div>
								</div>
	
								<div class="postinfobot">
									<div class="pull-left lblfch">
										<a href="#">Forget Your Password</a>
									</div>
									<div class="pull-right postreply">
										<div class="pull-left smile">
											<a href="#">
												<i class="fa fa-smile-o"></i>
											</a>
										</div>
										<div class="pull-left">
											<button type="submit" class="btn btn-primary">Login</button>
										</div>
										<div class="clearfix"></div>
									</div>
									<div class="clearfix"></div>
								</div>
								
							</form>
						</div><!-- Login Nav END -->

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