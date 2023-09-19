package generic;

import java.util.ArrayList;

public class GenericTest {

	public static void main(String[] args) {
		//Generic (일반화) 이전의 코드 작성
		ArrayList cartlist = new ArrayList();
		
		cartlist.add("egg");
		cartlist.add("coffee");
		
		//다운캐스팅(강제 형 변환) 필요
		String item = (String) cartlist.get(0);
		System.out.println(item);
		
		//Generic을 이용한 코드 작성 - 자바 1.5 version 이후
		//제네릭 프로그래밍 - 어떤 값이 하나의 자료형이 아닌 여러 자료형을 사용할 수 있도록 
		//프로그램이 하는 것을 말함
		ArrayList<String> list = new ArrayList<>();
		
		list.add("egg");
		list.add("coffee");
		
		String item2 = list.get(0);
		System.out.println(item2);
		
	}

}
