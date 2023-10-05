package strings;

public class StringArray {
	
	public static void main(String[] args) {
		
		int[] num = new int[10];
		
		for(int i=0; i<num.length; i++) {
			num[i] = (int) (Math.random() * 45) + 1;
			
			for(int j=0; j<i; j++) {
				if(num[i] == num[j]) {
					i--;
				}
			}
		}
		
		for(int i=0; i<num.length; i++) {
			System.out.print(num[i] + " ");
		}
		
	}

}
