package input;

import java.util.Scanner; 
//소속에 따라서 import를 안해야 되는 경우도 존재
//빠르게 import 하는 법 : ctrl + space bar

public class ScannerTest1 {

	public static void main(String[] args) {
		// 입력 처리 - Scanner 클래스 사용
		// 문자열 - nextLine()
		// 숫자 - nextInt()
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("이름 입력 : ");
		String name = scanner.nextLine(); //문자열 입력
		
		System.out.print("나이 입력 : ");
		int age = scanner.nextInt(); //숫자 입력
		
		System.out.println("이름 : " + name + ", 나이 : " + age);
		
		scanner.close(); //닫기
		
	}

}
