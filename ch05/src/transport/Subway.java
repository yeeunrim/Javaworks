package transport;

public class Subway {
	//필드
	String lineNumber; //지하철 호선
	int passenger; //승객
	int money; //가진 돈
	
	//생성자 + 매개변수
	public Subway(String lineNumber) {
		this.lineNumber = lineNumber;
	}
	
	//메서드 - 승객을 태움
	public void take(int fee) {//요금을 받음
		this.money += fee; //요금은 더해서 수입이 증가
		passenger++; //승객 수 1명 증가
	}
	
	//지하철의 정보
	public void showSubwayInfo() {
		System.out.printf("%s 지하철의 수입은 %,d원이고, 승객의 수는 %d명입니다.\n"
				, lineNumber, money, passenger);
	}
	
	
}
