package threads.beepprint;

import java.awt.Toolkit;

//Runnable 인터페이스에는 run()메서드가 있고, 구현할 때 재정의 필요
public class BeepTask implements Runnable{

	//소리를 발생하는 작업 스레드 구현
	@Override
	public void run() {
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		for(int i=1; i<=5; i++) {
			toolkit.beep();
			try {
				Thread.sleep(1000);
			} catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
