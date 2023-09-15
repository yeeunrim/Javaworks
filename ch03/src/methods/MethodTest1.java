package methods;

public class MethodTest1 {
		
	// 변수의 선언과 사용
	// 함수 정의와 호출
	
	public static void main(String[] args) {
		
		//main은 가능하면 간략하게 (조립)
		sayHello();
		sayHello("임예은");
		sayHello("예은");
		
	}
	
	//sayHello() 이름의 함수를 정의
	//이름이 같아도 매개변수가 다르기 때문에 가능
	//void - 반환 값이 없음 (비어 있음)
	public static void sayHello() { 
		System.out.println("안녕하세요~안녕");
	}

	//매개변수(parameter)가 있는 함수 정의
	public static void sayHello(String name) {
		System.out.println("안녕하세요~" + name);
	}
}
