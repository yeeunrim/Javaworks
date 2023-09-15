package inheritance.ex4;

public class Main {

	public static void main(String[] args) {
		Engineer rim = new Engineer("임예은");
		rim.setGrade("4학년");
		rim.setSkillSet("자바 활용 능력");
		
		System.out.println("이름 : " + rim.getName());
		System.out.println("학년 : " + rim.getGrade());
		System.out.println("스킬 : " + rim.getSkillSet());
	}

}
