package singleton;

public class Company {
	//싱글톤 코딩 디자인 패턴 사용
	//멤버 변수가 객체 인스턴스
	//Static을 활용한 - new로 생성하지 않음
	//new하지 않을 떄는 클래스 이름으로 직접 접근
	
	//필드
	private static Company instance; //->멤버 변수
	
	//기본 생성자도 private을 사용
	private Company() {} 
	
	//getter, setter
	public static Company getInstance() {
		if(instance == null) {
			 //기본 생성자에서 private으로 막아놨기 때문에 필요
			instance = new Company();
		}
		return instance;
	}
	
}
