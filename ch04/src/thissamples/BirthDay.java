package thissamples;

public class BirthDay {
	int day;
	int month;
	int year;
	
	public void setyear(int year) {
		this.year = year;
	}
	
	//this를 출력하는 메서드 정의
	public void printThis() {
		System.out.println(this); //this가 객체의 주소를 담고 있다.
	}
}
