package stringmethod;

public class StringMethods2 {

	public static void main(String[] args) {
		//indexOd()	- 검색에 도움
		//문자열이 시작되는 인덱스를 리턴합니다.
		String str = "Hello World Hello";
		
		int value = str.indexOf("Hello"); //앞에서부터 찾음
		System.out.println(value); //0
		
		int value2 = str.lastIndexOf("Hello"); //뒤에서부터 찾음
		System.out.println(value2); //12
		
		int value3 = str.indexOf("ok"); //찾는 문자열이 없으면 -1을 리턴
		System.out.println(value3); //-1
		
		//조건문 만들기
		String subject = "자바 프로그래밍";
		
		if(subject.indexOf("자바") != -1) { //검색이 되었다는 뜻
			System.out.println("자바와 관련된 책이군요!");
		} else { //subject.indexOf("자바") == -1
			System.out.println("자바와 관련없는 책이군요!");
		}

	}

}
