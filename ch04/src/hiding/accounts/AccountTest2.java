package hiding.accounts;

public class AccountTest2 {

	public static void main(String[] args) {
		//생성자를 통해서 계좌번호 입력
		Account account = 
				new Account("1111-11-1111111","임예은",10000);
		
		System.out.println("계좌번호 : " + account.getAno());
		System.out.println("계좌주 : " + account.getOwner());
		System.out.println("잔고 : " + account.getBalance() + "원");
	}
}
