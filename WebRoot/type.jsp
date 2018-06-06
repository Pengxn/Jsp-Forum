<%@page import="cn.huiyifyj.bean.User"%>
<%@page import="cn.huiyifyj.dao.UserDao"%>
<%@page import="cn.huiyifyj.dao.query.UserQuery"%>
<%@page import="cn.huiyifyj.dao.connect.UserConnect"%>
<%@page import="cn.huiyifyj.util.Tool"%>

<%@page import="java.util.Map"%>
<%@page import="java.util.HashMap"%>

<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<%
	String path = request.getContextPath();
	String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
	
	req.setAttribute("post", post);
%>

<%
	User user = new User();
	
	user = (User) session.getAttribute("loginer");
%>

<div class="post">
	<form action="CommentAdd" class="form" method="post">
		<div class="topwrap">
			<div class="userinfo pull-left">
				<div class="avatar">
				
					<%
						if (user == null) { // 未登录 
					%>
					<img src="images/avatar/avatar-blank.jpg" alt="Unlogin" />
					<%
						} else {
							String name = user.getName();
							
							int userId = user.getUserId();
					%>
					<img src="images/avatar/avatar<%= userId %>.jpg" alt="<%= name %>" >
					<%
						}
					%>

					<div class="status green">&nbsp;</div>
				</div>
				<div class="icons">
					<img src="images/icon3.jpg" alt="" /><img src="images/icon4.jpg" alt="" />
					<img src="images/icon5.jpg" alt="" /><img src="images/icon6.jpg" alt="" />
				</div>
			</div>
			<div class="posttext pull-left">
				<div class="textwraper">
					<div class="postreply">Post Your Reply</div>
					<textarea name="reply" id="reply" placeholder="Type your message here"></textarea>
				</div>
			</div>
			<div class="clearfix"></div>
		</div>
		<div class="postinfobot">
			<div class="pull-right postreply">
				<div class="pull-left smile">
					<a href="#">
						<i class="fa fa-smile-o"></i>
					</a>
				</div>
				<div class="pull-left">
				
					<%
						if (user == null) { // 未登录 
					%>
					<a href="login.jsp">
						<button type="button" class="btn btn-primary">Post Reply</button>
					</a>
					<%
						} else {
					%>
					<button type="submit" class="btn btn-primary">Post Reply</button>
					<%
						}
					%>

				</div>
				<div class="clearfix"></div>
			</div>
			<div class="clearfix"></div>
		</div>
	</form>
</div><!-- Type Comment Nav END -->