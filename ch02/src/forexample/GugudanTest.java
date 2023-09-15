package forexample;

public class GugudanTest {

	public static void main(String[] args) {
		// 단일 for문
		/* 
		  3 * 1 = 3 
		  3 * 2 = 6
		  3 * 3 = 9 
		  3 * 4 = 12 
		  3 * 5 = 15
		  3 * 6 = 18
		  3 * 7 = 21
		  3 * 8 = 24
		  3 * 9 = 27
		 */
		
		int i = 0;
		int dan = 4;
		
		for(i=1; i<10; i++) {
			int timeTable = dan * i;
			System.out.println(dan + " X " + i + " = " + timeTable);
		}

	}

}
