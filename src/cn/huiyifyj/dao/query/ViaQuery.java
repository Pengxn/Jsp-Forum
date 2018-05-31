package cn.huiyifyj.dao.query;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import cn.huiyifyj.dao.ViaDao;
import cn.huiyifyj.bean.Via;

public class ViaQuery implements ViaDao {
	
	private String sql;

	// ��ѯͷ����Ϣ
	@Override
	public ResultSet query(Connection conn, Via via) throws SQLException {
		
		sql = "select * from via where userId = ?";
		
		PreparedStatement ps = conn.prepareCall(sql);
		
		ps.setInt(1, via.getUserId());
		
		ResultSet rs = ps.executeQuery();
		
		return rs;
	}

	// ����(����)ͷ����Ϣ
	@Override
	public void save(Connection conn, Via via) throws SQLException {
		
		sql = "insert into via(userId, photo) values(?, ?)";
		
		PreparedStatement ps = conn.prepareStatement(sql);
		
		ps.setInt(1, via.getUserId());
		ps.setString(2, via.getPhoto());

		ps.execute();
	}

	// �޸�ͷ����Ϣ
	@Override
	public void update(Connection conn, Via via) throws SQLException {
		
		sql = "update via set photo = ? where userId = ?";
		
		PreparedStatement ps=conn.prepareStatement(sql);
		
		ps.setString(1, via.getPhoto());
		ps.setInt(2, via.getUserId());

		ps.execute();
	}

	// ɾ��ͷ����Ϣ
	@Override
	public void delete(Connection conn, Via via) throws SQLException {
		// TODO Auto-generated method stub
		
	}

	
}
