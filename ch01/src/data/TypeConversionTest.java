package data;

public class TypeConversionTest {

	public static void main(String[] args) {
		/* 형 변환의 종류 (left = right)
		1. 자동 형 변환 : 왼쪽의 자료형이 크고, 오른쪽의 자료형이 작은 경우
		2. 강제 형 변환 : 왼쪽의 자료형이 작고, 오른쪽의 자료형이 큰 경우 */

		//자동 형 변환
		int iNum = 20;
		float fNum = iNum; 
		//실수형(4Byte) = 정수형(4Byte) (실수형 > 자동형)
		
		System.out.println(iNum); //20
		System.out.println(fNum); //20.0
		
		double dNum; //실수형 8Byte
		dNum = iNum + fNum; //자동 형 변환(묵시적 형 변환)
		
		System.out.println(dNum); //40.0
		
		//강제 형 변환(cast)
		double dNum1 = 1.2;
		float fNum2 = 0.9F;
		
		int iNum2 = (int)dNum1 + (int)fNum2; //1 + 0
		int iNum3 = (int)(dNum1 + fNum2); //1.2 + 0.9 = (int)2.1
		
		System.out.println(iNum2); //1
		System.out.println(iNum3); //2
		
	}

}
