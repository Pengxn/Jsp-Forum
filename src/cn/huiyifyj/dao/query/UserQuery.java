package cn.huiyifyj.dao.query;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import cn.huiyifyj.dao.UserDao;
import cn.huiyifyj.bean.User;

public class UserQuery implements UserDao {
	
	private String sql;

	// 登陆验证
	@Override
	public ResultSet login(Connection conn, User user) throws SQLException {
		
		sql = "select * from user where name = ?";
		
		PreparedStatement ps = conn.prepareCall(sql);
		// 也可以写成 PreparedStatement ps = conn.prepareStatement(sql);
		// 之后的方法都可以这样写
		
		ps.setString(1, user.getName());
		
		ResultSet rs = ps.executeQuery();
		
		return rs;
	}

	// 查询用户信息
	@Override
	public ResultSet query(Connection conn, User user) throws SQLException {

		sql = "select * from user where userId = ?";
		
		PreparedStatement ps=conn.prepareCall(sql);
		
		ps.setInt(1, user.getUserId());
		
		ResultSet rs = ps.executeQuery();
		
		return rs;
	}

	// 保存(插入)用户信息
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

	// 根据用户指定的id更新用户信息
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

	// 删除指定用户信息
	@Override
	public void delete(Connection conn, User user) throws SQLException {
		
		sql = "delete from user where userId = ?";
		
		PreparedStatement ps = conn.prepareCall(sql);
		
		ps.setInt(1, user.getUserId());
		
		ps.execute();
	}
	
}
