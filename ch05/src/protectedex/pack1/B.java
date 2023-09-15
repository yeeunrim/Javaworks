package protectedex.pack1;

public class B {
	
	public void method() {
		//다른 클래스여도 같은 패키지이기 때문에 접근이 가능하다.
		A a = new A();
		a.field = "yes";
		a.method();
	}
}
