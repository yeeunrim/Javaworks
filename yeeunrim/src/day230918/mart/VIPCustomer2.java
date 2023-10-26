package day230918.mart;

//고객 이름, 고객 등급, 고객 아이디, 고객 주소, 보너스 포인트
//보너스 적립율, 제품 할인율, 전문 상담원
public class VIPCustomer2 {
	//필드
	private String customerName;
	private String customerGrade;
	private String customerId;
	private String customerAddress;
	int bonusPoint;
	double bonusRatio;
	
	private String agentId;
	double saleRatio;
	
	//기본 생성자
	public VIPCustomer2() {
		customerGrade = "VIP";
		saleRatio = 0.1;
		bonusRatio = 0.05;
	}
	
	//포인트를 계산하는 메서드
	public int calcPrice(int price) {
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
						+ agentId;
	}
	
}
