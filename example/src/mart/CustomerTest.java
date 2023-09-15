package mart;

//일반 고객 : 1명 , VIP 고객 : 1명
//이순신, 10010, 현재 포인트 1000점
//김유신, 10020, 현재 포인트 10000점
public class CustomerTest {

	public static void main(String[] args) {
		Customer lee = new Customer();
		lee.customerName = "이순신";
		lee.bonusPoint = 1000;
		lee.customerId = "10010";
		lee.customerAddress = "당산";
		
		System.out.println(lee.showCustomerInfo());
		
		System.out.println();
		
		VIPCustomer kim = new VIPCustomer();
		kim.customerName = "김유신";
		kim.bonusPoint = 10000;
		kim.customerId = "10020";
		kim.customerAddress = "구로";
		
		System.out.println(kim.showVIPCustomerInfo());

	}

}
