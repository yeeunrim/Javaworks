package abstracts.shop;

public class Shop2 extends HeadShop{
	public Shop2() {
		System.out.println("역세권 매장입니다.");
	}

	@Override
	public void 된장찌개() {
		System.out.println("된장찌개의 가격은 7,000원입니다.");
		
	}

	@Override
	public void 김치찌개() {
		System.out.println("김치찌개의 가격은 8,500원입니다.");
	}

	@Override
	public void 비빔밥() {
		System.out.println("비빔밥의 가격은 8,000원입니다.");
		
	}
	
	
}
