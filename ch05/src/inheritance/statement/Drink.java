package inheritance.statement;

//부모 클래스
public class Drink {
	
	//필드
	//private : 같은 클래스 내에서 사용 가능
	//protected : 상속 받은 클래스들도 사용 가능
	protected String name; //이름
	protected int price; //가격
	protected int count; //수량
	
	//생성자 + 매개변수
	public Drink(String name, int price, int count) {
		this.name = name;
		this.price = price;
		this.count = count;
	}
	
	//함수 
	public int getTotalPrice() {
		//금액 = 상품가격 X 수량
		return price * count;
	}
	
	//출력
	public static void printTitle() { //제목행은 static 지정
		System.out.println("상품명\t가격\t수량\t금액");
	}
	
	//데이터 매칭
	public void printData() {
		System.out.printf("%s \t%,d\t%d\t%,d\n"
				, name, price, count, getTotalPrice());
	}
}
