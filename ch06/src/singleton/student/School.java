package singleton.student;

public class School {
	//필드
	private static School instance;
	
	//기본 생성자
	private School() {}
	
	//instance 생성 메서드
	public static School getInstance() {
		if(instance == null) {
			instance = new School();
		}
		return instance;
	}
	
	//student 생성 메서드
	public Student createStudent() {
		Student student = new Student();
		return student;
	}

}
