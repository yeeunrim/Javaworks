package collection.carmap;

public class CarTest {

	public static void main(String[] args) {
		
		//싱글톤이므로 factory의 주소는 동일하다.
		CarFactory factory = CarFactory.getInstance();
		
		Car sonata1 = factory.createCar("예은 차");
		Car sonata2 = factory.createCar("예은 차");
		System.out.println(sonata1 == sonata2); //true
		
		Car avante1 = factory.createCar("나경 차");
		Car avante2 = factory.createCar("나경 차");
		System.out.println(avante1 == avante2); //true
		
		System.out.println(sonata1 == avante1); //false
		 
	}

}
