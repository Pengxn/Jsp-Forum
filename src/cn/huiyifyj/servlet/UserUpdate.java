package cn.huiyifyj.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import cn.huiyifyj.bean.User;
import cn.huiyifyj.dao.connect.UserConnect;

@WebServlet("/UserUpdate")
public class UserUpdate extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		req.setCharacterEncoding("UTF-8");
		
		resp.setCharacterEncoding("UTF-8");
		resp.setContentType("text/html; charset=UTF-8");
		
		HttpSession session=req.getSession();
		
		User user = (User) session.getAttribute("user");
		
		int userId = user.getUserId();
		String pass = user.getPassword();
		String password = req.getParameter("password");
		
		// 判断用户原密码输入是否正确
		if (password.equals(pass)) {
			
			user.setUserId(userId);
			user.setName(req.getParameter("name"));
			user.setPassword(req.getParameter("q_password"));
			user.setEmail(req.getParameter("email"));
			user.setAddress(req.getParameter("family"));
			user.setIntro(req.getParameter("intro"));
			
			UserConnect.update(user);
			
			resp.sendRedirect("myself/mycenter.jsp");
			
		} else {
			resp.sendRedirect("myself/mycenter.jsp");
		}
		
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		doGet(req, resp);
		
	}

}
