package arraycopy;

public class ArrayCopyTest2 {

	public static void main(String[] args) {
		// 배열 복사하기 - 문자형 복사
		char[] arr1 = {'N', 'E', 'T'};
		
		// 크기가 3인 arr2인 배열 선언
		char[] arr2 = new char[3];
		
		//1. 복사
		for(int i=0; i<arr1.length; i++) {
			arr2[i] = arr1[i];
		}
		
		for(int i=0; i<arr2.length; i++) {
			System.out.print(arr2[i] + " ");
		}
		
		System.out.println();
		
		//1-1. 역순 복사
		char[] arr3 = new char[3];
		
		for(int i=0; i<arr1.length; i++) {
			arr3[2-i] = arr1[i];
		}
		
		for(int i=0; i<arr3.length; i++) {
			System.out.print(arr3[i] + " ");
		}
		
		System.out.println();
		
		//2. clone() 사용
		char[] arr4 = arr2.clone();
		for(int i=0; i<arr4.length; i++) {
			System.out.print(arr4[i] + " ");
		}
		

	}

}
