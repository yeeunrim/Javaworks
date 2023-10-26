package day231025.dbcrud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UserInsertTest {
	
	public static void main(String[] args) {
		
		//네트워크 연결 클래스
		Connection conn = null;
		//sql 처리 인터페이스
		PreparedStatement pstmt = null;
		
		try {
			//JDBC 드라이버 등록
			Class.forName("oracle.jdbc.OracleDriver");
			
			//연결하기
			conn = DriverManager.getConnection(
					"jdbc:oracle:thin:@localhost:1521/xe",
					"yeeunrim",
					"pw991215");
			
			System.out.println("연결 성공!");
			
			//db 처리 작업
			String sql = "INSERT INTO users VALUES (?, ?, ?, ?, ?)";
			
			pstmt = conn.prepareStatement(sql);
			
			//db에 저장한 데이터 입력
			pstmt.setString(1, "lia");
			pstmt.setString(2, "이나경");
			pstmt.setString(3, "pw990618");
			pstmt.setInt(4, 25);
			pstmt.setString(5, "lia@flower.com");
			
			pstmt.executeUpdate();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if(conn != null) {
				try {
					conn.close();
					System.out.println("연결 끊음 !");
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		
	} //main

} //class
