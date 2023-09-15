package operator;

public class OperatorEx2 {

	public static void main(String[] args) {
		// 비교 연산자 : <, >, ==, !=, >=, <=
		// 결과는 true/false(boolean-가장 작은)로 나옴
		
		System.out.println(4 < 5); //true
		System.out.println(4 > 5); //false
		System.out.println(4 == 5); //false
		System.out.println(4 != 5); //true
		
		System.out.println("");
		
		// 비교 연산자 (변수 사용)
		
		int A = 4, B = 5; //변수 2개를 연속해서 선언
		
		System.out.println(A > B); //false
		System.out.println(A < B); //true
		System.out.println(A == B); //false
		System.out.println(A != B); //true
		
		System.out.println("");
		
		//손흥민 선수가 미혼
		//회원가입할 때, 미혼이거나 기혼을 선택하는 것에서 사용
		
		boolean isMerried = false;
		
		System.out.println(isMerried);
		
		System.out.println("");
		
		//결과가 "미혼입니다"
		//조건 연산자 : (비교값) ? 참인값 : 거짓인값
		
		String result = (isMerried == true) ? 
				           		"기혼입니다." : "미혼입니다.";
		
		System.out.println("손흥민 선수는 " + result);
		
	}

}
