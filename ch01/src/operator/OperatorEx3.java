package operator;

public class OperatorEx3 {

	public static void main(String[] args) {
		// 조건 연산자 -> 조건문(if문)
		// 결과값 = (조건비교) ? 참값 : 거짓값
		
		//예제1 - 결과값 정수면 정수 변수(int) 선언
		int num = (4 > 5) ? 10 : 20; //false이므로 20을 반환
		
		System.out.println("결과값 : " + num);

		//예제1.1 - 결과값 정수면 정수 변수(int) 선언
		int num2 = (4 < 5) ? 10 : 20; //true이므로 10을 반환
				
		System.out.println("결과값 : " + num2);
		
		//예제2 - 결과값이 한 문자로 출력 : 'T' / 'F'
		int fatherAge = 45;
		int motherAge = 48;
		
		char result = (fatherAge > motherAge) ? 'T' : 'F';
		
		System.out.println(result); //'F'
		
		//예제3 - 짝수, 홀수를 판별하는 프로그램
		//어떤 수를 2로 나눠서 나머지가 0이면 짝수, 1이면 홀수로 판별
		//결과값이 "짝수입니다" 또는 "홀수입니다"
		int num3 = 10;
		
		String str = (num3 % 2 == 0) ? "짝수입니다." : "홀수입니다.";
		
		System.out.println("판정 결과 : " + str);
		
		//예제3.1
			
		int num4 = 11;
				
		String str2 = (num4 % 2 == 0) ? "짝수입니다." : "홀수입니다.";
				
		System.out.println("판정 결과 : " + str2);
		
	}

}
