package funcinterface;

public class MyInterfaceMain {

	public static void main(String[] args) {
		
		MyFunction1 function;
		
		//람다식 표현으로 추상 메서드를 실체로 구현
		//MyFunction1의 생성자가 매개변수가 없다.
		function = () -> { //()안에 매개변수가 없어서 비어놓음
			System.out.println("안녕!");
		} ;
		
		//코드가 한 줄인 경우, 중괄호 생략 가능
		function = () -> System.out.println("안녕!");
	
		function.method();

	}

}
