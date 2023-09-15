package algorithm;

public class SortTest {

	public static void main(String[] args) {
		//오름차순 정렬 - 버블 정렬
		//예제 - 자리 바꾸기(위치) 
		//정렬 -> 2, 3, 4, 5, 6, 9
		
		int[] arr = {3, 6, 9, 2, 5, 4};
		int[] arr1 = {3, 6, 9, 2, 5, 4};
		int temp; //임시 변수 선언
		
		//오름차순
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr.length-1; j++) {
				if(arr[j] > arr[j+1]) {//자리바꿈
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		
		//내림차순
		for(int i=0; i<arr1.length; i++) {
			for(int k=0; k<arr1.length-1; k++) {
				if(arr1[k] < arr1[k+1]) {//자리바꿈
					temp = arr1[k];
					arr1[k] = arr1[k+1];
					arr1[k+1] = temp;
				}
			}
		}
		
		//arr 출력
		System.out.println("오름차순 정렬");
		
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		
		System.out.println();
		System.out.println();
		System.out.println("내림차순 정렬");
		
		for(int i=0; i<arr1.length; i++) {
			System.out.print(arr1[i] + " ");
		}

	}

}
