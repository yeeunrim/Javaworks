package arrays;

public class FindMaxValue {

	public static void main(String[] args) {
		// 배열에서 최대값 찾기
		// 최대값(maxValue)을 설정 - 0번 인덱스로 그 후 다른 것들과 비교
		
		int[] array = new int[] {1, 5, 8, 3, 2};
		int maxValue = array[0];
		
		for(int i=1; i<array.length; i++) {
			if(maxValue < array[i]) {
				maxValue = array[i];
			} 
		}
		
		System.out.println("최대값은 " + maxValue + "이다.");
		
	}

}
