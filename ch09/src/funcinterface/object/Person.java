package funcinterface.object;

public class Person {

	//인터페이스를 매개변수로 사용
	void action(Workable workable) {
		workable.work();
	}
	
}
