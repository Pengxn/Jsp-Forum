package cn.huiyifyj.dao.connect;

import java.sql.Connection;
import java.sql.SQLException;

import cn.huiyifyj.util.ConnectDb;

public class ConnectDbTest {

	//�������ݿ�����
	public static void main(String[] args) throws SQLException {
		
		ConnectDb conndb = ConnectDb.getInstance();
		
		Connection conn = conndb.makeConnection();
		
		System.out.println(conn.getAutoCommit());
		
	}
	
}
