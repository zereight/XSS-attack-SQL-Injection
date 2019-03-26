package util;

import java.sql.Connection;
import java.sql.DriverManager;

public class DatabaseUtil {

	public static Connection getConnection() {
		try {
			
			String dbUrl = "jdbc:mysql://localhost:3306/securityTest?characterEncoding=UTF-8&serverTimezone=UTC";
			String dbId = "root";
			String dbPw = "root";
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			return DriverManager.getConnection(dbUrl,dbId,dbPw);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return null;
	}
	
}
