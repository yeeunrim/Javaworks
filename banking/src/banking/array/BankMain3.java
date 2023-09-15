package banking.array;

import java.util.Scanner;

public class BankMain3 {

	//계좌를 저장할 배열의 크기를 100으로 설정
	static Account[] accounts = new Account[100];
	
	//기본 생성자 (추가)
	Account accnt = new Account();
	
	//전체적으로 영향을 줘야하기 때문에
	static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		//상태 변수
		boolean sw = true;
		
		while(sw) {
			//메뉴판
			System.out.println("=======================================================");
			System.out.println("1. 계좌 생성 | 2. 계좌 목록 | 3. 예금 | 4. 출금 | 5. 종료");
			System.out.println("=======================================================");
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
				sw = false;       //종료
			} else {
				System.out.println("지원되지 않는 기능입니다. 다시 입력해주세요.");
			}
		} //while 끝
		
		System.out.println("프로그램을 종료합니다.");
		scanner.close();
		
	} //main 끝	
	
	//계좌 생성
	private static void createAccount() {
		System.out.println("=======================================================");
		System.out.println("                        계좌 생성                         ");
		System.out.println("=======================================================");
		
		//계좌 중복 방지
		while(true) {
			System.out.print("계좌번호 > ");
			String ano = scanner.nextLine();
			
			//중복 계좌가 있는 지 채킹
			if(findAccount(ano) != null) {//중복 계좌가 있으면
				System.out.println("확인 ! 중복 계좌입니다. 다시 입력해주세요.");
			} else {//중복 계좌가 없으면
				System.out.print("계좌주 > ");
				String owner = scanner.nextLine();
				
				System.out.print("초기 입금액 > ");
				int balance = Integer.parseInt(scanner.nextLine());
				
				//accounts[0] = new Account(ano, owner, balance); //연습 데이터 1개 생성
				for(int i=0; i<accounts.length; i++) {
					if(accounts[i] == null) {//배열의 요소가 비어있을 때 값을 저장
						accounts[i] = new Account(ano, owner, balance);
						System.out.println("결과 : 계좌가 생성되었습니다.");
						break; //for를 빠져나옴
					} //if 끝
				} //for 끝
				
				break; //while을 빠져나옴
				
			} //if~else 끝		
		} //while 끝
		
	} //createAccount 끝
	
	//계좌 목록
	private static void getAccountList() {
		System.out.println("=======================================================");
		System.out.println("                        계좌 목록                         ");
		System.out.println("=======================================================");
		
		for(int i=0; i<accounts.length; i++) {
			if(accounts[i] != null) {
				System.out.printf("계좌번호 : %s\t", accounts[i].getAno());
				System.out.printf("계좌주 : %s\t", accounts[i].getOwner());
				System.out.printf("잔고 : %,d원\n", accounts[i].getBalance());
			} 
		}
	}
	
	//입금
	private static void deposit() {
		System.out.println("=======================================================");
		System.out.println("                          입금                           ");
		System.out.println("=======================================================");
		
		while(true)	{
			System.out.print("계좌번호 > ");
			String ano = scanner.nextLine();
			
			if(findAccount(ano) != null) {
					System.out.print("입금액 > ");
					int money = Integer.parseInt(scanner.nextLine());
					
					Account account = findAccount(ano);
					account.setBalance(account.getBalance() + money);
					System.out.println("결과 : 정상 처리가 되었습니다.");
					break;
			} else {
					System.out.println("확인 ! 계좌가 없습니다. 다시 입력해 주세요.");
			}
		}
			
	}
	
	//출금
	private static void withdraw() {
		System.out.println("=======================================================");
		System.out.println("                          출금                           ");
		System.out.println("=======================================================");
		
		//잔액 부족 처리
		while(true) {
			System.out.print("계좌번호 > ");
			String ano = scanner.nextLine();
			
			if(findAccount(ano) != null) {
				while(true) {
					System.out.print("출금액 > ");
					int money = Integer.parseInt(scanner.nextLine());
				
					Account account = findAccount(ano);
					if (account.getBalance() < money){
						System.out.println("확인 ! 잔액이 부족합니다. 다시 입력해 주세요.");
					}else {
						account.setBalance(account.getBalance() - money);
						System.out.println("결과 : 정상 처리가 되었습니다.");
						break;
					}
				} //안쪽 while 
				break;
			}else {
				System.out.println("확인 ! 계좌가 없습니다. 다시 입력해 주세요.");
			}
		} //바깥쪽 while
	}
		
	
	//계좌 검색
	private static Account findAccount(String ano) {
		Account account = null; //찾을 계좌를 저장할 객체 변수 선언
		
		for(int i=0; i<accounts.length; i++) {
			if(accounts[i] != null) {
				String dbAno = accounts[i].getAno(); //이미 배열에 생성된 계좌번호를 가져옴(중요)
				if(dbAno.equals(ano)) { //외부에서 입력한 찾는 계좌와 일치한다면
					account = accounts[i]; //일치하는 계좌를 저장함
					break;
				}
			}
		}
		
		return account;
	}
	
} //class 끝
