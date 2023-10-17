package board;

public class PrintTest {
	
	public static void main(String[] args) {
		
		//정수 
		System.out.printf("%d\n", 85);   //85
		System.out.printf("%7d\n", 85);  //85 (7자리, 빈자리 공백처리-5자리)
		System.out.printf("%-7d\n", 85); //85 (7자리, 빈자리 공백처리, 왼쪽정렬)
		
		System.out.println();
		
		//문자열
		System.out.printf("%s\n", "hello");   //hello
		System.out.printf("%7s\n", "hello");  //hello (7자리, 빈자리 공백처리-2자리)
		System.out.printf("%-7s\n", "hello"); //hello (7자리, 빈자리 공백처리, 왼쪽정렬)
		
	}

}
