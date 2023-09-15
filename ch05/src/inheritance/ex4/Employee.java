package inheritance.ex4;

public class Employee {
	public String name;
	public String grade;
	public Employee(String name) {
		this.name = name;
	}
	
	//예제에서 내가 추가한 부분
	public void setGrade(String grade) {
		this.grade = grade;
	}
	
	public String getGrade() {
		return grade;
	}
	
	public String getName() {
		return name;
	}

}
