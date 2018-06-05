package cn.huiyifyj.servlet;

import java.io.IOException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import cn.huiyifyj.bean.User;
import cn.huiyifyj.dao.connect.UserConnect;

@WebServlet("/Register")
public class Register extends HttpServlet {

	private static final long serialVersionUID = 1L;
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		doGet(req, resp);
		
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		req.setCharacterEncoding("UTF-8");
		
		resp.setCharacterEncoding("UTF-8");
		resp.setContentType("text/html; charset=UTF-8");
		
		String name = req.getParameter("name"); // 用户名
		String pass = req.getParameter("pass"); // 密码
		String pass2 = req.getParameter("pass2"); // 确认密码
		
		HttpSession session = req.getSession();
		
		if (pass.equals(pass2)) {
			
			// todo: 完成判断用户是否存在功能

			Map<Object, Object> map = new HashMap<Object, Object>();

			map.put("name", name);
			map.put("password", pass);

			UserConnect.insert(map);
			
			resp.sendRedirect("login.jsp");
			
		} else {
			resp.sendRedirect("register.jsp");
		}
		
	}

}