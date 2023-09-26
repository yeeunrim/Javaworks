package threads.synchronize;

public class WorkObject {

	//synchronized를 해줘야지 main에서 실행했을 때 오류가 나지 않음
	//동기화 메서드로 구현(내부적으로 잠금(lock))
	public synchronized void methodA() {
		//현재 실행중인 스레드 객체 생성
		Thread thread = Thread.currentThread();
		System.out.println(thread.getName() + " : 작업 실행");
		notify(); //다른 스레드를 실행할 수 있게 실행 대기 상태로 만듦(알림)
		
		try {
			wait(); //자신은 일시 정지 상태로 만듦
		} catch (InterruptedException e) {
			e.printStackTrace();
		} 
		
	}
	
	public synchronized void methodB() {
		//현재 실행중인 스레드 객체 생성
		Thread thread = Thread.currentThread();
		System.out.println(thread.getName() + " : 작업 실행");
		notify(); //다른 스레드를 실행할 수 있게 실행 대기 상태로 만듦(알림)
		
		try {
			wait(); //자신은 일시 정지 상태로 만듦
		} catch (InterruptedException e) {
			e.printStackTrace();
		} 
		
	}
	
}
