package cn.huiyifyj.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import cn.huiyifyj.bean.User;

public interface UserDao {
	
	// ��¼��֤
	public ResultSet login(Connection conn, User user) throws SQLException;
	
	// ��ѯ�û���Ϣ
	public ResultSet query(Connection conn, User user) throws SQLException;
	
	// ����(����)�û���Ϣ
	public void save(Connection conn, User user) throws SQLException;
	
	// �޸��û���Ϣ
	public void update(Connection conn, User user) throws SQLException;
	
	// ɾ���û���Ϣ
	public void delete(Connection conn, User user) throws SQLException;

}
