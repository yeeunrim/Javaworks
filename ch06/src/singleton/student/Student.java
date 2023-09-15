package singleton.student;

//학번(studentNum) 자동 생성
public class Student {
	
	//필드
	private static int SerialNum = 100; //기준 학번 설정
	private int studentNum;
	
	//생성자
	public Student() {
		SerialNum++;
		studentNum = SerialNum;
	}
	
	//학번 출력하는 메서드
	public int getStudentNum() {
		return studentNum;
	}

}
