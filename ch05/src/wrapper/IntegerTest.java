package wrapper;

public class IntegerTest {

	public static void main(String[] args) {
		//int num1 = 100; - 기본 자료형
		
		//객체(클래스)  - 기본 자료형처럼 사용 가능
		Integer num1 = 100;
		int num2 = 200;
		
		//num1이 객체이므로 메서드 접근 가능함
		int sum = num1.intValue() + num2;

		System.out.println(sum);
		
		//valueOf() - 매개변수로 정수나 문자열을 숫자로 변환하는 메서드
		Integer num3 = Integer.valueOf("123");
		System.out.println(num3);
		
		//paresInt() - 문자열을 숫자로 변환하는 메서드
		int num4 = Integer.parseInt("456");
		System.out.println(num4);
	}

}
