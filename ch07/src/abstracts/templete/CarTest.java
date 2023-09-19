package abstracts.templete;

public class CarTest {

	public static void main(String[] args) {

		//Car car = new Car(); -> 추상 클래스는 객체 생성이 안됨
		//추상 클래스 타입으로 객체 생성
		//부모타입 변수 = new 자식타입
		Car hisCar = new ManualCar();
		
		//템플릿메서드 출력
		hisCar.run();
		
		System.out.println("================");
		
		Car myCar = new AICar();
		myCar.run();
		
	}

}
