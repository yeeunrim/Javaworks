package classes.constructor;

//참조 자료형 - Person 클래스 정의
//생성자 오버로딩 : 이름이 같고 자료형이 다른 경우

public class Person {
	String name; //이름
	float height; //키
	float weight; //몸무게
	
	//1. 기본 생성자
	public Person() {}
	
	//2. 매개변수가 있는 생성자 (일부 필드)
	public Person(String nm) { //이름 매개변수 생성
		name = nm;
	}
	
	//3. 매개변수가 있는 생성자 (모든 필드)
	public Person(String n, float h, float w) {
		name =n ; //외부에서 입력된 이름을 저장
		height = h;
		weight = w;
	}
	
	//메서드
	public void showPersonInfo() {
		System.out.printf("이름은 %s, 키는 %.1fcm이며 몸무게는 %.1fkg이다.\n", 
				name, height, weight);
	}
}
