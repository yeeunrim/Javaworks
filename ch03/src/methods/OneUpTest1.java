package methods;

public class OneUpTest1 {

	//1증가 하는 함수 정의
	//지역 변수의 생명 주기(scope) 
	// - 함수나 제어문의 블럭안에서 생성되고 호출된 뒤에 소멸
	
	public static int oneUp() {
		int x = 1; //지역 변수
		x++; // x += 1 (다른 언어에서는 이렇게 사용)
		return x;
	}
	
	public static void main(String[] args) {
		System.out.println(oneUp()); //2
		System.out.println(oneUp()); //2
		
		// System.out.println(x); - main에서는 정의되지 않은 변수
	}

}
