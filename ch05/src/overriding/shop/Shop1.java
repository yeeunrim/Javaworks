package overriding.shop;

public class Shop1 extends HeadShop{
	
	public Shop1() {
		System.out.println("  <역세권 매장>   ");
	}

	@Override
	public void 된장찌개() {
		System.out.println("된장찌개 : 7,500원");
	}

	@Override
	public void 김치찌개() {
		System.out.println("김치찌개 : 8,000원");;
	}

	@Override
	public void 비빔밥() {
		System.out.println("비빔밥 : 8,500원");
	}
	
	
}
