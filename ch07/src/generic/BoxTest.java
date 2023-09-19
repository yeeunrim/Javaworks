package generic;

public class BoxTest {

	public static void main(String[] args) {
		//문자형 타입으로 객체 생성
		Box<String> box1 = new Box<>();
		
		box1.set("행운을 빌어요 !");
		String msg = box1.get();
		System.out.println(msg);
		
		//숫자형 타입으로 객체 생성
		Box<Integer> box2 = new Box<>();
		
		box2.set(300);
		Integer num = box2.get();
		System.out.println(num);
		
		//Fruit 타입으로 객체 생성
		Box<Fruit> box3 = new Box<>();
		
		//Fruit apple = new Fruit("사과");
		//box3.set(apple);
		box3.set(new Fruit("사과"));
		Fruit fruit = box3.get();
		System.out.println(fruit);

	}

}
