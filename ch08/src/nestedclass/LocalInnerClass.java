package nestedclass;

//지역 내부 클래스
class Outer{
	
	//필드
	int outNum = 100; 
	static int sNum = 200;
	
	//메서드
	//메서드 내부의 클래스 생성
	Runnable getRubnable() {
		
		int num = 10; //로컬(지역) 변수 - 인터페이스 상수
		
		class MyRunnable implements Runnable{
			
			int localNum = 20;

			@Override
			public void run() { //Runnable에는 run() 하나만 존재
				//num = 20; -> 상수로 변환되어 변경될 수 없음 (final로 정의되어 있음)
				System.out.println("외부 클래스의 인스턴스 변수 : " + outNum + "\n외부 클래스의 정적 변수 : " 
						+ sNum + "\n내부 클래스의 정적 변수 : " + localNum);
				System.out.println(num);
			}
			
		}
		
		//MyRunnable myRun = new MyRunnable();
		//return myRun;
		return new MyRunnable();
		
	}
}

public class LocalInnerClass {

	public static void main(String[] args) {
		
		Outer outer = new Outer();
		
		outer.getRubnable().run();; //중첩으로 들어가줘야 한다.
		
	}

}
