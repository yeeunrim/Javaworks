package switchexample;

public class SwitchCaseTest3 {

	public static void main(String[] args) {
		// 사칙연산
		// 변수 - num1, num2, operator
		// 2 * 3 = 6 
		
		int num1 = 10;
		int num2 = 2;
		int result = 0; //0으로 초기화
		char operator = '*'; //값을 초기화, char의 경우는 초기화 필수
		
		// if ~ else if ~ else문
		// if문의 경우는 블록이 break 역할을 한다.
		if(operator == '+') {
			result = num1 + num2;
		} else if (operator == '-') {
			result = num1 - num2;
		} else if (operator == '*') {
			result = num1 * num2;
		} else if (operator == '/') {
			result = num1 / num2;
		} else {
			System.out.println("지원하지 않음");
			return; //즉시 종료
		}
		
		System.out.println("결과 값은 " + result + "이다.");
		
		
		// switch ~ case ~ break문
		switch(operator) {
		case '+':
			result = num1 + num2;
			break;
			
		case '-':
			result = num1 - num2;
			break;
			
		case '*':
			result = num1 * num2;
			break;
			
		case '/':
			result = num1 / num2;
			break;
		default:
			System.out.println("지원하지 않음");
			return; //즉시 종료
		}
		
		System.out.println("결과 값은 " + result + "이다.");
		
			
	} //main 끝

} //class 끝
