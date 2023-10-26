package example.mart;

//고객 이름, 고객 등급, 고객 아이디, 고객 주소, 보너스 포인트, 보너스 적립율
public class Customer {
	//필드
	protected String customerName;
	protected String customerGrade;
	protected String customerId;
	protected String customerAddress;
	int bonusPoint;
	double bonusRatio;
	
	//기본 생성자
	public Customer() {
		customerGrade = "BASIC";
		bonusRatio = 0.01;
	}
	
	//포인트를 계산해주는 메서드 
	public int calcPoint(int price) {
		bonusPoint += (int) (price * bonusRatio);
		return price;
	}
	
	//getter,setter
	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerGrade() {
		return customerGrade;
	}

	public void setCustomerGrade(String customerGrade) {
		this.customerGrade = customerGrade;
	}

	public String getCustomerId() {
		return customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	public String getCustomerAddress() {
		return customerAddress;
	}

	public void setCustomerAddress(String customerAddress) {
		this.customerAddress = customerAddress;
	}
	
	//고객의 정보를 담는 메서드
	public String showCustomerInfo() {
		return customerName + "님의 등급 : " + customerGrade + "\t아이디 : " 
				+ customerId + "\t주소 : " + customerAddress 
					+ "\t보너스 포인트 : " + bonusPoint ;
	}

	
	
}
