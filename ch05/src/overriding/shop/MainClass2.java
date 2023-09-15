package overriding.shop;

public class MainClass2 {

	public static void main(String[] args) {
		// 자동 형 변환
		HeadShop shop1 = new Shop1();
		
		shop1.비빔밥();
		
		System.out.println("==============");
		
		HeadShop shop2 = new Shop2();
		
		shop2.된장찌개();
		
		System.out.println();
		
		//에제 
		int iNum = 10;
		double dNum;
		
		dNum = iNum; //반대로 할 경우는 에러 --> iNum = int(dNum); 강제 형 변환 필요
		
		System.out.println(dNum);
	}

}
