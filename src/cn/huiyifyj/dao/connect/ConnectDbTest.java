package cn.huiyifyj.dao.connect;

import java.sql.Connection;
import java.sql.SQLException;

import cn.huiyifyj.util.ConnectDb;

public class ConnectDbTest {

	//测试数据库连接
	public static void main(String[] args) throws SQLException {
		
		ConnectDb conndb = ConnectDb.getInstance();
		
		Connection conn = conndb.makeConnection();
		
		System.out.println(conn.getAutoCommit());
		
	}
	
}
