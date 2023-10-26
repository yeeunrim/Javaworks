package example.student;

public class Student {
	//이름 학년 반
	//필드
	String studentName;
	int studentGrade;
	int studentClass;
	
	//기본 생성자
	public Student() {}
	
	//생성자 + 매개변수
	public Student(String studentName, int studentGrade, int studentClass) {
		this.studentName = studentName;
		this.studentGrade = studentGrade;
		this.studentClass = studentClass;
	}
	
	public String getStundentName() {
		return studentName;
	}
	
	public int getStundentGrade() {
		return studentGrade;
	}
	
	public int getStundentClass() {
		return studentClass;
	}
	
	//메서드
	public void showStudentImfo() {
		System.out.println(studentName + "은 " + studentGrade 
				+ "학년 " + studentClass + "반입니다.");
	}

	
}
