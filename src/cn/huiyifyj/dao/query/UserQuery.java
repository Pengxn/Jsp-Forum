package cn.huiyifyj.dao.query;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import cn.huiyifyj.dao.UserDao;
import cn.huiyifyj.bean.User;

public class UserQuery implements UserDao {
	
	private String sql;

	// ��½��֤
	@Override
	public ResultSet login(Connection conn, User user) throws SQLException {
		
		sql = "select * from user where name = ?";
		
		PreparedStatement ps = conn.prepareCall(sql);
		// Ҳ����д�� PreparedStatement ps = conn.prepareStatement(sql);
		// ֮��ķ�������������д
		
		ps.setString(1, user.getName());
		
		ResultSet rs = ps.executeQuery();
		
		return rs;
	}

	// ��ѯ�û���Ϣ
	@Override
	public ResultSet query(Connection conn, User user) throws SQLException {

		sql = "select * from user where userId = ?";
		
		PreparedStatement ps=conn.prepareCall(sql);
		
		ps.setInt(1, user.getUserId());
		
		ResultSet rs = ps.executeQuery();
		
		return rs;
	}

	// ����(����)�û���Ϣ
	@Override
	public void save(Connection conn, User user) throws SQLException {

		sql = "insert into user(name, password, email, address, intro) values(?, ?, ?, ?, ?)";
		
		PreparedStatement ps=conn.prepareCall(sql);
		
		ps.setString(1, user.getName());
		ps.setString(2, user.getPassword());
		ps.setString(3, user.getEmail());
		ps.setString(4, user.getAddress());
		ps.setString(5, user.getIntro());
		
		ps.execute();
	}

	// �����û�ָ����id�����û���Ϣ
	@Override
	public void update(Connection conn, User user) throws SQLException {
		
		sql = "update user set name= ?, password = ?, email = ?, address = ?, intro = ? where userId = ?";
		
		PreparedStatement ps= conn.prepareCall(sql);
		
		ps.setString(1, user.getName());
		ps.setString(2, user.getPassword());
		ps.setString(3, user.getEmail());
		ps.setString(4, user.getAddress());
		ps.setString(5, user.getIntro());
		ps.setInt(6, user.getUserId());
		
		ps.execute();
	}

	// ɾ��ָ���û���Ϣ
	@Override
	public void delete(Connection conn, User user) throws SQLException {
		
		sql = "delete from user where userId = ?";
		
		PreparedStatement ps = conn.prepareCall(sql);
		
		ps.setInt(1, user.getUserId());
		
		ps.execute();
	}
	
}
