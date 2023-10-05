package strings;

import java.util.Scanner;

public class StringMethod {

	public static void main(String[] args) {
		
		//주민등록번호 - 문자의 길이 length()
		//String personId = "991215-2345678";
		//System.out.println(personId.length());
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("주민번호 입력 > ");
		String personId = scanner.nextLine();
		
		//문자 추출 - substring()
		//0번 ~ 5번 인덱스 출력
		String yyyymmdd = personId.substring(0, 6); 
		System.out.println("생년월일 : " + yyyymmdd);
		
		//7번 인덱스부터 출력
		String secondNum = personId.substring(7);
		System.out.println("주민번호 뒷 자리 : " + secondNum);
		
		//성별 구분
		char gender = personId.charAt(7);
		
		if(personId.length() == 14) {
			if(gender == '1' || gender == '3') {
				System.out.println("성별 : 남자");
			} else if (gender == '2' || gender == '4') {
				System.out.println("성별 : 여자");
			} 
		} else {
			System.out.println("잘못된 주민번호 형식입니다.");
		}
			
	}
}
