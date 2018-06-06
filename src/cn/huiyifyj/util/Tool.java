package cn.huiyifyj.util;

import javax.servlet.http.HttpServletRequest;

public class Tool {

	// 获取当前帖子页面的帖子ID
	public static String getUrlId(HttpServletRequest req){
		
		String s1 = req.getContextPath()+req.getServletPath()+"/";
		String s2 = req.getRequestURI();
		
		String s3 = s2.replaceAll(s1, "");
		
		return s3;
	}
	
	// 获取真实的IP
	public static String getRemortIP(HttpServletRequest request) {
		
		if (request.getHeader("x-forwarded-for") == null) { 
			return request.getRemoteAddr(); 
		}
		
		return request.getHeader("x-forwarded-for"); 
	} 

}
