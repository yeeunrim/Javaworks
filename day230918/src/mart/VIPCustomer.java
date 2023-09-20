package mart;

//고객 이름, 고객 등급, 고객 아이디, 고객 주소, 보너스 포인트
//보너스 적립율, 제품 할인율, 전문 상담원
public class VIPCustomer extends Customer{
	//필드
	private String agentId;
	double saleRatio;
	
	//기본 생성자 -> 매개변수가 있는 생성
	public VIPCustomer(String customerName, String customerId, String customerAddress, String agentId) {
		super(customerName, customerId, customerAddress); //super 불러올 때도 순서대로 써줘야 
		customerGrade = "VIP";
		saleRatio = 0.1; //10%
		bonusRatio = 0.05; //5%
		this.agentId = agentId;
	}
	
	//포인트를 계산하는 메서드
	@Override
	public int calcPoint(int price) {
		bonusPoint += price * bonusRatio;
		return price - (int) (price * saleRatio); //할인율 적용
	}

	//전문 상담원 정보를 출력할 수 있는 메서드
	public String getAgentId() {
		return agentId;
	}
	
	//정보를 출력하는 메서드
	public String showVIPCustomerInfo() {
		return customerName + "님의 등급 : " + customerGrade + "\t아이디 : " 
				+ customerId + "\t주소 : " + customerAddress 
					+ "\t보너스 포인트 : " + bonusPoint + "\t전문 상담원 : "
						+ agentId ;
	}
	
}
