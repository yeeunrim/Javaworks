package banking.domain;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;

import banking.common.JDBCUtil;

//Account를 생성, 조회, 수정, 삭제하는 클래스
//DAO - Data Access Object
public class AccountDAO {
	
	Connection conn; //db 연결 객체 선언
	PreparedStatement pstmt; //sql 처리 객체
	ResultSet rs; //데이터셋 객체
	Scanner scanner = new Scanner(System.in);
	
	public void createAccount() {
		
		System.out.println("===========================================================================");
		System.out.println("                                  계좌 생성                                  ");
		System.out.println("===========================================================================");
		
		//계좌 중복 방지
		while(true) {
			System.out.print("계좌번호 [형식(숫자):00-00-000] > ");
			String regExp = "\\d{2}-\\d{2}-\\d{3}";
			
			String ano = scanner.nextLine();
			
			boolean result = Pattern.matches(regExp, ano);
			
			if(result) {
				//중복 계좌가 있는 지 채킹
				if(findAccount(ano) != null) {//중복 계좌가 있으면
					System.out.println("확인 ! 중복 계좌입니다. 다시 입력해주세요.");
				} else {//중복 계좌가 없으면
					while(true) {
						System.out.print("계좌주 [영어, 한글 가능] > ");
						String regExp2 = "[a-zA-Z가-힣]+";
						String owner = scanner.nextLine();
						
						result = Pattern.matches(regExp2, owner);
						if(result) {
							System.out.print("초기 입금액 [숫자만 가능] > ");
							int balance = Integer.parseInt(scanner.nextLine());
							
							//db 작업
							try {
								conn = JDBCUtil.getConnection();
								String sql = "INSERT INTO account(ano, owner, balance) VALUES (?, ?, ?)";
								
								pstmt = conn.prepareStatement(sql);
								
								//값 설정
								pstmt.setString(1, ano);
								pstmt.setString(2, owner);
								pstmt.setInt(3, balance);
								
								//sql 실행
								pstmt.executeUpdate();
								System.out.println("계좌가 생성되었습니다.");
							} catch (SQLException e) {
								e.printStackTrace();
							} finally {
								JDBCUtil.close(conn, pstmt);
							}
							
							break;
						}else {
							System.out.println("올바르지 않은 형식입니다. 올바르게 다시 작성해주세요.");
						}
					}//안쪽 while 끝
					break;
				} //if~else 끝
			}else {
				System.out.println("올바르지 않은 형식입니다. 올바르게 다시 작성해주세요.");
			}
		}//바깥쪽 while 끝
		
	}//createAccount() 끝
	
	public void getAccountList() {
		
		System.out.println("===========================================================================");
		System.out.println("                                  계좌 목록                                  ");
		System.out.println("===========================================================================");
		
		//계좌를 저장할 어레이리스트 생성
		List<Account> accountList = new ArrayList<>();
		
		//db 작업
		try {
			conn = JDBCUtil.getConnection();
			String sql = "SELECT * FROM account";
			pstmt = conn.prepareStatement(sql);
			
			//검색 처리
			rs = pstmt.executeQuery();
			
			while(rs.next()){ //다음 데이터가 있는 동안 반복
				//account 객체
				String ano = rs.getString("ano");     //db에서 가져온 ano
				String owner = rs.getString("owner"); //db에서 가져온 owner
				int balance = rs.getInt("balance");   //db에서 가져온 balance
				
				Account account = new Account(ano, owner, balance);
				
				accountList.add(account);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JDBCUtil.close(conn, pstmt, rs);
		}
		
		//계좌 목록 조회
		for(int i=0; i<accountList.size(); i++) {
			 Account account = accountList.get(i);
			 System.out.printf("계좌번호 : %s\t", account.getAno());
				System.out.printf("계좌주 : %s\t", account.getOwner());
				System.out.printf("잔고 : %,d원\n", account.getBalance());
		}
		
	}//getAccountList() 끝
	
	public void deposit() {
		
		System.out.println("===========================================================================");
		System.out.println("                                    입금                                    ");
		System.out.println("===========================================================================");
		
		while(true)	{
			System.out.print("계좌번호 > ");
			String ano = scanner.nextLine();
			
			if(findAccount(ano) != null) { //찾는 계좌가 있으면
					Account account = findAccount(ano);
					
					System.out.print("입금액 > ");
					int money = Integer.parseInt(scanner.nextLine());
					int balance = account.getBalance() + money;
					
					//db 작업
					try {
						conn = JDBCUtil.getConnection();
						String sql = "UPDATE account SET balance = ? WHERE ano = ?";
						pstmt = conn.prepareStatement(sql);
						
						pstmt.setInt(1, balance);
						pstmt.setString(2, ano);
						
						//sql 실행
						pstmt.executeUpdate();
						System.out.println("결과 : 정상 처리가 되었습니다.");
					} catch (SQLException e) {
						e.printStackTrace();
					} finally {
						JDBCUtil.close(conn, pstmt);
					}
					break;
			} else {
					System.out.println("확인 ! 계좌가 없습니다. 다시 입력해 주세요.");
			}
		} //while 끝
		
	}//deposit() 끝
	
	public void withdraw() {
		
		System.out.println("===========================================================================");
		System.out.println("                                    출금                                    ");
		System.out.println("===========================================================================");
		
		//잔액 부족 처리
				while(true) {
					System.out.print("계좌번호 > ");
					String ano = scanner.nextLine();
					
					if(findAccount(ano) != null) {
						while(true) { //출금액 재입력
							System.out.print("출금액 > ");
							int money = Integer.parseInt(scanner.nextLine());
							Account account = findAccount(ano);
							
							int balance = account.getBalance() - money;
						
							if (account.getBalance() < money){ //츌금액이 잔고보다 많으면
								System.out.println("확인 ! 잔액이 부족합니다. 다시 입력해 주세요.");
							}else {
								//db 작업
								try {
									conn = JDBCUtil.getConnection();
									String sql = "UPDATE account SET balance = ? WHERE ano = ?";
									pstmt = conn.prepareStatement(sql);
									
									pstmt.setInt(1, balance);
									pstmt.setString(2, ano);
									
									//sql 실행
									pstmt.executeUpdate();
									System.out.println("결과 : 정상 처리가 되었습니다.");
								} catch (SQLException e) {
									e.printStackTrace();
								} finally {
									JDBCUtil.close(conn, pstmt);
								}
								break;
							}
						} //안쪽 while 끝
						break;
					}else {
						System.out.println("확인 ! 계좌가 없습니다. 다시 입력해 주세요.");
					}
				} //바깥쪽 while 끝
		
	} //withdraw() 끝
	
	//계좌 삭제
	public void removeAccount() {
		
		System.out.println("===========================================================================");
		System.out.println("                                  계좌 삭제                                  ");
		System.out.println("===========================================================================");
		
		while(true) {
			System.out.print("계좌 번호: ");
			String ano = scanner.nextLine();
		
			if(findAccount(ano) != null) { //찾는 계좌가 있으면
				//db 처리
				try {
					conn = JDBCUtil.getConnection();
					String sql = "DELETE FROM account WHERE ano = ?";
					pstmt = conn.prepareStatement(sql);
					
					pstmt.setString(1, ano);
					
					//sql 실행
					pstmt.executeUpdate();
					System.out.println("결과 : 정상 처리가 되었습니다.");
				} catch (SQLException e) {
					e.printStackTrace();
				} finally {
					JDBCUtil.close(conn, pstmt);
				}
				break;
			}else {
				System.out.println("결과: 계좌가 없습니다. 다시 입력해 주세요");
			}
		} //while 끝
			
	} //removeAccount() 끝
	
	//특정 계좌 검색
	public void selectAccount() {
		
		//계좌 번호와 일치하는 계좌 검색
		System.out.println("===========================================================================");
		System.out.println("                                  계좌 검색                                  ");
		System.out.println("===========================================================================");
		
		//계좌를 저장할 어레이리스트 생성
		List<Account> accountList = new ArrayList<>();
				
		while(true) {
			System.out.print("계좌 번호: ");
			String ano = scanner.nextLine();
		
			//계좌가 있는 지 채킹
			Account account = findAccount(ano);
			
			if(findAccount(ano) != null) { //찾는 계좌가 있으면
				//db 처리
				try {
					conn = JDBCUtil.getConnection();
					String sql = "SELECT * FROM account WHERE ano = ?";
					pstmt = conn.prepareStatement(sql);
					
					pstmt.setString(1, ano);
					
					//검색 처리
					rs = pstmt.executeQuery();
					
					while(rs.next()){ //다음 데이터가 있는 동안 반복
						//account 객체
						ano = rs.getString("ano");            //db에서 가져온 ano
						String owner = rs.getString("owner"); //db에서 가져온 owner
						int balance = rs.getInt("balance");   //db에서 가져온 balance
						
						account = new Account(ano, owner, balance);
						
						accountList.add(account);
					}
				} catch (SQLException e) {
					e.printStackTrace();
				} finally {
					JDBCUtil.close(conn, pstmt, rs);
				}
				
				//계좌 목록 조회
				for(int i=0; i<accountList.size(); i++) {
					 String dbAno = accountList.get(i).getAno();
					 if(dbAno.equals(ano)) {
							account = accountList.get(i);
							System.out.println("✔ 검색된 계좌의 정보 ✔");
							
							System.out.printf("➥ 계좌번호 : %s\t", account.getAno());
							System.out.printf("계좌주 : %s\t", account.getOwner());
							System.out.printf("잔고 : %,d원 \n", account.getBalance());
							break;
					 }
				}
				break;
			}else {
				System.out.println("결과: 계좌가 없습니다. 다시 입력해 주세요");
			}
		}//while 끝
		
	} //selectAccount() 끝
	
	public Account findAccount(String ano) {
		
		Account account = null;  
		
		//db 처리
		try {
			conn = JDBCUtil.getConnection();
			String sql = "SELECT * FROM account WHERE ano = ?";
			
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setString(1, ano);
			
			//1개 검색 처리
			rs = pstmt.executeQuery();
			if(rs.next()) { 
				ano = rs.getString("ano");
				String owner = rs.getString("owner"); 
				int balance = rs.getInt("balance"); 
				
				account = new Account(ano, owner, balance);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JDBCUtil.close(conn, pstmt, rs);
		}
		
		return account;
	
	} //findAccount() 끝
	
} //class 끝