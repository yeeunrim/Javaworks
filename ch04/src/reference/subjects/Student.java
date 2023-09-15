package reference.subjects;

public class Student {
	//필드 
	int studentID; //학번
	String studentName; //학생 이름
	Subject korean; //국어 과목(참조)
	Subject math; //수학 과목(참조)
	
	//매개변수가 있는 생성자
	public Student(int studentID, String studentName) {
		this.studentID = studentID;
		this.studentName = studentName;
		korean = new Subject(); //korean 객체 생성
		math = new Subject(); //math 객체 생성
	}
	
	//국어 과목 추가 메서드 정의
	public void koreanSubject(String name, int score) {
		korean.setSubjectName(name);
		korean.setScorePoint(score);
	}
	
	//수학 과목 추가 메서드 정의
	public void mathSubject(String name, int score) {
		math.setSubjectName(name);
		math.setScorePoint(score);
	}
	
	//학생의 정보 출력
	public void showStudentInfo() {
		System.out.println(studentName + "의 " + korean.getSubjectName() 
			+ " 점수는 " + korean.getScorePoint() + "점 입니다.");
		System.out.println(studentName + "의 " + math.getSubjectName() 
		+ " 점수는 " + math.getScorePoint() + "점 입니다.");
	}
}
