package whileexample;

public class WhileEx1 {

	public static void main(String[] args) {
		// While 반복문
		/* System.out.println(1);
		System.out.println(2);
		System.out.println(3);
		System.out.println(4);
		System.out.println(5); 
		-> 코드 낭비 */ 
		// 초기값, 종료값, 증감값(1증가, 감소) 필요
		
		int i = 0;
		
		while(i <= 100) {
			System.out.println(i++); //1~100까지 출력
		}

	}

}
