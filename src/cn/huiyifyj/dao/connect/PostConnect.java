package cn.huiyifyj.dao.connect;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import cn.huiyifyj.dao.PostDao;
import cn.huiyifyj.dao.query.PostQuery;
import cn.huiyifyj.bean.Post;
import cn.huiyifyj.util.ConnectDb;

public class PostConnect {
	
	static Connection conn = null;
	
	// 获得发帖表信息
	public static List<Object> PostQuery() {

		List<Object> list = new ArrayList<Object>();
		
		try {
			
			conn = ConnectDb.getInstance().makeConnection();
			conn.setAutoCommit(false);
			
			PostDao postDao = new PostQuery();
			Post post = new Post();

			ResultSet rs = postDao.query(conn, post);

			for (int i = 0; rs.next(); i++) {
				
				// 要想向list插入不同HashMap的值，必须要将HashMap new在for循环内，因为存入list的是HashMap的地址，不是值。。
				Map<Object, Object> map = new HashMap<Object, Object>();
				
				map.put("pId", rs.getInt(1));
				map.put("title", rs.getString(2));
				map.put("pContent", rs.getString(3));
				map.put("userId", rs.getInt(4));
				map.put("time", rs.getString(5));
				map.put("userName", rs.getString(6));
				
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
	 * 通过 userId 查询发帖表信息
	 */
	public static List<Object> QueryId(int userId) {

		List<Object> list = new ArrayList<Object>();
		
		try {
			
			conn = ConnectDb.getInstance().makeConnection();
			conn.setAutoCommit(false);
			
			PostDao postDao = new PostQuery();
			Post post = new Post();

			post.setUserId(userId);
			
			ResultSet rs = postDao.queryId(conn, post);

			for (int i = 0; rs.next(); i++) {
				
				/**
				 * 要想向list插入不同HashMap的值，必须要将HashMap new在for循环内，因为存入list的是HashMap的地址，不是值。。
				 */
				Map<Object, Object> map = new HashMap<Object, Object>();
				
				map.put("fid", rs.getInt(1));
				map.put("titles", rs.getString(2));
				map.put("fcontent", rs.getString(3));
				map.put("userid", rs.getInt(4));
				map.put("photo", rs.getString(5));
				map.put("time", rs.getString(6));
				map.put("username", rs.getString(7));
				
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
	 * 向发帖表添加信息
	 */
	public static void save(Post post) {
		
		try {
			
			conn = ConnectDb.getInstance().makeConnection();
			conn.setAutoCommit(false);

			PostDao postDao=new PostQuery();
			
			postDao.save(conn, post);
			
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
	 * 通过 pId 修改发帖表信息
	 */
	public static void update(Post post) {
		
		try {
			
			ConnectDb.getInstance().makeConnection();
			conn.setAutoCommit(false);
			
			PostDao postDao = new PostQuery();
			
			postDao.update(conn, post);
			
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
	 * 通过 pId 删除发帖表信息
	 */
	public static void delete(int pId) {
		
		try {
			
			ConnectDb.getInstance().makeConnection();
			conn.setAutoCommit(false);
			
			PostDao postDao = new PostQuery();
			Post post = new Post();
			
			post.setpId(pId);
			
			postDao.delete(conn, post);
			
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
	
	public static String save1() {
		return "12345";
	}
	
	
}