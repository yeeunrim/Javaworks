package arraylist.score;

import java.util.ArrayList;

public class Student {
	private int studentId;
	private String studentName;
	private ArrayList<Subject> subjectList; //ArrayList - Subject 객체를 저장할 배열(리스트)
	//private ArrayList<Subject> subjectList = new ArrayList<>();
	
	public Student(int studentId, String studentName) {
		this.studentId = studentId;
		this.studentName = studentName;
		subjectList = new ArrayList<>();
	}
	
	//CRUD
	//데이터 생성(Create) - 과목 추가
	public void addSubject(String name, int score) {
		Subject subject = new Subject(name, score); //어레이리스트에 넣을 과목 생성 (매개변수 O)
		subjectList.add(subject); //어레이리스트에 저장함 (0번부터 저장)
	}
	
	//학생의 정보 출력
	public void shoeStudentInfo() {
		int total = 0; //총점 변수 (초기화)
		double avg;
		for(int i=0; i<subjectList.size(); i++) {
			Subject s = subjectList.get(i);
			total += s.getScorePoint(); //점수 합계 (누적)
			System.out.printf("학생 %s의 %s 과목 점수는 %d점입니다.\n",
					studentName, s.getSubjectName(), s.getScorePoint());
		}
		//평균 구하기
		
		avg = (double) (total) / subjectList.size();
		System.out.println("========================================");
		System.out.printf("%s님 모든 과목의 총점은 %d점이고, 평균은 %.1f점입니다."
				, studentName, total, avg);
		
	}
}
