package forexample;

public class ForEx2 {

	public static void main(String[] args) {
		// 1부터 10까지 더하기
		// 변수 - i, total
		
		int i = 0;
		int total = 0;
		
		System.out.print("계산과정 : ");
		
		for(i=1; i<=10; i++) {
			total += i;
			System.out.print(total + " ");
		}
		
		System.out.println("");
		System.out.println("최종 합계는 " + total + "입니다.");
	
		
	}

}
