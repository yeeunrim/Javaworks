package exceptions;

public class ExceptionHandling1 {
	
	public static void printLength(String data) {
		
		int count = data.length();
		System.out.println("문자 수 : " + count);
	}

	public static void main(String[] args) {
		System.out.println("[프로그램 시작]\n");
		
		printLength("Hello"); //5
		printLength("지하철"); //3
		printLength(null); //3
		
		System.out.println("[프로그램 종료]\n");
	}

}
