package bufferedstream;

import java.util.Arrays;

public class StreamMethodTest {
	
	public static void main(String[] args) {
		
		String subject = "자바 프로그래밍 입문";
		
		System.out.println(subject.charAt(3)); //프
		System.out.println(subject.indexOf("프")); //3
				
		//split() 사용 - 구분 기호(쉼표, 공백, :)
		String[] word = subject.split(" ");
		System.out.println(Arrays.toString(word));
		
		System.out.println(word[0]);
		System.out.println(word[1]);
		
		//전화 번호
		String phone = "010-4089-2878";
		String[] number = phone.split("-");
		System.out.println(Arrays.toString(number));
		
		System.out.println(number[0]);
		System.out.println(number[1]);
		
	}

}
