package statics.student;

public class StudentTest {

	public static void main(String[] args) {
		//1.인스턴스 객체 변수 (static이 없을 경우)
		Student s1 = new Student(); //new를 사용
		s1.setId(101);
		System.out.println("학번 : " + s1.getId());
		
		//2.클래스 객체 변수 (static이 붙어 있는 경우)
		//클래스 객체 변수 : 클래스 이름으로 직접 접근 (new 하지 않음)
		//값이 공유되고 누적되며 프로그램이 종료되어야지 소멸
		Student.serialNum++;
		System.out.println(Student.serialNum);
		
		Student.serialNum++;
		System.out.println(Student.serialNum);
		
	}

}
