package cn.huiyifyj.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import cn.huiyifyj.bean.Post;

public interface PostDao {

	// 查询用户信息
	public ResultSet query(Connection conn, Post post) throws SQLException;
	
	// 通过 pId 查询该帖子信息
	public ResultSet getPost(Connection conn, Post post) throws SQLException;
	
	// 通过 userid 查询用户信息
	public ResultSet queryId(Connection conn, Post post) throws SQLException;
	
	// 插入用户信息
	public void save(Connection conn, Post post) throws SQLException;
	
	// 修改用户信息
	public void update(Connection conn, Post post) throws SQLException;
	
	// 删除用户信息
	public void delete(Connection conn, Post post) throws SQLException;
	
}
