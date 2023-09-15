package inheritance.person;

//Engineer(자녀)가 Person(부모)을 상속 받음
public class Engineer extends Person{
	int companyId;
	
	//부모의 생성자에 매개변수가 있을 경우에는 super()키워드를 이용해 부모꺼를 전부 써준다.
	public Engineer(String name, int age, int companyId) {
		super(name, age); //부모 클래스
		this.companyId = companyId; //자녀 클래스의 필드 초기화
	}
	
	public int getCompanyId() {
		return companyId;
	}
}
