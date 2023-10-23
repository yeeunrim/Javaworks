package board;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionTest {
	
	public static void main(String[] args) {
		
		//db 연결 관련 변수 - 대,소문자 모두 구분
		String driverClass = "com.mysql.cj.jdbc.Driver";
		String url = "jdbc:mysql://127.0.0.1:3306/mydb?serverTime=Asia/Seoul";
		String user = "myuser";
		String password = "pwmyuser";
		
		try {
			Class.forName(driverClass);
			Connection conn = DriverManager.getConnection(url, user, password);
			System.out.println("연결 성공 ! " + conn);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

}
