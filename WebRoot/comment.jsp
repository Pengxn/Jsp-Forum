<%@page import="cn.huiyifyj.util.Tool"%>
<%@page import="cn.huiyifyj.bean.Post"%>
<%@page import="cn.huiyifyj.dao.connect.PostConnect"%>
<%@page import="cn.huiyifyj.bean.Comment"%>

<%@page import="java.util.Map"%>
<%@page import="java.util.HashMap"%>
<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>

<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<%
	String path = request.getContextPath();
	String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<%
	List<Object> commentList = new ArrayList<Object>();

	commentList = (List<Object>) request.getAttribute("comment");
	
	if (commentList == null || commentList.size() == 0) {
%>
<!-- Black Page -->
<%
	} else {
	
		for (int i = 0; i < commentList.size(); i ++) {
						
			Map<Object, Object> m = (Map<Object, Object>) commentList.get(i);
							
			int userId = (Integer) m.get("userId");
							
			String cContent = (String) m.get("cContent");
%>

<div class="post">
	<div class="topwrap">
		<div class="userinfo pull-left">
			<div class="avatar">
				<img src="images/avatar/avatar<%= userId %>.jpg" alt="" />
				<div class="status red">&nbsp;</div>
			</div>
		</div>
		<div class="posttext pull-left">
			<p>
				<%= cContent %>
			</p>
		</div>
		<div class="clearfix"></div>
	</div>
	<div class="postinfobot">
		<div class="likeblock pull-left">
			<a href="#" class="up">
				<i class="fa fa-thumbs-o-up"></i>10
			</a>
			<a href="#" class="down">
				<i class="fa fa-thumbs-o-down"></i>1
			</a>
		</div>
		<div class="prev pull-left">
			<a href="#">
				<i class="fa fa-reply"></i>
			</a>
		</div>
		<div class="posted pull-left">
			<i class="fa fa-clock-o"></i> Posted on : 20 Nov @ 9:45am
		</div>
		<div class="next pull-right">
			<a href="#">
				<i class="fa fa-share"></i>
			</a>
			<a href="#">
				<i class="fa fa-flag"></i>
			</a>
		</div>
		<div class="clearfix"></div>
	</div>
</div><!-- Comment Nav END -->

<%
		}
	}
%>