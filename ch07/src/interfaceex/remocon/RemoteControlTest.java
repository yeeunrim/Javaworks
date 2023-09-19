package interfaceex.remocon;

public class RemoteControlTest {

	public static void main(String[] args) {
		
		//객체 생성 - 인터페이스형(부모타입) - 자동 형 변환
		RemoteControl tv = new Television();
		
		//정보 출력
		tv.turnOn();
		tv.turnOff();
		tv.setVolume(-5);
		tv.setVolume(15);
		tv.setVolume(8);
		
		//건전지 교환
		RemoteControl.changeBattery();
		
		//무음 설정
		tv.setMute(true);
		tv.setMute(false);

	}

}
