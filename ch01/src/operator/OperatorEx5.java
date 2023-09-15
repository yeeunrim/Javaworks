package operator;

public class OperatorEx5 {

	public static void main(String[] args) {
		// 1 증가, 감소 연산자(++, --)
		// 감소 연산자의 경우는 반복문에서 주로 사용
		
		int num = 10;
		//num = num + 1;
		//num += 1; 복합 대입 연산자
		num++; //1 증가 (주로 사용)
		System.out.println(num);
		
		
		int num2 = 20;
		//num2 = num2 - 1;
		//num2 -= 1; 복합 대입 연산자
		num2--;
		System.out.println(num2);
		
		//복합 대입 연산자
		int value = 100;
		System.out.println(value += 1); // value = 101
		System.out.println(value -= 1); // value = 100
		System.out.println(value *= 10); // 100 * 10 = 1000
		System.out.println(value /= 10); // 1000 / 10 = 100
		
	}

}
