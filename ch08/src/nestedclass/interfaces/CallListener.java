package nestedclass.interfaces;

//중첩 인터페이스 정의
public class CallListener implements Button.OnClickListener{

	//추상메서드 구현
	@Override
	public void onClick() {
		System.out.println("전화를 겁니다.");
	}
	
}
