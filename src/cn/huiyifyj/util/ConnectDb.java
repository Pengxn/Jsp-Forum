package cn.huiyifyj.util;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

public class ConnectDb {
	
	//���ݿ����ñ���
	private static String driver;
	private static String dburl;
	private static String user;
	private static String password;
	
	Connection conn = null;
	
	private static final ConnectDb dbFactory = new ConnectDb();
	
	//��ȡdbconfig.properties�����ļ��е�ֵ����ֵ��Ӧ�ı���
	static {
		
		Properties dbconfig = new Properties();
		
		try {
			
			//��ȡ�����ļ�
			InputStream in = ConnectDb.class.getClassLoader().getResourceAsStream("dbconfig.properties");
			dbconfig.load(in);
			
		} catch (Exception e) {
			System.out.println("���ݿ�������ļ�(dbconfig.properties)��ȡ����...");
		}
		
		//��ֵ����Ӧ�ı���
		driver = dbconfig.getProperty("driver");
		dburl = dbconfig.getProperty("dburl");
		user = dbconfig.getProperty("user");
		password = dbconfig.getProperty("password");
		
	}
	
	//���캯��
	private ConnectDb() { }
	
	public static ConnectDb getInstance() {
		return dbFactory;
	}
	
	public Connection makeConnection() {
		
		//�������ݿ�
		try {
			
			//��������
			Class.forName(driver);
			
			conn = DriverManager.getConnection(dburl, user, password);
			
		} catch (Exception e) {
			
			e.printStackTrace();
			
			System.out.println("���ݿ�������������������...");
			
		}
		
		return conn;
	}
}
