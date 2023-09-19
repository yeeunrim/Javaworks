package interfaceex.remocon;

public interface RemoteControl {
	
	//인터페이스 상수
	public int MAX_VOLUME = 10; //최대값
	public int MIN_VOLUME = 0;  //최솟값
	
	//추상 메서드
	public void turnOn();
	
	public void turnOff();
	
	public void setVolume(int volume);
	
	//정적 메서드
	public static void changeBattery() {
		System.out.println("건전지를 교환합니다.");
	}
	
	//일반 메서드 (구체 메서드) - default 키워드 붙임
	default void setMute(boolean mute) {
		if(mute) {
			System.out.println("무음 처리합니다.");
		} else {
			System.out.println("무음 해제합니다.");
		}
	}
}
