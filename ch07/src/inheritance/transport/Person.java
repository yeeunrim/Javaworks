package inheritance.transport;

//사람 클래스(자료형)
public class Person {
	//필드(속성)
	String name; //이름 
	int money; //가진 돈
	
	//생성자를 매개변수를 이용해 데이터 저장
	public Person(String name, int money) {
		this.name = name;
		this.money = money;
	}
	
	//교통수단 이용하는 메서드
	//매개변수의 다형성을 이용
	public void take(Vehicle vehicle, int fare) {
		vehicle.carry(fare);
		this.money -= fare;
	}
	
	
	//사람 정보 
	public void showPersonInfo() {
		System.out.printf("%s님의 남은 돈은 %,d원입니다.\n", name, money);
	}

}
