package ifexample;

import java.util.Scanner;

public class LeafYear {

	public static void main(String[] args) {
		// 윤년을 판정해주는 프로그램
		// 윤년 - 4년마다 1번 (4의 배수 - 나머지 이용)
		// 추가 조건 - 100년 단위는 윤년이 아님(and), 400년 단위는 윤년(or)
		// 변수 - year
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("년도를 입력하시오 : ");
		int year = sc.nextInt();
		
		if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
			System.out.println(year + "년은 윤년입니다.");
		} else { //나머지가 1,2,3인 경우
			System.out.println(year + "년은 평년입니다.");
		}
		
		sc.close();
		
	}

}
