package funcinterface.object;

public class LambdaPersonTest {

	public static void main(String[] args) {

		//Person 객체 생성
		Person person = new Person();
		
		//추상 메서드 구현 -> 람다식
		person.action(() -> {
			System.out.println("출근을 합니다.");
			System.out.println("프로그래밍을 합니다.");
		});
		
		person.action(() -> System.out.println("퇴근을 합니다."));
		
	}

}
