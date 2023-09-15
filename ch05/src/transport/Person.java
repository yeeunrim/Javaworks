package transport;

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
	
	//버스를 탄다. - 메서드
	public void takeBus(Bus bus) { //기본 자료형이 아닌 클래스 객체가 들어감
		bus.take(1500); //버스 요금
		this.money -= 1500; //승객의 가진 돈이 버스 요금만큼 차감
	}
	
	//지하철을 탄다. - 메서드
	public void takeSubway(Subway subway) { //기본 자료형이 아닌 클래스 객체가 들어감
		subway.take(1350); //버스 요금
		this.money -= 1350; //승객의 가진 돈이 버스 요금만큼 차감
	}
	
	
	//사람 정보 
	public void showPersonInfo() {
		System.out.printf("%s님의 남은 돈은 %,d원입니다.\n", name, money);
	}

}
