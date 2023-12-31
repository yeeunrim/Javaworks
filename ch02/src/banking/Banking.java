package banking;

import java.util.Scanner;

public class Banking {

	public static void main(String[] args) {
		// 은행 업무 프로그램
		// 1. 예금 2. 출금 3. 잔액 조회 4. 종료
		
		Scanner sc = new Scanner(System.in); 
		
		int balance = 0; //잔고
		boolean sw = true; //상태 변수 
		
		while(sw) {
		// 메뉴 화면 생성
		System.out.println("==================================");
		System.out.println("1.예금 | 2.출금 | 3.잔액 조회 | 4.종료");
		System.out.println("==================================");
		
		int selNum = sc.nextInt(); //메뉴 번호 입력
		int money = 0; //입출금 - 변수 선언
		
		switch(selNum) {
		case 1:
			System.out.print("예금액 > ");
			money = sc.nextInt();
			balance += money;
			break;
		
		case 2:
			System.out.print("출금액 > ");
			money = sc.nextInt();
			if(money > balance) {
				System.out.println("잔액이 부족합니다.");	
			} else {
				balance -= money;
			}
			break;
			
		case 3:
			System.out.println("잔고 > " + balance);
			break;
			
		case 4:
			sw = false;
			break;
			default:
				System.out.println("잘못 눌렀습니다. 다시 눌러주세요.");
				break;
				
		         } //switch 끝
		
		} //while 끝
		
		System.out.println("서비스를 종료합니다.");
		sc.close();
		
	} //main 끝

} //class 끝
