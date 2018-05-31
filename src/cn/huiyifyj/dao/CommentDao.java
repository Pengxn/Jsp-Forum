package cn.huiyifyj.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import cn.huiyifyj.bean.Comment;

public interface CommentDao {
	
	// ��ѯ�û���Ϣ
	public ResultSet query(Connection conn, Comment comment) throws SQLException;
	
	// �����û���Ϣ
	public void save(Connection conn, Comment comment) throws SQLException;
	
	// �޸��û���Ϣ
	public void update(Connection conn, Comment comment) throws SQLException;
	
	// ͨ�� byid ɾ���û���Ϣ
	public void delete(Connection conn, Comment comment) throws SQLException;
	
	//ͨ�� cId ɾ���û���Ϣ
	public void deleteCId(Connection conn, Comment comment) throws SQLException;

}
