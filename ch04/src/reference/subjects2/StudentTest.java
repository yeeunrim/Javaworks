package reference.subjects2;

public class StudentTest {

	public static void main(String[] args) {
		Student kim = new Student(101, "김대희");
		Student park = new Student(102, "박민국");
		
		//과목을 추가하는 메서드
		kim.addSubject("국어", 90);
		kim.addSubject("수학", 85);
		kim.addSubject("사회", 87);
		
		park.addSubject("코딩", 95);
		park.addSubject("Jave", 88);
		
		//출력
		kim.showStudentInfo();
		System.out.println();
		park.showStudentInfo();
	}

}
