package operator;

public class Exchange {

	public static void main(String[] args) {
		// 변수의 값 교환
		// 변수 선언 - 입력 
		int x = 0;
		int y = 1;
		int temp; //임시 변수 선언
		
		// 출력		
		System.out.println("--교환 전--");
		System.out.println("x=" + x + " , "+ "y=" + y);
		// 더 큰 문자형을 추가해서 덧셈으로 되지 않도록 한다.
		
		System.out.println(); //한 줄 공백
		
		// 교환 처리(연산)
		temp = x; //temp = 0
		x = y; //x = 1
		y = temp; //y = 0  
		
		//출력
		System.out.println("--교환 후--");
		System.out.println("x=" + x + " , "+ "y=" + y);

	}

}
