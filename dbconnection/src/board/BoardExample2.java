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
	
		System.out.println("\n[게시글 목록]");
		System.out.println("-----------------------------------------");
		System.out.printf("%-4s%-12s%-12s%-40s \n", "NO", "WRITER", "DATE", "TITLE ");
		System.out.println("-----------------------------------------");
		
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
		
		System.out.println("-----------------------------------------");
		System.out.println("1. Create | 2. Read | 3. Clear | 4. Exit");
		System.out.println("-----------------------------------------");
		
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
		
		//System.out.println("create() 메서드 실행됨\n");
		
		System.out.println("-----------------------------------------");
		Board board = new Board();
		System.out.println("[새 게시글 입력]");
		
		System.out.print("제목 > ");
		String title = scanner.nextLine();
		board.setBtitle(title);
		
		System.out.print("내용 > ");
		String content = scanner.nextLine();
		board.setBcontent(content);
		
		System.out.print("작성자 > ");
		String writer = scanner.nextLine();
		board.setBwriter(writer);
		
		//db 작업 - INSERT
		try {
			String sql = "INSERT INTO board(bno, btitle, bcontent, bwriter) "
					+ "VALUES (seq.NEXTVAL, ?, ?, ?)";
			
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setString(1, board.getBtitle()); //콘솔에서 입력한 제목으로 db에 저장
			pstmt.setString(2, board.getBcontent());
			pstmt.setString(3, board.getBwriter());
			
			//sql실행
			pstmt.executeUpdate();
			
			pstmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
			exit();
		}
		
		//목록 메서드 호출
		list();
		
	} //create() 끝
	
	public void read() {
		
		//System.out.println("read() 메서드 실행됨\n");
		
		System.out.println("-----------------------------------------");
		System.out.print("[게시글 읽기] ");
		System.out.print("글 번호 입력 > ");
		int bno = Integer.parseInt(scanner.nextLine());
		
		//db 작업 - selcet ~ where절
		try {
			String sql = "SELECT * FROM board WHERE bno = ?";
			
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setInt(1, bno);
			
			//쿼리 실행
			ResultSet rs = pstmt.executeQuery();
			
			if(rs.next()) { //찾는 자료가 있으면
				Board board = new Board();
				
				//db의 값을 가져와서 board에 세팅
				board.setBno(rs.getInt("bno"));
				board.setBwriter(rs.getString("bwriter"));
				board.setBdate(rs.getDate("bdate"));
				board.setBtitle(rs.getString("btitle"));
				board.setBcontent(rs.getString("bcontent"));
				
				//콘솔에 출력
				System.out.println("-----------------------------------------");
				System.out.printf("NO.%s\n➥ 제목 : %s\n➥ 내용 : %s\n➥ 작성자 : %s / 작성일 : %s\n", 
						board.getBno(), board.getBtitle(), board.getBcontent(), board.getBwriter(), board.getBdate());
				System.out.println("-----------------------------------------");	
				
				//수정, 삭제 메뉴 만들기
				System.out.println("1. 글 수정 | 2. 글 삭제 | 3. 되돌아가기");
				System.out.print("선택 > ");	
				String menuNo = scanner.nextLine();
				
				if(menuNo.equals("1")) {
					update(board);
				} else if(menuNo.equals("2")) {
					delete(board);
				}
			} //if 끝
			pstmt.close();
			rs.close();
		} catch (SQLException e) {
			e.printStackTrace();
			exit();
		}
		
		list();
		
	} //read() 끝
	
	public void update(Board board) { //이미 작성된 글(board)을 가져와서 수정
		
		System.out.println("-----------------------------------------");
		System.out.println("[수정할 내용 입력]");
		
		System.out.print("제목 > ");
		String title = scanner.nextLine();
		board.setBtitle(title);
		
		System.out.print("내용 > ");
		String content = scanner.nextLine();
		board.setBcontent(content);
		
		System.out.print("작성자 > ");
		String writer = scanner.nextLine();
		board.setBwriter(writer);
		
		//db 작업 - update
		try {
			String sql = "UPDATE board SET btitle = ?, bcontent = ?, bwriter = ? WHERE bno = ?";
			
			pstmt = conn.prepareStatement(sql);
			
			//콘솔에서 수정한 내용을 db에 저장
			pstmt.setString(1, board.getBtitle());
			pstmt.setString(2, board.getBcontent());
			pstmt.setString(3, board.getBwriter());
			pstmt.setLong(4, board.getBno());
			
			//sql 실행
			pstmt.executeUpdate();
			
			pstmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
			exit();
		}
	
	} //update() 끝
	
	public void delete(Board board) {
		
		System.out.println("-----------------------------------------");
		//확인, 취소 메뉴
		System.out.println("정말로 삭제하시겠습니까?");
		System.out.println("1. OK | 2. Cancel");
		System.out.print("선택 > ");
		
		String menuNo = scanner.nextLine();
		if(menuNo.equals("1")) {
			//db 작업
			try {
				String sql = "DELETE FROM board WHERE bno = ?";
				
				pstmt = conn.prepareStatement(sql);
				
				pstmt.setLong(1, board.getBno());
				
				pstmt.executeUpdate();

				pstmt.close();
				System.out.println("게시글이 삭제되었습니다.");
			} catch (SQLException e) {
				e.printStackTrace();
				exit();
			}
		}
		
	} //delete() 끝
	
	//테이블은 유지하면서 전체 글 삭제 - sql : TRUNCATE TABLE board;
	public void clear() {
		
		//System.out.println("clear() 메서드 실행됨\n");
		
		System.out.println("-----------------------------------------");
		System.out.println("[전체 게시글 삭제]");
		
		//확인, 취소 메뉴
		System.out.println("정말로 삭제하시겠습니까?");
		System.out.println("1. OK | 2. Cancel");
		System.out.print("선택 > ");
		
		String menuNo = scanner.nextLine();
		if(menuNo.equals("1")) {
			//db 작업 - TRUNCATE
			try {
				String sql = "TRUNCATE TABLE board";
				
				pstmt = conn.prepareStatement(sql);
				
				pstmt.executeUpdate();
				
				//글번호가 삭제 후에 이어진 번호 출력되는 문제 발생
				//이를 해결하기 아래의 메서드(dropSeq(), createSeq())로
				//시퀀스를 삭제하고 재성성함
				//길고 복잡한 코드일 경우에는 메서드로 작성해서 사용하면 좋지만 
				//짧은 코드일 경우에는 이처럼 그냥 작성하는 것도 좋음
				//추가로 시퀀스는 Oracle에만 있는 것이다.
				/*sql = "DROP SEQUENCE seq";
				pstmt = conn.prepareStatement(sql);
				pstmt.executeUpdate();
				////////////////////////////////////
				sql = "CREATE SEQUENCE seq NOCACHE";
				pstmt = conn.prepareStatement(sql);
				pstmt.executeUpdate(); */

				pstmt.close();
				System.out.println("게시글이 삭제되었습니다.");
			} catch (SQLException e) {
				e.printStackTrace();
				exit();
			}
		}
		
		dropSeq();
		createSeq();
		list();
		
	} //clear() 끝
	
	public void dropSeq() {
		
		//시퀀스 1부터 초기화 메서드
		//db 작업
		try {
			String sql = "DROP SEQUENCE seq";
			
			pstmt = conn.prepareStatement(sql);
			
			pstmt.executeUpdate();

			pstmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
			exit();
		}
		
	} //drop() 끝
	
	public void createSeq() {
		
		//db 작업
		try {
			String sql = "CREATE SEQUENCE seq NOCACHE";
			
			pstmt = conn.prepareStatement(sql);
			
			pstmt.executeUpdate();

			pstmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
			exit();
		}
	}

	public void exit() {
		
		if(conn != null) {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		System.out.println("************ 게시판을 종료합니다 ************");
		System.exit(0); //즉시종료
		
	} //exit() 끝
	
	public static void main(String[] args) {
		
		BoardExample2 board1 = new BoardExample2();
		board1.list();
		
	} //main 끝

} //class 끝