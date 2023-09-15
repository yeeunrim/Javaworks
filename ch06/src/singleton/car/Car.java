package singleton.car;

public class Car {
	//필드
	//차량 번호가 나올 때마다 증가시키기 위해 추가 (클래스 변수)
	private static int SerialNum = 1000; //기준 변호 - 클래스 변수
	private int carNum; //차량 번호 - 인스턴스 변수
	
	//생성자
	public Car() {
		SerialNum++;
		carNum = SerialNum;
	}
	
	//메서드
	public int getCarNum() {
		return carNum;
	}
	
}
