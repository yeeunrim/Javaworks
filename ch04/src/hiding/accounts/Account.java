package hiding.accounts;

//은행 통장 계좌 자료형 생성
//정보 은닉 및 캡슐화 - private 사용
public class Account {
	//필드
	private String ano; //계좌 번호
	private String owner; //계좌주
	private int balance; //잔고
	
	//데이터 입력 및 저장 방법
	//1. 기본 생성자
	public Account() {}
	
	    //get(), set() 메서드 생성
		//만드는 방법 : set,get + 필드이름() - 필드이름은 첫 글자 대문자
		public void setAno(String a) { //매개변수로 계좌번호 전달
			ano = a;
		} //입력
		public String getAno() {
			return ano;
		} //출력
		
		public void setOwner(String o) { //매개변수로 계좌주 전달
			owner = o;
		} //입력
		public String getOwner() {
			return owner;
		} //출력
		
		public void setBalance(int b) { //매개변수로 잔고 전달
			balance = b;
		} //입력
		public int getBalance() {
			return balance;
		} //출력


	//2. 매개변수 있는 사용자
	public Account(String ano, String owner, int balance) {
		//변수를 같게 통일하고 멤버 변수만 this.을 추가 - java
		//변수를 같게 통일하고 멤버 변수만 self.을 추가 - python
		this.ano = ano; 
		this.owner = owner;
		this.balance = balance;
	}
	
	
}
