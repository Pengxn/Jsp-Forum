package cn.huiyifyj.util;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

public class ConnectDb {
	
	//数据库配置变量
	private static String driver;
	private static String dburl;
	private static String user;
	private static String password;
	
	Connection conn = null;
	
	private static final ConnectDb dbFactory = new ConnectDb();
	
	//读取dbconfig.properties配置文件中的值并赋值相应的变量
	static {
		
		Properties dbconfig = new Properties();
		
		try {
			
			//读取配置文件
			InputStream in = ConnectDb.class.getClassLoader().getResourceAsStream("dbconfig.properties");
			dbconfig.load(in);
			
		} catch (Exception e) {
			System.out.println("数据库的配置文件(dbconfig.properties)读取错误...");
		}
		
		//赋值给相应的变量
		driver = dbconfig.getProperty("driver");
		dburl = dbconfig.getProperty("dburl");
		user = dbconfig.getProperty("user");
		password = dbconfig.getProperty("password");
		
	}
	
	//构造函数
	private ConnectDb() { }
	
	public static ConnectDb getInstance() {
		return dbFactory;
	}
	
	public Connection makeConnection() {
		
		//连接数据库
		try {
			
			//连接驱动
			Class.forName(driver);
			
			conn = DriverManager.getConnection(dburl, user, password);
			
		} catch (Exception e) {
			
			e.printStackTrace();
			
			System.out.println("数据库连接驱动出现了问题...");
			
		}
		
		return conn;
	}
}
