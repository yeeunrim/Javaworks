package funcinterface.lambdaint;

public class MyNumber2Test {

	public static void main(String[] args) {
		

		MyNumber2 myNum;
		
		//getMax() 구현
		//myNum = (x, y) -> {
		//	return (x >= y) ? x : y;
		//};
		
		//return 생략
		myNum = (x, y) -> (x >= y) ? x : y;
		
		System.out.println("더 큰 수 : " + myNum.getMax(10, 20));

	}

}
