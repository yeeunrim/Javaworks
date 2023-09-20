package interfaceex.remocon2;

import interfaceex.remocon.RemoteControl;

public class SmartTVTest {

	public static void main(String[] args) {
		
		//구형 객체(인스턴스) - tv
		SmartTV tv = new SmartTV();
		
		RemoteControl rc = tv; //부모타입으로 자동 형 변
		Searchable searchable = tv;
		
		rc.turnOn();
		rc.setVolume(6);
		rc.setMute(true);
	
		RemoteControl.changeBattery();
		
		searchable.search("www.naver.com");
		
		rc.turnOff();

	}

}
