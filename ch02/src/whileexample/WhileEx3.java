package whileexample;

public class WhileEx3 {

	public static void main(String[] args) {
		// 1 ~ 10 까지 출력
		// 반복 조건문 사용 (while ~ if ~ break)
		// 변수 - i(반복하는 변수)
		
		int i = 0;
		
		while(true) { //무한 반복
			i++; // i = i + 1
			if(i > 10) {
				break;
			}
			
			System.out.println(i); //1, 2, 3 ... 9
		} 
		
	}

}
