package cn.huiyifyj.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import cn.huiyifyj.bean.Comment;
import cn.huiyifyj.bean.User;
import cn.huiyifyj.dao.connect.CommentConnect;

@WebServlet("/CommentAdd")
public class CommentAdd extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		req.setCharacterEncoding("UTF-8");
		
		resp.setCharacterEncoding("UTF-8");
		resp.setContentType("text/html; charset=UTF-8");
		
		Comment comment = new Comment();
		
		String cContent = req.getParameter("reply");
		
		HttpSession session = req.getSession();
		
		User user = (User) session.getAttribute("loginer");
		
		int userId = user.getUserId();
		
		String userName = user.getName();
		
		int byId = new Integer(req.getParameter("byid"));
		
		comment.setcContent(cContent);
		comment.setById(byId);
		comment.setUserId(userId);

		CommentConnect.save(comment);
		
		resp.sendRedirect("post/" + byId);
		
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		doGet(req, resp);
		
	}
	
}
