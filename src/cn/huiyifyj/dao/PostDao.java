package cn.huiyifyj.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import cn.huiyifyj.bean.Post;

public interface PostDao {

	// ��ѯ�û���Ϣ
	public ResultSet query(Connection conn, Post post) throws SQLException;
	
	// ͨ�� userid ��ѯ�û���Ϣ
	public ResultSet queryId(Connection conn, Post post) throws SQLException;
	
	// �����û���Ϣ
	public void save(Connection conn, Post post) throws SQLException;
	
	// �޸��û���Ϣ
	public void update(Connection conn, Post post) throws SQLException;
	
	// ɾ���û���Ϣ
	public void delete(Connection conn, Post post) throws SQLException;
	
}
