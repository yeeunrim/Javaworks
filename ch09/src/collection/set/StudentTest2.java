package collection.set;

import java.util.HashMap;
import java.util.Map;

public class StudentTest2 {

	public static void main(String[] args) {
		
		//HashMap 자료구조의 인스턴스 생성
		Map<String, Student> map = new HashMap<>();
		
		//학생 인스턴스 생성
		Student std1 = new Student("임예은", 101);
		Student std2 = new Student("이나경", 102);
		Student std3 = new Student("서지훈", 103);
		Student std4 = new Student("이나경", 102);
		
		//객체 추가
		map.put("임예은", std1);
		map.put("이나경", std2);
		map.put("서지훈", std3);
		map.put("이나경", std4);
		
		//map 객체 출력
		System.out.println(map);

	}

}
