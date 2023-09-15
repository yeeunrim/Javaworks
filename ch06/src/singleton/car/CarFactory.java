package singleton.car;

public class CarFactory {
	//필드
	private static CarFactory instance;
	
	//기본 생성자
	private CarFactory() {}
	
	//instance  생성 메서드
	public static CarFactory getInstance() {
		if(instance == null)	{
			instance = new CarFactory();
		}
		return instance;
	}
	
	//car 생성 메서드
	public Car createCar() {
		Car car = new Car();
		return car;
	}
}
