package cn.huiyifyj.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cn.huiyifyj.dao.connect.CommentConnect;
import cn.huiyifyj.dao.connect.PostConnect;

@WebServlet("/PostDelete")
public class PostDelete extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		req.setCharacterEncoding("UTF-8");
		
		resp.setCharacterEncoding("UTF-8");
		resp.setContentType("text/html; charset=UTF-8");
		
		String pId = req.getParameter("fid");
		
		//调用该方法删除发帖表的信息
		PostConnect.delete(new Integer(pId));
		//调用该方法删除该发帖表下面的评论信息
		CommentConnect.delete(new Integer(pId));
		
		resp.sendRedirect("myself/mycenter.jsp");
		
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		doGet(req,resp);
		
	}

}
