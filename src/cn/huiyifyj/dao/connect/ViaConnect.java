package cn.huiyifyj.dao.connect;

import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

import cn.huiyifyj.util.ConnectDb;
import cn.huiyifyj.bean.Via;
import cn.huiyifyj.dao.ViaDao;
import cn.huiyifyj.dao.query.ViaQuery;

public class ViaConnect{

	static Connection conn = null;
	

	/**
	 * ����ͷ�����Ϣ
	 * 
	 * @throws FileNotFoundException
	 */
	public static void save(int userId, String viaName){

		try {
			
			conn = ConnectDb.getInstance().makeConnection();
			conn.setAutoCommit(false);

			ViaDao viaDao = new ViaQuery();
			Via via = new Via();

			via.setUserId(userId);
			via.setPhoto(viaName);

			viaDao.save(conn, via);
			
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
	 * ��ѯͷ�����Ϣ
	 * 
	 * @throws Exception
	 */
	public static Map<Object, Object> query(int userId) {

		Map<Object, Object> map=new HashMap<Object, Object>();
		
		try {
			conn = ConnectDb.getInstance().makeConnection();
			conn.setAutoCommit(false);

			ViaDao viaDao = new ViaQuery();
			Via via = new Via();
			via.setUserId(userId);

			ResultSet rs = viaDao.query(conn, via);
			while (rs.next()) {
				
				map.put("viaid", rs.getInt("userId"));
				map.put("photo", rs.getString("photo"));
			}

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
		
		return map;
	}
	
	/**
	 * �޸�ͷ�����Ϣ
	 * 
	 * @throws FileNotFoundException
	 */
	public static void update(int userId, String viaName){

		try {
			
			conn = ConnectDb.getInstance().makeConnection();
			conn.setAutoCommit(false);

			ViaDao viaDao = new ViaQuery();
			Via via = new Via();

			via.setUserId(userId);
			via.setPhoto(viaName);

			viaDao.update(conn, via);
			
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

}