package inheritance.transport;

public class Main {

	public static void main(String[] args) {
		//Person 객체 생성
		Person lee = new Person("이나경", 10000);
		Person seo = new Person("서지훈", 20000);
		Person rim = new Person("임예은", 30000);
		
		//Bus 객체 생성
		Bus bus100 = new Bus("100번 버스");
		
		//Taxi 객체 생성
		Taxi kakaoTaxi = new Taxi("카카오택시");
		
		lee.take(bus100, 1500);
		seo.take(bus100, 1500);
		rim.take(kakaoTaxi, 4800);
		
		System.out.println("====== 승객 정보 ======");
		
		lee.showPersonInfo();
		seo.showPersonInfo();
		rim.showPersonInfo();
		
		System.out.println("====== 교통수단 정보 ======");
		
		bus100.showInfo();
		kakaoTaxi.showInfo();
		

	}

}
