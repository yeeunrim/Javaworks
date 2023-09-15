package forexample;

public class NestedFor1 {

	public static void main(String[] args) {
		// 중첩 for문
		// 5행 5열에 '*' 출력
	
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=5; j++) {
				System.out.print('*' + " ");
			}
			
			System.out.println();
		}
		
		System.out.println();
		
		//행의 변화는 없고, 열이 행 증가할 때마다 1씩 증가
		for(int i1=1; i1<=5; i1++) {
			for(int j1=1; j1<=i1; j1++) {
				System.out.print('*' + " ");
			}
			
			System.out.println();
		}
		
		System.out.println();
			
		//행의 변화는 없고, 열이 행 증가할 때마다 1씩 감소
		for(int i2=1; i2<=5; i2++) {
			for(int j2=1; j2<=6-i2; j2++) {
				System.out.print('*' + " ");
			}
			
			System.out.println();
			
		}
		
		System.out.println();
		
		for(int i3=1; i3<=5; i3++) {
			for(int j3=5; j3>=i3; j3--) {
				System.out.print('*' + " ");
				//System.out.println("i= " + i3 +", " + "j= "+ j3);
			}
			
			System.out.println();
			
		}

	}

}
