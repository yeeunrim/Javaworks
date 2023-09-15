package constant;

import java.util.Scanner;

public class KmToMile {

	public static void main(String[] args) {
		// Km를 입력받아서 mile로 출력하는 프로그램
		// 변환 상수를 알아야함 - 1mile = 1.609344km
		
		//입력
		Scanner scan = new Scanner(System.in);
		
		System.out.print("공의 속도를 입력하세요(km/h) : ");
		double kph = scan.nextDouble();
		
		//선언
		final double RATE_KPH_MPH = 1.609344;
		double mph = 0.0;
		
		//연산
		mph = kph / RATE_KPH_MPH;
		
		//출력
		System.out.println("공의 속도는 " + mph + "mile 입니다.");
		System.out.printf("공의 속도는 %.2fmile 입니다.", mph);
		
		
		scan.close();

	}

}
