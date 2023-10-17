package dbcrud;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class BoardInsertTest {
	
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
			String sql = "INSERT INTO boards (bno, btitle, bcontent, bwriter, bdate, bfilename, bfiledata) " 
					+ "VALUES (seq_bno.NEXTVAL, ?, ?, ?, SYSDATE, ?, ?)";
			
			pstmt = conn.prepareStatement(sql);
			
			//물음표(?) 값 지정
			//배열 아님 - 1부터 시작
			pstmt.setString(1, "스마트폰");
			pstmt.setString(2, "아이폰입니다.");
			pstmt.setString(3, "cloud");
			//1.사진 첨부한 경우
			pstmt.setString(4, "phone.jpeg");
			pstmt.setBlob(5, new FileInputStream("src/dbcrud/phone.jpeg"));
			//2.사진 미첨부한 경우
			//pstmt.setString(4, null);
			//Blob blob = null;
			//pstmt.setBlob(5, blob);
			
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
