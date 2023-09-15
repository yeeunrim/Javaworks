package inheritance.airplane;

//부모 클래스
public class AirPlane {
	
	//기본 생성자
	public AirPlane() {}
	
	public void 이륙하다() {
		System.out.println("비행기가 이륙합니다.");
	}
	
	public void 비행하다() {
		System.out.println("비행기가 일반 비행합니다.");
	}
	
	public void 착륙하다() {
		System.out.println("비행기가 착륙합니다.");
	}
}
