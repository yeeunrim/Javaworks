package classes.methods;

public class UseHello {

	public static void main(String[] args) {
		
		//Hello 클래스 사용
		Hello say = new Hello();
		say.sayHello(); //호출
		
		System.out.println(say);
		
		Hello say1 = new Hello();
		say1.sayHello("임예은");
		
		System.out.println(say1);
	}

}