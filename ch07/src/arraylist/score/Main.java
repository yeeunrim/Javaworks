package arraylist.score;

public class Main {

	public static void main(String[] args) {
		//Student 객체 생성
		Student rim = new Student(101,"임예은");
		
		rim.addSubject("국어", 80);
		rim.addSubject("수학", 90);
		rim.addSubject("사회", 75);
		rim.shoeStudentInfo();
		

	}

}
