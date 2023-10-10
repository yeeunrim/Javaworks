package banking.arraylist;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;

import banking.array.Account;

public class BankArrayList {
	
	//통장 계좌를 저장할 자료 구조의 객체 생성
	static List<Account> accountList = new ArrayList<>();
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		
		//상태 변수
		boolean sw = true;
		
		while(sw) {
			try {
				//메뉴판
				System.out.println("===========================================================================");
				System.out.println("1. 계좌 생성 | 2. 계좌 목록 | 3. 예금 | 4. 출금 | 5. 계좌 삭제 | 6. 계좌 검색 | 7. 종료");
				System.out.println("===========================================================================");
				System.out.print("선택 > ");
				
				//메뉴 선택
				int selectNo = Integer.parseInt(scanner.nextLine());
				//int selectNo = scanner.nextInt();
				
				if(selectNo == 1) {
					createAccount();  //계좌 생성
				} else if (selectNo == 2) {
					getAccountList(); //계좌 목록
				} else if (selectNo == 3) {
					deposit();        //예금
				} else if (selectNo == 4) {
					withdraw();       //출금
				} else if (selectNo == 5) {
					removeAccount();  //계좌 삭제
				} else if (selectNo == 6) {
					selectAccount();  //계좌 검색
				} else if (selectNo == 7) {
					sw = false;       //종료
				} else {
					System.out.println("지원되지 않는 기능입니다. 다시 입력해주세요.");
				}
			} catch(NumberFormatException e){
				System.out.println("올바른 숫자를 입력하세요.");
			}
			
		} //while 끝
		
		System.out.println("프로그램을 종료합니다.");
		scanner.close();
		
	} //main 끝
	
	//계좌 생성
	private static void createAccount() {
		
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
					System.out.print("계좌주 > ");
					String owner = scanner.nextLine();
					
					System.out.print("초기 입금액 > ");
					int balance = Integer.parseInt(scanner.nextLine());
					
					//입력받은 내용을 매개변수로 계좌 생성함
					Account newAccount = new Account(ano, owner, balance);
					accountList.add(newAccount); //arrayList에 저장
					System.out.println("결과 : 계좌가 생성되었습니다.");
					break;
				} //if~else 끝
			} else {
				System.out.println("올바르지 않은 형식입니다. 올바르게 다시 작성해주세요.");
			}
			 
		} //while 끝
		
	} //createAccount 끝
	
	//계좌 목록
	private static void getAccountList() {
		
		System.out.println("===========================================================================");
		System.out.println("                                  계좌 목록                                  ");
		System.out.println("===========================================================================");
		
		//계좌 목록 조회
		for(int i=0; i<accountList.size(); i++) {
			Account account = accountList.get(i);
				System.out.printf("계좌번호 : %s\t", account.getAno());
				System.out.printf("계좌주 : %s\t", account.getOwner());
				System.out.printf("잔고 : %,d원\n", account.getBalance());
		}
		
	} //getAccountList 끝
	
	//입금
	private static void deposit() {
		
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
					
					account.setBalance(account.getBalance() + money);
					System.out.println("결과 : 정상 처리가 되었습니다.");
					break;
			} else {
					System.out.println("확인 ! 계좌가 없습니다. 다시 입력해 주세요.");
			}
		} //while 끝
		
	} //deposit 끝
	
	//출금
	private static void withdraw() {
		
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
					if (account.getBalance() < money){ //츌금액이 잔고보다 많으면
						System.out.println("확인 ! 잔액이 부족합니다. 다시 입력해 주세요.");
					}else {
						account.setBalance(account.getBalance() - money);
						System.out.println("결과 : 정상 처리가 되었습니다.");
						break;
					}
				} //안쪽 while 끝
				break;
			}else {
				System.out.println("확인 ! 계좌가 없습니다. 다시 입력해 주세요.");
			}
		} //바깥쪽 while 끝
		
	} //withdraw 끝
	
	//계좌 삭제
	private static void removeAccount() {
		
		System.out.println("===========================================================================");
		System.out.println("                                  계좌 삭제                                  ");
		System.out.println("===========================================================================");
		
		//계좌를 입력하고 그 입력한 계좌랑 원래 있던 계좌랑 비교하고 있으면 삭제
		while(true) {
			System.out.print("계좌번호 [형식(숫자):00-00-000] > ");
			String regExp = "\\d{2}-\\d{2}-\\d{3}";
			
			String ano = scanner.nextLine();
			
			boolean result = Pattern.matches(regExp, ano);
			
			if(result) {
				//계좌가 있는 지 채킹
				Account account = findAccount(ano);
				
				if(findAccount(ano) != null) {//계좌가 있으면
					//계좌 삭제
					accountList.remove(account);
					System.out.println("계좌가 삭제되었습니다.");
					break;
				} else {//중복 계좌가 없으면
					System.out.println("삭제할 계좌가 없습니다. 다시 확인해주세요.");
				} //if~else 끝
			} else {
				System.out.println("올바르지 않은 형식입니다. 올바르게 다시 작성해주세요.");
			}
			 
		} //while 끝
		
	} //removeAccount 끝
	
	//계좌 검색
	private static void selectAccount() {
		
		System.out.println("===========================================================================");
		System.out.println("                                  계좌 검색                                  ");
		System.out.println("===========================================================================");
		
		//계좌를 입력받아서 기존에 입력한 것과 비교해서 있으면 출력
		while(true) {
			System.out.print("계좌번호 [형식(숫자):00-00-000] > ");
			String regExp = "\\d{2}-\\d{2}-\\d{3}";
			
			String ano = scanner.nextLine();
			
			boolean result = Pattern.matches(regExp, ano);
			
			if(result) {
				//계좌가 있는 지 채킹
				Account account = findAccount(ano);
				
				if(findAccount(ano) != null) {//계좌가 있으면
					//계좌 출력
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
				} else {//중복 계좌가 없으면
					System.out.println("없는 계좌입니다. 다시 확인해주세요.");
				} //if~else 끝
			} else {
				System.out.println("올바르지 않은 형식입니다. 올바르게 다시 작성해주세요.");
			}
		}
		
	} //selectAccount 끝
	
	//계좌 찾기
	private static Account findAccount(String ano) {
		Account account = null;
		
		for(int i=0; i<accountList.size(); i++) {
			if(accountList != null) {
				//이미 등록된 계좌를 가져와서 
				String dbAno = accountList.get(i).getAno();
				//외부에서 입력한 계좌와 일치 여부 확인
				if(dbAno.equals(ano)){
					account = accountList.get(i); //계좌 객체 생성
					break;
				}	
			}
		}
		return account;
	} //findAccount 끝
	
} //class 끝
