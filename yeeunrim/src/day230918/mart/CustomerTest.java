package day230918.mart;

//일반 고객 : 1명 , VIP 고객 : 1명
//이순신, 10010, 현재 포인트 1000점
//김유신, 10020, 현재 포인트 10000점
public class CustomerTest {

	public static void main(String[] args) {
		Customer lee = new Customer("이유신", "10010", "구로");
		
		/*lee.customerName = "이순신";
		lee.bonusPoint = 1000;
		lee.customerId = "10010";
		lee.customerAddress = "당산"; */
		
		lee.bonusPoint = 1000;
		lee.calcPoint(10000);
		
		System.out.println(lee.showCustomerInfo());
		System.out.println(lee.customerName + "님이 지불해야 하는 금액은 " + lee.calcPoint(10000) + "원입니다.");
		
		
		System.out.println();
		
		VIPCustomer kim = new VIPCustomer("김유신", "10020", "구로", "abc123");
		
		kim.bonusPoint = 1000;
		kim.calcPoint(10000);
		
		System.out.println(kim.showVIPCustomerInfo());
		System.out.println(kim.customerName + "님이 지불해야 하는 금액은 " + kim.calcPoint(10000) + "원입니다.");

	}

}
