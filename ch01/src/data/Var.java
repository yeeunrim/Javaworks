package data;

public class Var {

	public static void main(String[] args) {
		// 변수를 사용
		// 변수 선언 방법 - 자료형 변수 이름
		int year; //정수형 변수 year를 선언
		year = 2023; //정수형 변수 year에 2023을 대입
		System.out.println(year + "년"); //숫자+문자(연결하기)
		//홑따음표로 했을 시, 아스키코드 값으로 변환됨
		
		int month = 9; //변수의 초기화(선언과 동시에 값을 대입)
		System.out.println(month + "월");
		
		int day = 5;
		System.out.println(day + "일");
		
		System.out.println("");
		
		//예제
		//손흥민은 3학년 2반입니다.
		//변수 - 이름(name), 학년(grade), 반(schoolClass)
		//문자열 자료형 - String, 한 문자 자료형 - char
		/* 변수 이름을 명명시 주의할 점
		1. 예약어 안 됨
		2. 공백(문자) 안 됨
		3. 숫자로 시작할 수 없음 */
		
		String name = "손흥민";
		 
		int grade = 3;
		int schoolClass = 2; 
		//class와 같이 예약어(이미 정해진 명령어)는 사용할 수 없음
		
		System.out.println(name + "은 " + grade + "학년 " 
					+ schoolClass + "반입니다.");
		
	}

}
