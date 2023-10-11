package dbcrud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import domain.User;

public class UserSelectTest1 {

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
			String sql = "SELECT * FROM users WHERE userid = ?"; 
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, "cloud");
			
			//sql 실행 - 검색
			//userid = 'today'가 있으면 db에서 userid를 가져와서 출력
			ResultSet rs = pstmt.executeQuery();
			if(rs.next()) { 
				User user = new User();
				
				user.setUserId(rs.getString("userid"));
				user.setUserName(rs.getString("username"));
				user.setUserPassword(rs.getString("userpassword"));
				user.setUserAge(rs.getInt("userage"));
				user.setUserEmail(rs.getString("useremail"));
				
				//객체 정보를 문자열로 출력함
				//1. toString() 이용
				//System.out.println(user);
				//2. get() 이용
				System.out.println("아이디 : " + user.getUserId());
				System.out.println("이름 : " + user.getUserName());
				System.out.println("비밀번호 : " + user.getUserPassword());
				System.out.println("나이 : " + user.getUserAge());
				System.out.println("이메일 : " + user.getUserEmail());
				
				/* String userId = rs.getString("userid");
				String userName = rs.getString("username");
				String userPassword = rs.getString("userpassword");
				String userAge = rs.getString("userage");
				String userEmail = rs.getString("useremail");
				
				System.out.println("아이디 : " + userId);
				System.out.println("이름 : " + userName);
				System.out.println("비밀번호 : " + userPassword);
				System.out.println("나이 : " + userAge);
				System.out.println("이메일 : " + userEmail); */
			} else {
				System.out.println("아이디가 존재하지 않습니다.");
			}
			
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
