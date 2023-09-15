package classes.constructor;

public class PersonTest {

	public static void main(String[] args) {
		//Person 객체 생성과 사용
		
		//1. 기본 생성자
		Person p1 = new Person();
		
		p1.name = "홍길동";
		p1.height = 178.5676f;
		p1.weight = 87.3885f;
		p1.showPersonInfo();
		
		//2.매개변수가 있는 생성자 (일부 필드)
		Person p2 = new Person("손흥민");
		p2.height = 182.456F;
		p2.weight = 78.4323F;
		p2.showPersonInfo();
		
		//3. 매개변수가 있는 생성자 (모든 필드)
		Person p3 = new Person("우영우", 162.145f, 46.678f);
		p3.showPersonInfo();
	
	}

}
