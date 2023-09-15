package statics.card;

public class Card {
	//필드
	private static int serialNum = 10000; //클래스 변수
	private int cardNumber; //인스턴스 변수
	
	//생성자
	public Card() { //카드 번호가 생성할 때마다 1증가
		serialNum++;
		cardNumber = serialNum; 
	}
	
	//get()함수
	public int getCardNumber() {
		return cardNumber;
	}
}
