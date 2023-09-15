package hiding.accounts;

public class AccountTest {

	public static void main(String[] args) {
		//Account 인스턴스 생성
		Account account = new Account();
		
		//멤버에 직접 접근하지 못하도록 제한 (서비스할 때, 특히 더욱)
		//account.ano -> 접근 불가 (public -> private)
		//멤버 메서드에 접근 가능
		account.setAno("1111-11-1111111");
		account.setOwner("임예은");
		account.setBalance(10000);
	
		System.out.println("계좌번호 : " + account.getAno());
		System.out.println("계좌주 : " + account.getOwner());
		System.out.println("잔고 : " + account.getBalance() + "원");
	}

}
