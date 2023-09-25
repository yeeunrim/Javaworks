package threads.synchronize;

public class User2Thread extends Thread{

	//Calculator 참조
	private Calculator calculator;
		
	public User2Thread() {
		this.setName("User2Thread"); //스레드 이름 설정
	}
		
	public void setCalculator(Calculator calculator) {
		this.calculator = calculator;
	}
		
	@Override
	public void run() {
		calculator.setMemory(50);
	}
		
}
