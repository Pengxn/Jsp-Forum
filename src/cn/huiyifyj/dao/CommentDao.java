package cn.huiyifyj.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import cn.huiyifyj.bean.Comment;

public interface CommentDao {
	
	// 查询用户信息
	public ResultSet query(Connection conn, Comment comment) throws SQLException;
	
	// 插入用户信息
	public void save(Connection conn, Comment comment) throws SQLException;
	
	// 修改用户信息
	public void update(Connection conn, Comment comment) throws SQLException;
	
	// 通过 byid 删除用户信息
	public void delete(Connection conn, Comment comment) throws SQLException;
	
	//通过 cId 删除用户信息
	public void deleteCId(Connection conn, Comment comment) throws SQLException;

}
