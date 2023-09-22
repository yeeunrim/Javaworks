package funcinterface;

//함수형 인터페이스를 사용하려는 이유 - 익명 함수 사용을 위해
//함수형 인터페이스에서는 추상 메서드를 1개밖에 사용하지 못한다.
@FunctionalInterface 
public interface MyFunction1 {
	
	public void method();
	
	//public void method2();
	
}
