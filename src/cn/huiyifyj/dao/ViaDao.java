package cn.huiyifyj.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import cn.huiyifyj.bean.Via;

public interface ViaDao {
	
	//��ѯͷ����Ϣ
	public ResultSet query(Connection conn, Via via) throws SQLException;
	
	//����ͷ����Ϣ
	public void save(Connection conn, Via via) throws SQLException;
	
	//�޸�ͷ����Ϣ
	public void update(Connection conn, Via via) throws SQLException;
	
	//ɾ��ͷ����Ϣ
	public void delete(Connection conn, Via via) throws SQLException;

}
