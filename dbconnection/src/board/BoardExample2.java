package board;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

//version-2
public class BoardExample2 {
	
	private Scanner scanner = new Scanner(System.in);
	private Connection conn;
	private PreparedStatement pstmt;
	
	//db 연결 관련 변수
	private String driverClass = "oracle.jdbc.OracleDriver";
	private String url = "jdbc:oracle:thin:@localhost:1521/xe";
	private String user = "mydb";
	private String password = "pwmydb";
	
	//생성자
	public BoardExample2() {
		
		try {
			Class.forName(driverClass);
			conn = DriverManager.getConnection(url, user, password);
			//System.out.println("db 연결 성공 !!" + conn + "\n");
		} catch (Exception e) {
			e.printStackTrace();
			exit();
		}
		
	} //BoardExample1() 끝
	
	public void list() {
	
		System.out.println("[게시글 목록]");
		System.out.println("-------------------------------------------------------");
		System.out.printf("%-4s%-12s%-12s%-40s \n", "NO", "WRITER", "DATE", "TITLE");
		System.out.println("-------------------------------------------------------");
		
		/* System.out.printf("%-4s%-12s%-12s%-40s \n", 
								"1", "today12", "2023-10-17", "가입인사 드립니다."); */
		
		//db - board 테이블의 모든 게시글 가져오기
		try {
			String sql = "SELECT bno, btitle, bcontent, bwriter, bdate FROM board ORDER BY bno DESC";
			
			pstmt = conn.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();
			
			while(rs.next()) { //게시글이 있는 동안 반복(다음 행으로 이동)
				Board board = new Board();
				
				board.setBno(rs.getInt("bno"));
				board.setBwriter(rs.getString("bwriter"));
				board.setBdate(rs.getDate("bdate"));
				board.setBtitle(rs.getString("btitle"));
				
				//게시글 출력
				System.out.printf("%-4s%-12s%-12s%-40s \n", board.getBno(), 
						board.getBwriter(), board.getBdate(), board.getBtitle());
			} //while 끝
			rs.close();
			pstmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
			exit();
		}
		
		mainMenu(); //mainMenu() 메서드 호출
		
	} //list() 끝
	
	public void mainMenu() {
		
		System.out.println("-------------------------------------------------------");
		System.out.println("1. Create | 2. Read | 3. Clear | 4. Exit");
		System.out.println("-------------------------------------------------------");
		
		System.out.print("선택 > ");
		
		String menuNo = scanner.nextLine();
		
		switch(menuNo) {
		case "1" :
			create(); break;
		case "2" :
			read(); break;
		case "3" :
			clear(); break;
		case "4" :
			exit(); break;
		}
		
	} //mainMenu() 끝
	
	public void create() {
		
		System.out.println("create() 메서드 실행됨\n");
		list();
		
	} //create() 끝
	
	public void read() {
		
		System.out.println("read() 메서드 실행됨\n");
		list();
		
	} //read() 끝
	
	public void clear() {
		
		System.out.println("clear() 메서드 실행됨\n");
		list();
		
	} //clear() 끝

	public void exit() {
		
		System.out.println("******************** 게시판을 종료합니다 ********************");
		System.exit(0); //즉시종료
		
	} //exit() 끝
	
	public static void main(String[] args) {
		
		BoardExample2 board1 = new BoardExample2();
		board1.list();
		
	} //main 끝

} //class 끝