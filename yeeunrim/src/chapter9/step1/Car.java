package chapter9.step1;

public abstract class Car {
	
	public abstract void run();
	
	public void stop() {
		System.out.println("차가 멈춥니다.");
	}
	
	public abstract void refuel();
}
