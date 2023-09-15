package forexample;

public class ForEx1 {

	public static void main(String[] args) {
		/* 
		 for(초기값;종료값;증감값) {
			실행문;
		} 
		*/
		
		// 1 ~ 10 출력
		int i = 0;
		for(i=1; i<=10; i++) {
			System.out.print(i + " ");
		}
		
		System.out.println("");
		
		// 아스키 코드값 알파벳 출력
		// 'A' - 65, 'a' - 97, 0 - 48
		// 영어 대문자 출력 (아스키 코드)
		for(int num = 65; num <= 90; num++) {
			System.out.print((char)num + " "); 
		} 
		
		System.out.println("");
		
		// 영어 소문자 출력 (아스키 코드)
		for(char ch = 97; ch < 123; ch++) {
			System.out.print(ch + " ");
		}
		
		System.out.println("");
		
		// 한글 출력 (유니 코드)
		for(char kor = 12593; kor < 12685; kor++) {
			System.out.print(kor + " ");
		}
		
	}

}
