package collection.queue;

import java.util.LinkedList;
import java.util.List;

public class LinkedListTest {

	public static void main(String[] args) {
		
		List<String> myList = new LinkedList<>();
		
		//자료추가
		myList.add("A");
		myList.add("B");
		myList.add("C");
		
		//객체 출력
		System.out.println(myList);
		
		System.out.println("==========");
		
		//특정 위치에 자료 추가
		myList.add(2, "D");
		System.out.println(myList);
		
		System.out.println("==========");
		
		//전체 요소 출력
		for(String list : myList) {
			System.out.print(list + " ");
		}

	}

}
