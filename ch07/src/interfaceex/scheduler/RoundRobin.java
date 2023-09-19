package interfaceex.scheduler;

public class RoundRobin implements Scheduler {

	@Override
	public void getNextCall() {
		System.out.println("상담전화를 순서대로 가져오기");
	}

	@Override
	public void sendCallToAgent() {
		System.out.println("다음 순서 상담원에게 배분하기");
	}
	
}
