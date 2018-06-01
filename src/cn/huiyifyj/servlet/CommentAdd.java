package cn.huiyifyj.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cn.huiyifyj.bean.Comment;
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
		
		comment.setcContent(req.getParameter("pinglun_m"));
		comment.setUserId(new Integer(req.getParameter("userid")));
		comment.setById(new Integer(req.getParameter("byid")));
		
		System.out.println("评论增加成功");
		
		CommentConnect.save(comment);
		
		resp.sendRedirect("index.jsp");
		
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		doGet(req, resp);
		
	}
	
}
