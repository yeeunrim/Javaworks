package regexp;

import java.util.regex.Pattern;

public class PatternExample {
	
	public static void main(String[] args) {
		
		//전화 번호 형식 검증하기 - 경로 슬래시('\')와 구분을 위해서 한 개 더 붙임
		String regExp = "(02|010)-\\d{3,4}-\\d{4}";
		String phone = "010-4089-2878";
		//matches()는 검증 결과로 true/false로 반환함
		boolean result = Pattern.matches(regExp, phone);
		
		//System.out.println(result);
		if(result) { //result == true
			System.out.println("정규식과 일치합니다.");
		} else {
			System.out.println("정규식과 일치하지 않습니다.");
		}
		
		System.out.println("===============================================");
		
		//계좌번호 형식 검증하기
		regExp = "\\d{2}-\\d{3,4}";
		String account = "aa-1234";
		
		result = Pattern.matches(regExp, account);
		
		if(result) { //result == true
			System.out.println("계좌번호 형식과 일치합니다.");
		} else {
			System.out.println("계좌번호 형식과 일치하지 않습니다. 올바른 형식으로 입력하세요.");
		}
		
	}

}
