package constant;

public class ConstantTest1 {

	public static void main(String[] args) {
		// 상수 선언 및 사용
		
		// 변수
		int maxNum = 100;
		maxNum = 1000;
		
		System.out.println(maxNum);
		
		// 상수
		final int MAX_NUM = 100;
		// MAX_NUM = 1000; 메모리에 할당할 수 없음
		// 따라서 값을 변경하는 것이 불가능하다.
		
		System.out.println(MAX_NUM);
		
		// 원의 넓이
		// 변수 - radius, circleArea
		// 상수 - PI
		
		int radius = 5;
		final double PI = 3.14; //값을 수정하는 것이 불가능
		
		double circleArea;
		
		circleArea = radius * radius * PI;
		
		System.out.println("원의 넓이는 " + circleArea + "입니다.");
	
	}

}
