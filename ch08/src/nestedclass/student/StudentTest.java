package nestedclass.student;

//중첩 클래스는 클래스간 밀접한 관계가 있거나,
//다른 클래스와 협력할 일이 없는 경우에 사용
class Student{
	
	String name;
	
	public Student(String name) {
		this.name = name;

	}
	
	//중첩 클래스(내부 클래스)
	class Score{
		
		int eng;
		int math;
		
		void showInfo() {
			System.out.println("이름 : " + name);
			System.out.println("영어 점수 : " + eng);
			System.out.println("수학 점수 : " + math);
		}
		
	}
	
}

public class StudentTest {

	public static void main(String[] args) {
		
		//외부 클래스의 객체(인스턴스) 생성
		Student rim = new Student("임예은");
		
		//내부 클래스의 인스턴스 생성
		//외부 클래스.내부 클래스 인스턴스 = 내부 인스턴스.new 내부클래스();
		Student.Score score = rim.new Score();
		
		score.eng = 88;
		score.math = 73;
		score.showInfo();
		
	}

}
