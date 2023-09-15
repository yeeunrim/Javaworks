package inheritance.ex4;

public class Engineer extends Employee {

	//자녀 클래스에서 생성자를 매개변수를 지정한 것을 
	//부모 클래스의 super로 불러와야 한다.
	public Engineer (String name) {
		super(name);
	}
	
	private String skillset;
	
	//skillset - 입력 출력
	public void setSkillSet(String skillset) {
		this.skillset = skillset;
	}
	
	public String getSkillSet() {
		return skillset;
	}
	
}
