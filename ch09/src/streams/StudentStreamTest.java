package streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StudentStreamTest {

	public static void main(String[] args) {
		
		List<Student> list = Arrays.asList(
			new Student("백설공주", 70),
			new Student("신데렐라", 55),
			new Student("인어공주", 90)
		);
		
		//학생의 이름, 점수 출력
		Stream<Student> stdStream = list.stream();
		stdStream.forEach(std -> {
			//System.out.println(std.getName() + " , " + std.getScore());
			String name = std.getName();
			int score = std.getScore();
			System.out.println(name + " , " + score);
		});
		
		System.out.println("===============");
		
		//학생의 이름만 출력
		//Stream 객체는 한번만 사용이 가능하기때문에 다시 한번 세팅
		//map() - 매개변수에 매핑(일치)되는 것을 구현할 때 쓰는 함수
		//학생 객체에 있는 이름만 출력한 것
		stdStream = list.stream();
		stdStream.map(std -> std.getName())
				 .forEach(std -> System.out.println(std));
		
		System.out.println("===============");
		
		//학생 점수에 해당되는 내용만 출력
		//정수인 경우 - mapToInt()을 사용
		stdStream = list.stream();
		stdStream.mapToInt(std -> std.getScore())
				 .forEach(n -> System.out.println(n));
		
		System.out.println("===============");
		
		//점수가 90점 이상인 학생의 이름 출력
		//filter() 함수 사용 - 조건에 일치되는 내용을 걸러낼 때 사용함
		list.stream().filter(std -> std.getScore() >= 90)
		             .map(std -> std.getName())
		             .forEach(s -> System.out.println(s));
		
	}

}
