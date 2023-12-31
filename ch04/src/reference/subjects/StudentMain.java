package reference.subjects;

public class StudentMain {

	public static void main(String[] args) {
		/*
		Student std1 = new Student(202221341, "홍길동");
		Student std2 = new Student(201821341, "임예은");
		
		//첫 번째 학생
		//과목 추가
		std1.koreanSubject("국어", 90);
		std1.mathSubject("수학", 83);
		
		//학생 정보 츌력
		std1.showStudentInfo();
		
		System.out.println();
		
		//두 번째 학생
		std2.koreanSubject("국어", 78);
		std2.mathSubject("수학", 93);
		
		std2.showStudentInfo();
		*/
		
		//객체 배열
		Student[] students = {
				new Student(202221341, "홍길동"),
				new Student(201821341, "임예은"),
				new Student(202021341, "우영우")				
		};
		
		students[0].koreanSubject("국어", 90);
		students[0].mathSubject("수학", 85);
		
		students[1].koreanSubject("국어", 70);
		students[1].mathSubject("수학",88);
		
		students[2].koreanSubject("국어", 84);
		students[2].mathSubject("수학", 67);
		
		for(int i=0; i<students.length; i++) {
			students[i].showStudentInfo();
		}
		
		System.out.println();
		
		//향상 for문
		for(Student student : students) {
			student.showStudentInfo();
		}
	}
}
