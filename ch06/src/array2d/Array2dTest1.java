package array2d;

public class Array2dTest1 {

	public static void main(String[] args) {
		//정수형 2차원 배열
		int[][] arr = new int [2][3];
		
		System.out.println("행의 크기 : " + arr.length); //행의 크기
		System.out.println("열의 크기 : " + arr[0].length); //1열의 크기
		
		//전체 출력
		for(int i=0; i<arr.length; i++) {
			for(int j=i; j<arr[i].length; j++) {
				System.out.println(arr[i][j] + " ");
			}
			System.out.println();
		}
		
		//배열에 값을 저장
		arr[0][0] = 1;
		arr[0][1] = 2;
		arr[0][2] = 3;
		arr[1][0] = 4;
		arr[1][1] = 5;
		arr[1][2] = 6;

		int[][] arr2 = {
				{1,2,3} , {4,5,6}
		};
		
		//System.out.println(arr[1][1]);
		
		//전체 출력
		for(int i=0; i<arr2.length; i++) {
			for(int j=0; j<arr2[i].length; j++) {
				System.out.println(arr2[i][j] + " ");
			}
			System.out.println();
		}

	}

}
