package overriding.shop;

public class Shop2 extends HeadShop{
	
	public Shop2() {
		System.out.println("  <대학가 매장>   ");
	}

	@Override
	public void 된장찌개() {
		System.out.println("된장찌개 : 5,000원");
	}

	@Override
	public void 김치찌개() {
		System.out.println("김치찌개 : 5,500원");
	}

	@Override
	public void 비빔밥() {
		System.out.println("비빔밥 : 6,000원");
	}
	
	
}
