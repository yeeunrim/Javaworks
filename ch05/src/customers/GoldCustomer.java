package customers;

//고객 - GOLD 고객
public class GoldCustomer extends Customer{
	double saleRatio;
	
	public GoldCustomer() {
		customerGrade = "GOLD";
		saleRatio = 0.1; //10% 할인
		bonusRatio = 0.02; //2% 적립
	}
	
	public GoldCustomer(int customerId, String customerName) {
		super(customerId, customerName);
		customerGrade = "GOLD";
		saleRatio = 0.1;
		bonusRatio = 0.02;
	}

	@Override
	public int calcPrice(int price) {
		price -= (int)(price * saleRatio);
		bonusPoint += (int) (price * bonusRatio);
		return price;
	}
	

}
