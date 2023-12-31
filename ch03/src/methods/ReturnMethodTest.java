package methods;

public class ReturnMethodTest {

	//return이 있는 함수 (반환 자료형) - int, String
	//호출한 곳으로 반환값을 보냄
	
	public static void main(String[] args) {
		
		int n1 = 10, n2 = 20; //main에 있는 local 변수(지역 변수)
		
		//더하기 함수 호출
		int sum = add(n1, n2);
		System.out.println("결과값 : " + sum);
		
		//제곱수 호출
		int result = square(n1);
		System.out.println("결과값 : "+ result);
		
		//메세지 호출
		String msg = message();
		System.out.println(msg);
	}

	//return이 있고, 매개변수 2개인 함수이름 - add()
	public static int add(int a, int b) {
		return a + b;		
	}
	
	//return이 있고, 매개변수 1개인 함수이름 - square()
	public static int square(int x) {
		return x * x;
	}
		
	//return이 있고, 매개변수 0개인 함수이름 - square()
	public static String message() {
		return "행운을 빕니다!";
		
	}
	
}
