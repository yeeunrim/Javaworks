package statics.student;

public class Student {
	//필드
	static int serialNum = 1000; //기준값 설정, 클래스 변수
	int id; //인스턴스 변수
	String name; //인스턴스 변수
	
	//인스턴스 변수 - id
	//아이디 - 입력 출력
	public void setId(int id) {
		this.id = id;
	}
	
	public int getId() {
		return id;
	}
}
