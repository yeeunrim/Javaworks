package stringmethod;

public class StringMethods {

	public static void main(String[] args) {
		
		//문자열 다루기
		//문자열은 1차원 배열이라고 추정
		//charAt() : 해단 인덱스의 문자를 리턴함
		String subject = "자바 프로그래밍";
		
		char ch = subject.charAt(1);
		System.out.println(ch); //바
		
		//주민번호로 성별 구분
		String 주민번호 = "950815-2345678";
		
		char 성별 = 주민번호.charAt(7); //여자
		switch(성별) {
		case '1' : case '3' :
			System.out.println("남자");
			break;
		case '2' : case '4' :
			System.out.println("여자");
			break;
		}
		
		//subString(첫문자, 끝문자+1) : 문자열을 추출하는 메서드
		String 생년월일 = 주민번호.substring(0, 6); //0번 ~ 5번 인덱스 출력
		System.out.println(생년월일);
		
		String secondNum = 주민번호.substring(7); //8번 인덱스부터 끝까지 출력
		System.out.println(secondNum);
		
	}
}
