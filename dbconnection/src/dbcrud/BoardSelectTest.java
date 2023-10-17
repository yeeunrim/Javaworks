package dbcrud;

import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import domain.Board;

public class BoardSelectTest {
	
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
			String sql = "SELECT * FROM boards WHERE bwriter = ? "
					+ "ORDER BY bno DESC";
			
			pstmt = conn.prepareStatement(sql);
			
			//물음표(?) 값 지정
			//배열 아님 - 1부터 시작
			pstmt.setString(1, "cloud");
			
			//sql 실행 - 메서드
			ResultSet rs = pstmt.executeQuery();
			List<Board> boardList = new ArrayList<>();
			while(rs.next()) {
				Board board = new Board();
				
				board.setBno(rs.getInt("bno"));	
				board.setBtitle(rs.getString("btitle"));
				board.setBcontent(rs.getString("bcontent"));
				board.setBwriter(rs.getString("bwriter"));
				board.setBdate(rs.getDate("bdate"));
				board.setBfileName(rs.getString("bfilename"));
				board.setBfileData(rs.getBlob("bfiledata"));
				
				boardList.add(board);
				
				//서버 컴퓨터의 하드디스크에 첨부파일 저장
				Blob blob = board.getBfileData();
				if(blob != null) {
					InputStream is = blob.getBinaryStream();
					OutputStream os = new FileOutputStream("/Users/rim-yeeun/file/" + board.getBfileName());
					
					//바이너리 파일 읽고 쓰기
					byte[] data = new byte[150000];
					/* while(true) {
						int num = is.read();
						if(num == -1) {
							break;
						}
						os.write(data, 0, num);
					} */
					
					is.transferTo(os); //바이너리 파일 쓰기				
					
					os.flush();
					os.close();
					is.close();
				}
			}
			
			//boardList 출력
			for(Board board : boardList) {
				System.out.println(board);
			}
			rs.close();
			pstmt.close();
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
		
	}

}
