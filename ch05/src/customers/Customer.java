package customers;

//상속을 위해서 접근 제어자는 protected 사용
//접근 제어자가 없으면 생략된 default로 지칭 - 패키지 내부에서만 접근 가능
public class Customer {
	
	protected int customerId; //고객 아이디
	protected String customerName; //고객 이름
	protected String customerGrade; //고객 등급
	int bonusPoint; //보너스 포인트
	double bonusRatio; //보너스 적립율
	
	public Customer() {
		customerGrade = "SILVER"; //기본 등급이 silver
		bonusRatio = 0.01;		  //기본 할인율이 1%
	}
	
	//생성자 + 매개변수
	public Customer(int customerId, String customerName) {
		this.customerId = customerId;
		this.customerName = customerName;
		customerGrade = "SILVER";
		bonusRatio = 0.01;	
	}
	
	//아이디, 이름 set/get 메서드
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	
	public int getCustomerId() {
		return customerId;
	}
	
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	
	public String getCustomerName() {
		return customerName;
	}
	
	//bonus point 계산
	public int calcPrice(int price) {
		bonusPoint += (int) (price * bonusRatio);
		return price;
	}
	
	//정보 출력 메서드
	public String showCustomerInfo() {
		return customerName + "님의 등급은 " + customerGrade + "이며, 보너스 포인트는 " 
				+ bonusPoint + "점입니다.";
	}
	
}
