package nestedclass;

class Out{
	int outNum = 100; 
	static int sNum = 200;
	
	//익명 개체 - 클래스 이름을 사용하지 않은 익명(이름없는:Annoymous) 클래스	
	Runnable runner = new Runnable() {
		int localNum = 20;

		@Override
		public void run() {
			System.out.println("외부 클래스의 인스턴스 변수 : " + outNum + "\n외부 클래스의 정적 변수 : " 
					+ sNum + "\n내부 클래스의 정적 변수 : " + localNum);
		}
		
	}; //세미콜론 추가
	
}

public class LocalInnerClass2 {

	public static void main(String[] args) {
		Out out = new Out();
		out.runner.run();
	}

}
