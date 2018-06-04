package cn.huiyifyj.dao.query;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import cn.huiyifyj.dao.PostDao;
import cn.huiyifyj.bean.Post;

public class PostQuery implements PostDao {
	
	private String sql;

	// 查询发帖信息
	@Override
	public ResultSet query(Connection conn, Post post) throws SQLException {
		
		sql = "select * from post order by pId desc";
		
		PreparedStatement ps = conn.prepareCall(sql);
		
		ResultSet rs = ps.executeQuery();
		
		return rs;
	}

	// 通过 userId 查询发帖信息
	@Override
	public ResultSet queryId(Connection conn, Post post) throws SQLException {
		
		sql = "select * from post where userId = ? order by pid desc";
		
		PreparedStatement ps = conn.prepareCall(sql);
		
		ps.setInt(1, post.getUserId());
		
		ResultSet rs = ps.executeQuery();
		
		return rs;
	}

	// 插入发帖信息
	@Override
	public void save(Connection conn, Post post) throws SQLException {

		sql = "insert into post(titles, pContent, userId, userName) values(?, ?, ?, ?)";
		
		PreparedStatement ps = conn.prepareStatement(sql);
		
		ps.setString(1, post.getTitles());
		ps.setString(2, post.getpContent());
		ps.setInt(3, post.getUserId());
		ps.setString(4, post.getUserName());
		
		ps.execute();
	}

	// 修改发帖信息
	@Override
	public void update(Connection conn, Post post) throws SQLException {
		
		sql = "update post set titles = ?, pContent = ? where pId = ?";
		
		PreparedStatement ps= conn.prepareCall(sql);
		
		ps.setString(1, post.getTitles());
		ps.setString(2, post.getpContent());
		ps.setInt(3, post.getpId());
		
		ps.execute();
	}

	// 删除发帖信息
	@Override
	public void delete(Connection conn, Post post) throws SQLException {

		sql = "delete from post where pId = ?";
		
		PreparedStatement ps= conn.prepareCall(sql);
		
		ps.setInt(1, post.getpId());
		
		ps.execute();
	}

}
