package array2d;

public class ArrayAlphabet1 {

	public static void main(String[] args) {
		// 대문자 26자를 배열에 저장
		// for문 출력
		/*char c = 'A'; 
		System.out.println(c); //A
		System.out.println((int)(c)); //65
		
		char c2 = 66;
		System.out.println(c2); //B */
		
		System.out.println("== 알파벳 대문자 일반 for문 출력 ==");
		char c;
		for(c=65; c<91; c++) {
			System.out.print(c + " ");
		}
		
		System.out.println("\n변수의 마지막 값 : " + (char)(c-1));
		
		System.out.println("\n== 알파벳을 배열에 저장하고 출력 ==");
		char[] alphabets = new char[26];
		char ch = 'A';
		
		//alphabets[0] = ch; //A
		
		//자바에서 덧셈연산을 하면 int형으로 바꿈
		//1.
		//alphabets[1] = (char) (ch + 1); //B
		
		//2.
		//ch++;
		//alphabets[1] = ch; //B
		
		//알파벳을 배열에 저장
		for(int i=0; i<alphabets.length; i++) {
			alphabets[i] = ch;
			ch++;
		}
		
		//알파벳 출력
		for(int i=0; i<alphabets.length; i++) {
			System.out.print(alphabets[i] + " ");
		}

	}

}
