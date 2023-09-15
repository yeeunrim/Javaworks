package customers;

public class CustomerTest2 {

	public static void main(String[] args) {
		//부모형으로 객체 생성 - 자동 형 변환
		Customer lee = new Customer(1001,"이순신");
		
		int cost = lee.calcPrice(10000);
		
		System.out.println(lee.getCustomerName() + "님이 지불한 비용은 " + cost + "원입니다.");
		System.out.println(lee.showCustomerInfo());
		
		System.out.println("----------------------------------------------");
		
		//부모형으로 객체 생성 - 자동 형 변환
		Customer woo = new VIPCustomer(1002,"우영우",7777);
		
		int cost2 = woo.calcPrice(20000);
		
		System.out.println(woo.getCustomerName() + "님이 지불한 비용은 " + cost2 + "원입니다.");
		System.out.println(woo.showCustomerInfo());

	}

}
