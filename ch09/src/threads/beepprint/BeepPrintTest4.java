package threads.beepprint;

import java.awt.Toolkit;

public class BeepPrintTest4 {

	public static void main(String[] args) {

		//스레드를 람다식(익명 함수형 프로그래밍)으로 구현
		Thread thread = new Thread(() -> { //람다식 : 매개변수 없을 때(void형) 소괄호 생략 불가
			Toolkit toolkit = Toolkit.getDefaultToolkit();
			for(int i=0; i<=5; i++) {
				toolkit.beep();
				
				try {
					Thread.sleep(1000);
				} catch(InterruptedException e) {
					e.printStackTrace();
				}
		
			}
		});
		
		thread.start();
		
		//문자 출력
		for(int i=0; i<5; i++) {
			System.out.println("띵");
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
		
	} //main 끝

} //class 끝
