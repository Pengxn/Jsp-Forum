package cn.huiyifyj.servlet;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileItemFactory;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

import cn.huiyifyj.bean.User;
import cn.huiyifyj.dao.connect.ViaConnect;

@WebServlet("/UserPhoto")
public class UserPhoto extends HttpServlet {
	
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		req.setCharacterEncoding("UTF-8");
		resp.setCharacterEncoding("UTF-8");
		resp.setContentType("text/html; charset=UTF-8");
		
		// 存放构造的文件（图片）名
		File fullFile = null;
		
		HttpSession session = req.getSession();
		
		User user = (User) session.getAttribute("user");
		
		int userId = user.getUserId();
		
		/**
		 * 将头像上传保存到相应目录
		 * 
		 */
		// 获取当前项目目录
		String pa = getServletContext().getRealPath("/");
		
		pa = pa.substring(0, pa.indexOf("\\.")).replace("\\", "/");
		
		String th = req.getContextPath().replace("\\", "/");
		
		System.out.println(pa + th);
		
		String uploadPath = (pa + th) + "/WebRoot/uploda";
		
		boolean isMultipart = ServletFileUpload.isMultipartContent(req);
		
		if (isMultipart == true) {
			
			try {
				
				FileItemFactory factory = new DiskFileItemFactory();
				ServletFileUpload upload = new ServletFileUpload(factory);
				List<FileItem> items = upload.parseRequest(req);// 得到所有的文件
				Iterator<FileItem> itr = items.iterator();

				// 改写格式
				Date date = new Date();
				
				String time = date.toLocaleString();
				time = time.replace(" ", "_");
				time = time.replace("-", "_");
				time = time.replace(":", "_");
				
				// 依次处理每个文件
				while (itr.hasNext()) {
					
					FileItem item = (FileItem) itr.next();
					String fileName = item.getName();// 获得文件名，包括路径
					if (fileName != null) {

						fullFile = new File(time +"_id"+ userId+"_" + item.getName());
						
						File savedFile = new File(uploadPath, fullFile.getName());
						item.write(savedFile);
						
					}
				}
				
				System.out.println("上传成功");
				
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		} else {
			System.out.println("enctype必须是 multipart/form-data");
		}
		
		Map<Object, Object> map = ViaConnect.query(userId);
		
		if (null == map.get("photo")) {
			
			//将头像信息插入数据库
			ViaConnect.save(userId, fullFile.getName());
			
			System.out.println("进行了头像首次插入");
			
		} else {
			
			//修改头像信息
			ViaConnect.update(userId, fullFile.getName());
			
			System.out.println("进行了头像修改");
			
		}
		
		resp.sendRedirect("myself/mycenter.jsp");
		
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		doGet(req, resp);
		
	}

}
