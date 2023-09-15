package data;

public class ByteTypeTest {

	public static void main(String[] args) {
		// byte 관련 자료형
		// 정수 자료형 : byte, short, int, long
		
		// byte의 범위 = -128 ~ 127 (256개)
		byte bData1 = -128;
		System.out.println(bData1);
		
		byte bData2 = 127;
		System.out.println(bData2);
		
		/*byte bData3 = 128;
		System.out.println(bData3); - 범위를 초과함*/ 
		
		//short의 범위 = -32768 ~ 32767 (65536개)
		short sData3 = 128;
		System.out.println(sData3);
		
		System.out.println();
		
		//10진수, 2진수, 16진수 출력
		//객체의 이름과 주소
		ByteTypeTest test = new ByteTypeTest();
		
		System.out.println(test); 
		//data.ByteTypeTest@58ceff1 -> @의 뒤가 메모리 주소
		//0101 1000 1100 1110 1111 1111 0001(2) 
		//93122545(10)
		
		System.out.println();
		
		int num = 10; //10진수
		System.out.println(num);
		
		int bnum = 0b1010; //2진수를 표기할 때 접주어로 0b를 붙임
		System.out.println(bnum);
		
		int hnum = 0xA; //16진수를 표기할 때 접주어로 0x를 붙임
		System.out.println(hnum);
		
		System.out.println();
		
		//5(10)를 2진수로 표기 - 32bit
		int val1 = 0b00000000000000000000000000000101;
		System.out.println(val1);
		
		//-5(10)를 2진수로 표기 - 32bit
		int val2 = 0b11111111111111111111111111111011;
		System.out.println(val2);
		
	}

}
