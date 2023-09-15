package fruit;

//종류, 가격, 개수
public class FruitTest {

	public static void main(String[] args) {
		
		Fruit peach = new Fruit();
		
		peach.setName("복숭아");
		peach.setCount(2);
		peach.setPrice(1000);
		
		peach.showFruitInfo();

	}

}
