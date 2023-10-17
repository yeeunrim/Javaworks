package dbcrud;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class BoardUpdateTest {
	
	public static void main(String[] args) {
		
		Connection conn = null; //네트워크 연결 클래스
		PreparedStatement pstmt = null; //sql 처리 인터페이스
		
		try {
			//JDBC 드라이버 등록
			Class.forName("oracle.jdbc.OracleDriver");
			
			//연결하기 - getConnection(url, user, password)
			conn = DriverManager.getConnection(
					"jdbc:oracle:thin:@localhost:1521/xe",
					"mydb",
					"pwmydb");
			
			System.out.println("연결 성공!");
			
			//db 처리 작업
			//매개변수화된 sql문 작성 - 동적 바인딩
			String sql = "UPDATE boards SET btitle = ?, bcontent = ?, bfilename = ?, bfiledata = ? "
					+ "WHERE bno = ?";
			
			pstmt = conn.prepareStatement(sql);
			
			//물음표(?) 값 지정
			//배열 아님 - 1부터 시작
			pstmt.setString(1, "노트북");
			pstmt.setString(2, "LG 노트북입니다.");
			pstmt.setString(3, "notebook.jpeg");
			pstmt.setBlob(4, new FileInputStream("src/dbcrud/notebook.jpeg"));
			pstmt.setInt(5, 4);
			
			//sql 실행 - 메서드
			int rows = pstmt.executeUpdate();
			System.out.println("저장된 행의 수 : " + rows);
			//auto commit이 됨
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if(conn != null) {
				try {
					conn.close();
					System.out.println("연결 끊음");
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		
	} //main

} //class
