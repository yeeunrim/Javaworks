package day231025.dbcrud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import day231025.domain.User;

public class UserSelectAllTest {
	
	public static void main(String[] args) {
		
		//sql과 연결 및 구문 이용 클래스 초기화
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		try {
			//driver 등록
			Class.forName("oracle.jdbc.OracleDriver");
			
			//드라이버랑 sql 계정이랑 연결
			conn = DriverManager.getConnection(
					"jdbc:oracle:thin:@localhost:1521/xe",
					"yeeunrim",
					"pw991215");
			
			//연결 성공 메세지
			System.out.println("연결 성공 !");
			
			//sql 조회 구문 작성
			String sql = "SELECT * FROM users";
			
			//자바에서 사용할 수 있도록 동적 바인딩
			pstmt = conn.prepareStatement(sql);
			
			//db 실행 후에 저장된 결과를 rs로 저장
			ResultSet rs = pstmt.executeQuery();
			//db에서 가져온 데이터를 저장한 배열 생성
			List<User> userList = new ArrayList<>();
			
			//db에서 가져온 데이터를 배열에 저장
			while(rs.next()) {
				User user = new User();
				
				user.setUserId(rs.getString("userid"));
				user.setUserName(rs.getString("username"));
				user.setUserPassword(rs.getString("userpassword"));
				user.setUserAge(rs.getInt("userage"));
				user.setUserEmail(rs.getString("useremail"));
				
				userList.add(user);
			}
			
			//배열에 저장한 데이터를 조회 - 향상 for문
//			for(User user : userList) {
//				System.out.print("userid = " + user.getUserId() + ", ");
//				System.out.print("username = " + user.getUserName() + ", ");
//				System.out.print("userpassword = " + user.getUserPassword() + ", ");
//				System.out.print("userage = " + user.getUserAge() + ", ");
//				System.out.print("useremail = " + user.getUserEmail() + "\n");
//			}
			
			//배열에 저장한 데이터를 조회 - 일반 for문
			for(int i=0; i<userList.size(); i++) {
				User user = userList.get(i);
				
				System.out.print("userid = " + user.getUserId() + ", ");
				System.out.print("username = " + user.getUserName() + ", ");
				System.out.print("userpassword = " + user.getUserPassword() + ", ");
				System.out.print("userage = " + user.getUserAge() + ", ");
				System.out.print("useremail = " + user.getUserEmail() + "\n");
			}
			
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
					System.out.println("연결 끊음 !");
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		
	}

}
