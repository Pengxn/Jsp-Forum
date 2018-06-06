package cn.huiyifyj.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cn.huiyifyj.dao.connect.CommentConnect;
import cn.huiyifyj.dao.connect.PostConnect;
import cn.huiyifyj.bean.Post;
import cn.huiyifyj.util.Tool;

public class GetPost extends HttpServlet {

	private static final long serialVersionUID = 1L;

	// url 为 /post/* 调用的是 doGet() 方法
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {

		int pId = Integer.parseInt(Tool.getUrlId(req));
		
		Post post = new Post();
		
		post = PostConnect.getPost(pId);

		// 这是你点击的单个 Post 页面
		req.setAttribute("post", post);
		
		int byId = pId;
		
		// 这是该页面下的 CommentList
		List<Object> commentList = CommentConnect.commentQuery(byId);
		
		req.setAttribute("comment", commentList);
		
		RequestDispatcher rd;
		rd = req.getRequestDispatcher("/post.jsp");
		rd.forward(req, resp);
		
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		doGet(req, resp);
		
	}

}
