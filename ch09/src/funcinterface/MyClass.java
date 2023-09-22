package funcinterface;

//MyFunction1을 구현해서 "Hello"를 프린트 하기
public class MyClass implements MyFunction1{

	@Override
	public void method() {
		System.out.println("Hello");
	}

}
