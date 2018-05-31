package cn.huiyifyj.dao.query;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import cn.huiyifyj.dao.CommentDao;
import cn.huiyifyj.bean.Comment;

public class CommentQuery implements CommentDao {
	
	private String sql;

	// �������۱�� byId ��ѯ���۱���Ϣ
	@Override
	public ResultSet query(Connection conn, Comment comment) throws SQLException {

		sql = "select * from comment where byId = ?";
		
		PreparedStatement ps=conn.prepareCall(sql);
		
		ps.setInt(1, comment.getById());
		
		ResultSet rs=ps.executeQuery();
		
		return rs;
	}

	// ����(����)������Ϣ
	@Override
	public void save(Connection conn, Comment comment) throws SQLException {
		
		sql = "insert into comment(cContent, userId, byId) values(?, ?, ?)";
		
		PreparedStatement ps=conn.prepareCall(sql);
		
		ps.setString(1, comment.getcContent());
		ps.setInt(2, comment.getUserId());
		ps.setInt(3, comment.getById());
		
		ps.execute();
	}

	// �޸�������Ϣ
	@Override
	public void update(Connection conn, Comment comment) throws SQLException {
		
		sql = "update comment set cContent = ? where cId = ?";
		
		PreparedStatement ps = conn.prepareCall(sql);
		
		ps.setString(1, comment.getcContent());
		ps.setInt(2, comment.getcId());
		
		ps.execute();
	}

	// ͨ�� byId ɾ��������Ϣ
	@Override
	public void delete(Connection conn, Comment comment) throws SQLException {

		sql = "delete from pinglun where byId=?";
		
		PreparedStatement ps= conn.prepareCall(sql);
		
		ps.setInt(1, comment.getById());
		
		ps.execute();
	}

	// ͨ�� cId ɾ��������Ϣ
	@Override
	public void deleteCId(Connection conn, Comment comment) throws SQLException {
		
		sql = "delete from comment where cId = ?";
		
		PreparedStatement ps= conn.prepareCall(sql);
		
		ps.setInt(1, comment.getcId());
		
		ps.execute();
	}

}
