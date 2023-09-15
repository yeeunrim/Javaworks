package forexample;

public class EveryGugudanTest {

	public static void main(String[] args) {
		// 전체 구구단
		
		for(int i=2; i<10; i++) {
			System.out.println("--- " + i + "단 ---");
			
			for(int j=1; j<=i; j++) {
				int timeTable = i * j;
				System.out.println(i + " X " + j + " = " + timeTable);
			}
			
			System.out.println();
		}
	}

}
