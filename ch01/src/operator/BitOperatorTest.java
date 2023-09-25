package operator;

public class BitOperatorTest {
	
	public static void main(String[] args) {
		
		//비트 논리 연산자
		int num1 = 5;  //0000 0101(2)
		int num2 = 10; //0000 1010(2)
					   //0000 0000(2) = 0(10)
					   //0000 1111(2) = 15(10)
		
		int result;
		
		//모두 1일 때 1이고, 나머지는 0
		result = num1 & num2; 
		System.out.println(result); //0
		
		//둘 중의 하나만 1이어도 1임
		result = num1 | num2;
		System.out.println(result); //15
		
		//비트 이동 연산자
		int a = 10;                 //0000 1010(2)
		System.out.println(a << 2); //0010 1000(2) = 40(10), 왼쪽으로 2비트 이동
		System.out.println(a >> 2); //0000 0010(2) = 2(10), 오른쪽으로 2비트 이동
		
	}

}
