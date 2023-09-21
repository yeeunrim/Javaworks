package generic;

public class ProductTest {

	public static void main(String[] args) {
		
		//Product 객체 생성
		Product<TV, String> product1 = new Product<>();
		
		//TV 인스턴스 생성
		TV tv = new TV();
		
		product1.setKind(tv);
		product1.setModel("스마트TV");
		
		tv.making();
		System.out.println("모델명 : " + product1.getModel());
		
		System.out.println("======================");
		
		//Product 객체 생성
		Product<Car, String> product2 = new Product<>();
		
		//Car 인스턴스 생성
		Car car = new Car();
		
		product2.setKind(car);
		product2.setModel("전기차");
		
		car.making();
		System.out.println("모델명 : " + product2.getModel());
		
	}

}
