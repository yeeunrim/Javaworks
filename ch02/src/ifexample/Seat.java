package ifexample;

import java.util.Scanner;

public class Seat {

	public static void main(String[] args) {
		// 입장객 수에 따른 좌석 줄 수를 계산하는 프로그램을 작성하세요.
		// 변수 - 입장객 수(customer), 좌석 열 수(column), 좌석 줄 수(row)
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("입장객 수 입력 : ");
		int customer = scan.nextInt();
		
		System.out.print("좌석 열 수 입력 : ");
		int column = scan.nextInt();
		
		int row = 0 ;
		
		if(customer % column == 0) {
			row = customer / column;
		} else {
			row = customer / column + 1;
		}
			
		System.out.println("필요한 줄 : " + row + "줄" ); 
		
		scan.close();

	}

}
