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

//3.0以上使用@WebServlet注解，web.xml不再是必须；"/LoginServlet": url路径
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		req.setCharacterEncoding("UTF-8");
		
		resp.setCharacterEncoding("UTF-8");
		resp.setContentType("text/html; charset=UTF-8");
		
		String name = req.getParameter("name"); // 用户名
		String pass = req.getParameter("pass"); // 密码
		String qr_pass = req.getParameter("qr_pass"); // 确认密码
		String code = req.getParameter("code"); // 验证码
		
		HttpSession session = req.getSession();
		
		Map<Object, Object> map = new HashMap<Object, Object>();
		Map<Object, Object> map_r = new HashMap<Object, Object>();
		
		map_r.put("name", name);
		map_r.put("password", pass);
		
		Map<Object, Object> map2 = new HashMap<Object, Object>();
		
		if (null == name) {
			
			String[] queryStrings = req.getQueryString().split("&");
			String key;
			String value;
			
			for (String queryString : queryStrings) {
				
				key = queryString.split("=")[0];
				value = queryString.split("=")[1];
				
				value = URLDecoder.decode(value, "UTF-8");
				
				map2.put(key, value);
				
				System.out.println("11->:" + key + " : " + value);
				
			}
			
			name = (String) map2.get("name2");
			
		}
		
		map = UserConnect.Login(name);
		
		/**
		 * 判断是登录还是注册,true是登录
		 */
		
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.doPost(req, resp);
	}
	
	

}
