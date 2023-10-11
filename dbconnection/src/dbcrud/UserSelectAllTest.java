package dbcrud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import domain.User;

public class UserSelectAllTest {

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
			String sql = "SELECT * FROM users"; 
			pstmt = conn.prepareStatement(sql);
			
			//sql 실행 - 검색
			ResultSet rs = pstmt.executeQuery();
			List<User> userList = new ArrayList<>();
			
			while(rs.next()) { 
				User user = new User();
				
				user.setUserId(rs.getString("userid"));
				user.setUserName(rs.getString("username"));
				user.setUserPassword(rs.getString("userpassword"));
				user.setUserAge(rs.getInt("userage"));
				user.setUserEmail(rs.getString("useremail"));
				
				//리스트에 user 객체 저장
				userList.add(user);
			}
			
			for(int i=0; i<userList.size(); i++) {
				User user = userList.get(i);
				//System.out.println(user);
				System.out.println("아이디 : " + user.getUserId());
				System.out.println("이름 : " + user.getUserName());
				System.out.println("비밀번호 : " + user.getUserPassword());
				System.out.println("나이 : " + user.getUserAge());
				System.out.println("이메일 : " + user.getUserEmail());
				System.out.println("======================");
			}
			
			//stack구조이므로 종료 순서 : rs -> pstmt
			rs.close();
			pstmt.close();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
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
