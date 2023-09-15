package data;

public class FloatDoubleType {

	public static void main(String[] args) {
		// 실수 자료형 - 정밀도의 차이가 존재
		//숫자 뒤에 'f','F' 둘 다 상관없음
		float fNum = 1.23456789F; //소수섬이하 6자리까지 출력
		double dNum = 1.23456789012345678; //소수점이하 16자리까지 출력
		
		System.out.println(fNum);
		System.out.println(dNum);
		
	}

}
