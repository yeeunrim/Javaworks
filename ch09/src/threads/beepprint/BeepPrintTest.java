package threads.beepprint;

import java.awt.Toolkit;

public class BeepPrintTest {

	public static void main(String[] args) {

		//싱글 스레드 - 메인 스레드만 실행
		//"띵" 문자를 5번 출력
		//1초 간격으로 대기 시간 추가 - Thread.sleap(millisec)
		//소리 발생 - ToolKit의 beep() 
		
		//"띵" 소리를 5번 재생하기
		Toolkit toolkit = Toolkit.getDefaultToolkit();
			for(int i=1; i<=5; i++) {
				toolkit.beep();
				try {
					Thread.sleep(1000);
				} catch(InterruptedException e) {
					e.printStackTrace();
				}
			}
				
		for(int i=1; i<=5; i++) {
			System.out.println("띵");
			try {
				Thread.sleep(1000);
			} catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}

}
