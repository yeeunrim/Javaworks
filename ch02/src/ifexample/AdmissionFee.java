package ifexample;

import java.util.Scanner;

public class AdmissionFee {

	public static void main(String[] args) {
		// 놀이 공원 입장료 계산
		// 취학 전 아동 - 1000원, 초등 - 2000원, 중.고등 - 2500원, 일반 - 3000원
		// 변수 - 나이(age), 입장료(fee)
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("나이를 입력하시오 : ");
		int age = scan.nextInt();
		
		int fee;
		
		System.out.println();
		
		if(age < 8) {
			fee = 1000;
			System.out.println("취학 전 아동입니다.");
		} else if(age >= 8 && age < 14) {
			fee = 2000;
			System.out.println("초등학생입니다.");
		} else if(age >=14 && age < 19) {
			fee = 2500;
			System.out.println("중.고등학생입니다.");
		} else {
			fee = 3000;
			System.out.println("성인입니다.");
		}

		System.out.println("따라서 입장료는 " + fee + "원 입니다.");
		
		scan.close();
	}
	
}
