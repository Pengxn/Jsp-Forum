package cn.huiyifyj.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import cn.huiyifyj.bean.Post;
import cn.huiyifyj.bean.User;
import cn.huiyifyj.dao.connect.PostConnect;

//3.0以上使用@WebServlet注解，web.xml不再是必须；"/PostAdd": url路径
@WebServlet("/PostAdd")
public class PostAdd extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {

		doPost(req, resp);

	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		req.setCharacterEncoding("UTF-8");
		
		resp.setCharacterEncoding("UTF-8");
		resp.setContentType("text/html; charset=UTF-8");
		
		// 存放标题和内容
		String title = req.getParameter("title");
		String pContent = req.getParameter("pContent");;
		
		HttpSession session = req.getSession();
		
		User user = (User) session.getAttribute("loginer");
		
		int userId = user.getUserId();
		String userName = user.getName();
		
		Post post = new Post();
		
		// 将发帖的图片信息插入数据库
		post.setTitles(title);
		post.setpContent(pContent);
		post.setUserId(userId);
		post.setUserName(userName);
		
		PostConnect.save(post);
		
		resp.sendRedirect("index.jsp");	// 	其实更好的应该是去跳向帖子内容页面
		
	}

}
