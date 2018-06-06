package cn.huiyifyj.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
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

	// url /post/* 调用的是 doGet() 方法
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {

		int pId = Integer.parseInt(Tool.getUrlId(req));
		
		Post post = new Post();
		
		Map<Object, Object> m = new HashMap<Object, Object>();
		
		m = PostConnect.getPost(pId);
		
		post.setTitles((String) m.get("title"));
		post.setpContent((String) m.get("pContent"));
		post.setpId((Integer) m.get("pId"));
		post.setUserId((Integer) m.get("userId"));
		post.setUserName((String) m.get("userName"));

		// 这是你点击的单个 Post 页面
		req.setAttribute("post", post);
		
		int byId = pId;
		
		List<Object> commentList = new ArrayList<Object>();
		
		// 这是该页面下的 CommentList
		commentList = CommentConnect.commentQuery(byId);
		
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
