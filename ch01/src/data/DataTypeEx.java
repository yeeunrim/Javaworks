package data;

public class DataTypeEx {

	public static void main(String[] args) {
		// int, long의 사용
		// int형 크기 - 4Byte(32bit), -21억 ~ 21억까지 표현 가능
		// long형 크기 - 8Byte(64bit)

		int num1 = 1234567890; //12억
		long num2 = 12345678900L; //숫자 뒤에 'L' 또는 'l'을 붙여야 함
		
		System.out.println(num1);
		System.out.println(num2);
		
	}

}
