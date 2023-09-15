package whileexample;

import java.util.Scanner;

public class KeyRepeat {

	public static void main(String[] args) {
		// 'y' key를 입력하면 "계속 반복합니다" 출력
		// 'n' key를 입력하면 "반복을 중단합니다" 출력
		// 그 외의 key를 입력하면 "key를 잘못 눌렀습니다" 출력
		
		// 문자열 등등 비교함수는 equals()
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("계속 반복할까요? (y/n) : ");
			//nextLine()로 인해 String을 사용
			String key = sc.nextLine(); 
			
			//문자가 일치하는 지 비교 -> equals
			if(key.equals("y") || key.equals("Y")) { 
				System.out.println("계속 반복합니다.");
			} else if(key.equals("n") || key.equals("N")) {
				System.out.println("반복을 중단합니다.");	
				break;
			} else {
				System.out.println("key를 잘못 눌렀습니다.");
			}
		}
		
		sc.close();
		
	} //main()함수 끝

} //클래스 끝
