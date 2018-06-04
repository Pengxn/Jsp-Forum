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
						<a href="#">Create New account</a>
					</div>
				</div>
			</div><!-- Bread Crumbs Nav END -->
			
			<!-- New Account And Right Slid Nav -->
			<div class="container">
				<div class="row">
				
					<!-- Create New Account Nav -->
					<div class="post">
						<form action="#" class="form newtopic" method="post">
							<div class="postinfotop">
								<h2>Create New Account</h2>
							</div>
					
							<!-- acc section 注册时必填项信息 -->
							<div class="accsection">
								<div class="acccap">
									<div class="userinfo pull-left">&nbsp;</div>
									<div class="posttext pull-left">
										<h3>Required</h3>
									</div>
									<div class="clearfix"></div>
								</div>
								<div class="topwrap">
									<div class="userinfo pull-left">
										<div class="avatar">
											<img src="images/avatar-blank.jpg" alt="" />
											<div class="status green">&nbsp;</div>
										</div>
										<div class="imgsize">60 x 60</div>
										<div>
											<button class="btn">Add</button>
										</div>
									</div>
									<div class="posttext pull-left">
										<div>
											<input type="text" placeholder="User Name" class="form-control" />
										</div>
										<div class="row">
											<div class="col-lg-6 col-md-6">
												<input type="password" placeholder="Password" class="form-control" id="pass" name="pass" />
											</div>
											<div class="col-lg-6 col-md-6">
												<input type="password" placeholder="Retype Password" class="form-control" id="pass2" name="pass2" />
											</div>
										</div>
									</div>
									<div class="clearfix"></div>
								</div>  
							</div><!-- acc section END -->
					
							<!-- acc section 隐私选项 -->
							<div class="accsection privacy">
								<div class="acccap">
									<div class="userinfo pull-left">&nbsp;</div>
									<div class="posttext pull-left">
										<h3>Privacy</h3>
									</div>
									<div class="clearfix"></div>
								</div>
								<div class="topwrap">
									<div class="userinfo pull-left">&nbsp;</div>
									<div class="posttext pull-left">
										<div class="row newtopcheckbox">
											<div class="col-lg-6 col-md-6">
												<div>
													<p>Who can see my Profile?</p>
												</div>
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
							</div><!-- acc section END -->
					
							<!-- acc section 注册时的可选项 -->
							<div class="accsection networks">
								<div class="acccap">
									<div class="userinfo pull-left">&nbsp;</div>
									<div class="posttext pull-left">
										<div class="htext">
											<h3>Social Networks ( Optional )</h3>
										</div>
										<div class="hnotice">
											Link Social Networks and Earn this Badge : <img src="images/icon6.jpg" alt="" />
										</div>
										<div class="clearfix"></div>
									</div>
									<div class="clearfix"></div>
								</div>
								<div class="topwrap">
									<div class="userinfo pull-left">&nbsp;</div>
									<div class="posttext pull-left">
										<div class="row">
											<div class="col-lg-6 col-md-6">
												<button class="btn btn-fb">Link Weibo Account</button>
											</div>
											<div class="col-lg-6 col-md-6">
												<button class="btn btn-tw">Link WeChat Account</button>
											</div>
										</div>
									</div>
									<div class="clearfix"></div>
								</div>  
							</div><!-- acc section END -->
					
							<!-- Submit Nav -->
							<div class="postinfobot">
								<div class="notechbox pull-left">
									<input type="checkbox" name="note" id="note" class="form-control" />
								</div>
								<div class="pull-left lblfch">
									<label for="note"> I agree with the Terms and Conditions of this site</label>
								</div>
								<div class="pull-right postreply">
									<div class="pull-left smile">
										<a href="#"><i class="fa fa-smile-o"></i></a>
									</div>
									<div class="pull-left">
										<button type="submit" class="btn btn-primary">Sign Up</button>
									</div>
									<div class="clearfix"></div>
								</div>
								<div class="clearfix"></div>
							</div><!-- Submit Nav END -->
							
						</form>
					</div><!-- Create New Account Nav END -->

				</div>
			</div>
		
		</section>
	
		<!-- footer nav -->
		<jsp:include page="footer.jsp"></jsp:include>
	
	</div>
	
	<!-- get jQuery from the google apis -->
	<script type="text/javascript" src="http://ajax.googleapis.com/ajax/libs/jquery/1.10.1/jquery.js"></script>

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