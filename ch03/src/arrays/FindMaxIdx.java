package arrays;

public class FindMaxIdx {

	public static void main(String[] args) {
		// 최대값의 위치 찾기
		// 최대값의 위치를 0번으로 설정
		int[] arr = new int[] {1, 5, 8, 3, 2, 100};
		int maxIdx = 0;
		
		for(int i=1; i<arr.length; i++) {
			//if문
			if(arr[maxIdx] < arr[i]) 
				maxIdx = i;
		}
		
		System.out.println("최대값의 위치: " + maxIdx);
		
	}

}
