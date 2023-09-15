package arrays;

public class ArrayTest1 {

	public static void main(String[] args) {
		// 변수와 배열의 차이점
		
		// 변수
		String car1 = "Sonata";
		String car2 = "Morning";
		String car3 = "K7";
		
		System.out.println(car1);
		System.out.println(car2);
		System.out.println(car3);
		
		System.out.println();
		
		// 배열 - 순서가 있음, 같은 데이터 중복 가능
		// 1. 중괄호를 이용해 직접 저장
		String[] cars = {"Sonata", "Morning", "K7"};
		// String[] cars = new String[] {"Sonata", "Morning", "K7"}; - 이것도 가능
		System.out.println(cars[0]);
		System.out.println(cars[1]);
		System.out.println(cars[2]);
		
		System.out.println();
		
		// 배열의 크기(개수) = 배열이름.length
		System.out.println("배열의 크기 : " + cars.length);
		
		System.out.println();
		
		// 2. 반복문(for문)을 이용해 전체 저장
		for(int i=0; i<cars.length; i++) {
			System.out.println(cars[i]);
		}

	}

}
