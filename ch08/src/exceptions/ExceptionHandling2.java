package exceptions;

public class ExceptionHandling2 {
	
	public static void printLength(String data) {
		
		//예외 처리(실행 예외 - runtime error : 실행을 해야지만 에러 확인 가능)
		try {
			//에러가 발생할 수 있는 영
			int count = data.length(); //글자수 세는 함수
			System.out.println("문자 수 : " + count); 
		} catch(NullPointerException e) { //에러 처리 구문
			System.out.println(e.getMessage());
			e.printStackTrace(); //경로를 추적해서 에러를 출력
		}
	}

	public static void main(String[] args) {
		System.out.println("[프로그램 시작]\n");
		
		printLength("Hello"); //5
		printLength("지하철"); //3
		printLength(null); //3
		
		System.out.println("[프로그램 종료]\n");
	}

}
