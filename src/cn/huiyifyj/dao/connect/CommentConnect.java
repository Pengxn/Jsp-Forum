package cn.huiyifyj.dao.connect;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import cn.huiyifyj.dao.PostDao;
import cn.huiyifyj.dao.CommentDao;
import cn.huiyifyj.dao.query.PostQuery;
import cn.huiyifyj.dao.query.CommentQuery;
import cn.huiyifyj.bean.Post;
import cn.huiyifyj.bean.Comment;
import cn.huiyifyj.util.ConnectDb;

public class CommentConnect {

	static Connection conn = null;
	
	/**
	 * 向评论表添加信息
	 */
	public static void save(Comment comment) {
		
		try {
			
			conn = ConnectDb.getInstance().makeConnection();
			conn.setAutoCommit(false);

			CommentDao commentDao = new CommentQuery();
			
			commentDao.save(conn, comment);
			
			conn.commit();
			
		} catch (SQLException e) {
			
			try {
				conn.rollback();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
			
		} finally {
			
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
		}
	}
	
	/**
	 * 获得评论表信息
	 */
	public static List<Object> PinglunQuery(int byId) {

		List<Object> list = new ArrayList<Object>();
		
		try {
			
			conn = ConnectDb.getInstance().makeConnection();
			conn.setAutoCommit(false);
			
			CommentDao commentDao = new CommentQuery();
			Comment comment = new Comment();

			comment.setById(byId);
			
			ResultSet rs = commentDao.query(conn, comment);

			for (int i = 0; rs.next(); i++) {
				
				/**
				 * 要想向list插入不同HashMap的值，必须要将HashMap new在for循环内，因为存入list的是HashMap的地址，不是值。。
				 */
				Map<Object, Object> map = new HashMap<Object, Object>();
				map.put("pid", rs.getInt(1));
				map.put("pcontent", rs.getString(2));
				map.put("userid", rs.getInt(3));
				map.put("byid", rs.getInt(4));
				map.put("time", rs.getString(5));
				
				list.add(i, map);
				
			}
			conn.commit();
			
		} catch (SQLException e) {
			
			try {
				conn.rollback();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
			
		}
		
		return list;
		
	}
	
	/**
	 * 通过 byId 删除发帖表对于的评论的信息
	 */
	public static void delete(int byId) {
		
		try {
			
			ConnectDb.getInstance().makeConnection();
			conn.setAutoCommit(false);
			
			CommentDao commentDao = new CommentQuery();
			Comment comment = new Comment();
			
			comment.setById(byId);
			
			commentDao.delete(conn, comment);
			
			conn.commit();
			
		} catch (SQLException e) {
			
			try {
				conn.rollback();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
			
		}finally {
			
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
		}
		
	}
	
	/**
	 * 通过 cId 删除评论信息
	 */
	public static void deletePid(int cId) {
		
		try {
			
			ConnectDb.getInstance().makeConnection();
			conn.setAutoCommit(false);
			
			CommentDao commentDao = new CommentQuery();
			Comment comment = new Comment();
			
			comment.setcId(cId);
			
			commentDao.deleteCId(conn, comment);
			
			conn.commit();
			
		} catch (SQLException e) {
			
			try {
				conn.rollback();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
			
		}finally {
			
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
		}
		
	}
	
}