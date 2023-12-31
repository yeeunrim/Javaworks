package classes.student;

//참조(reference) 자료형 
public class Student {
	//클래스 내부에서는 변수를 필드(Field)라고 지칭
	
	String name; //학생이름 - "임예은"
	int studentID; //학번 - "201821341"
	int grade; //학년 
	
	//생성자, 클래스, 함수(메서드)
	//함수가 아니기 때문에 반환이 없다.
	//클래스 이름과 같다.
	//기본 생성자(매개변수 없는 생성자)는 생략할 수 있다.(컴파일러가 자동 생성됨)
	public Student() {} //기본 생성자
	
	//학생의 정보를 출력하는 메서드(함수) -> main의 함수가 줄어들 수 있다.
	//public = 접근 제어자, void = 반환 값이 없는 경우
	public void showStudentInfo() {
		System.out.println("이름 : " + name + ", 학번 : " + studentID 
				+ ", 학년 : "+ grade + "학년");
	}
	
}
