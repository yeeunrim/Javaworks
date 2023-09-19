package abstracts.templete;

public abstract class Car {
	
	//추상메서드
	public abstract void drive();
	public abstract void stop();
	
	//구체메서드
	public void startCar() {
		System.out.println("시동을 겁니다.");
	}
	
	public void turnOff() {
		System.out.println("시동을 끕니다.");
	}
	
	//템플릿 메서드 정의
	//상속받는 클래스에서 수정할 수 없음 (final)
	public final void run() {
		startCar();
		drive();
		stop();
		turnOff();
	}
	
}
