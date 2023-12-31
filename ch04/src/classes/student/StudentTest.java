package classes.student;

public class StudentTest {

	public static void main(String[] args) {
		//Student 객체(변수) 생성
		//new를 할 시, 메모리 영역(heap 영역 사용) -> 출력이 가능하다는 뜻
		//점 연산자로 접근한다. //무한 생성이 가능하다.
		//Student : 클래스 , student1 : 객체, 인스턴스로 지칭
		Student student1 = new Student();
		student1.name = "임예은";
		student1.studentID = 201821341;
		student1.grade = 4;
		student1.showStudentInfo();
		
		/*
		 * System.out.println("이름 : " + student1.name);
		System.out.println("학번 : " + student1.studentID);
		System.out.println("학년 : " + student1.grade +"학년"); 
		*/
		
		System.out.println();
		
		Student student2 = new Student();
		student2.name = "홍길동";
		student2.studentID = 202221341;
		student2.grade = 2;
		
		System.out.println("이름 : " + student2.name);
		System.out.println("학번 : " + student2.studentID);
		System.out.println("학년 : " + student2.grade +"학년");

	}

}
