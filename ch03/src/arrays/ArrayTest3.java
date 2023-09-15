package arrays;

public class ArrayTest3 {

	public static void main(String[] args) {
		// 크기가 4인 정수형 배열 선언
		// 값이 비어있으면 정수형의 경우는 0이 출력
		int[] number = new int[4];
		int total = 0;
		
		//입력(저장)
		number[0] = 10;
		number[1] = 40;
		number[2] = 50;
		
		// 직접 초기화
		// int[] number = {10, 40, 50, 0};
		
		//특정 위치 출력
		System.out.println(number[1]);
		
		System.out.println();
		
		//전체 출력
		for(int i=0; i<number.length; i++) {
			total += number[i]; //누적 합계
			System.out.println(number[i]);
		}
		
		System.out.println();
		
		System.out.println("합계 : " + total);
		System.out.println("평균 : " + total / number.length);
		
	}

}
