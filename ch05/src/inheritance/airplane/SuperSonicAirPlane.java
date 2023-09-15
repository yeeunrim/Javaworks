package inheritance.airplane;

public class SuperSonicAirPlane extends AirPlane {
	
	//1 - 일반 비행, 2 - 초음속 비행
	//상수는 관례적으로 static을 붙여서 사용한다.
	//mode를 상수화 시켜서 표현 (숫자로 하면 알기 어렵기 때문)
	static final int NORMAL = 1; 
	static final int SUPERSONIC = 2;
	
	int flyMode = NORMAL;
	
	@Override //메서드 재정의 표시
	public void 비행하다() {
		if(flyMode == SUPERSONIC) {
			System.out.println("비행기가 초음속 비행합니다.");
		} else {
			super.비행하다(); //부모꺼와 같은 것을 사용할 때로 부모 메서드 상속한 것
		}
	}
	
}
