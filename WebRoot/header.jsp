<%@page import="cn.huiyifyj.bean.User"%>

<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!-- Slider Banner Nav -->
<div class="tp-banner-container">
	<div class="tp-banner" >
		<ul>
			<!-- SLIDE  -->
			<li data-transition="fade" data-slotamount="7" data-masterspeed="1500" >
			<!-- MAIN IMAGE -->
			<img src="images/slide.jpg"  alt="slidebg1"  data-bgfit="cover" data-bgposition="left top" data-bgrepeat="no-repeat">
			<!-- LAYERS -->
			</li>
		</ul>
	</div>
</div>
<!-- Slider Banner Nav END -->

<!-- header nav -->
<div class="headernav">
	<div class="container">
		<div class="row">
		
			<!-- Left Side Nav -->
			<div class="col-lg-1 col-xs-3 col-sm-2 col-md-2 logo ">
				<a href="index.jsp">
					<img src="images/logo.jpg" alt="logo" />	<!-- Logo Nav -->
				</a>
			</div>
			<div class="col-lg-3 col-xs-9 col-sm-5 col-md-3 selecttopic">
				<div class="dropdown">
					<a data-toggle="dropdown" href="#" >
						Topic One <b class="caret"></b>
					</a>
					<ul class="dropdown-menu" role="menu">
						<li role="presentation"><a role="menuitem" tabindex="-1" href="#">Topic One</a></li>
						<li role="presentation"><a role="menuitem" tabindex="-2" href="#">Topic Two</a></li>
						<li role="presentation"><a role="menuitem" tabindex="-3" href="#">Topic Three</a></li>
					</ul>
				</div>
			</div>
			<!-- Left Side Nav -->
			
			<!-- Search Nav -->
			<div class="col-lg-4 search hidden-xs hidden-sm col-md-3">
				<div class="wrap">
					<form action="#" method="post" class="form">
						<div class="pull-left txt">
							<input type="text" class="form-control" placeholder="Search Topics">
						</div>
						<div class="pull-right">
							<button class="btn btn-default" type="button"><i class="fa fa-search"></i></button>
						</div>
						<div class="clearfix"></div>
					</form>
				</div>
			</div><!-- Search Nav END -->
			
			<!-- Right Side Nav -->
			<div class="col-lg-4 col-xs-12 col-sm-5 col-md-4 avt">
				<div class="stnt pull-left">
					<form action="post.jsp" method="post" class="form">
						<button class="btn btn-primary">New a Topic</button>
					</form>
				</div>
				
				<!-- 判断用户是否登陆 -->
				<c:if test="${empty user}">		<!-- 未登录 -->
				
				<div class="env pull-left">
					<a href="index.jsp#">Login</a>
				</div>
				
				</c:if>
				<c:if test="${!empty user}">	<!-- 已登陆 -->
				
				<div class="env pull-left">
					<i class="fa fa-envelope"></i>
				</div>
				<!-- avatar nav -->
				<div class="avatar pull-left dropdown">
					<a data-toggle="dropdown" href="#">

						<img src="images/avatar.jpg" alt="" >

						<b class="caret"></b>
					</a>
					<div class="status green">&nbsp;</div>
					<ul class="dropdown-menu" role="menu">
						<li role="presentation">
							<a role="menuitem" tabindex="-1" href="#">My Profile</a>
						</li>
						<li role="presentation">
							<a role="menuitem" tabindex="-2" href="#">Unread</a>
						</li>
						<li role="presentation">
							<a role="menuitem" tabindex="-3" href="Exit">Log Out</a>	<!-- 调用 servlet.Exit -->
						</li>
					</ul>
				</div><!-- avatar nav END -->
				
				</c:if>
				
				<div class="clearfix"></div>
			</div><!-- Right Side Nav -->
				
		</div>
	</div>
</div>
