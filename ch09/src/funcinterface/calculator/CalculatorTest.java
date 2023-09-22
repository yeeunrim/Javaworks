package funcinterface.calculator;

public class CalculatorTest {

	public static void main(String[] args) {
		
		//Calculator 변수 선언 - add
		Calculator add, sub, mul, div;
		int num1 = 10, num2 = 5;
		
		//calculator()를 구현 - 람다식
		//덧셈, 뺄셈, 나눗셈, 곱셈
		add = (n1, n2) -> n1 + n2;
		sub = (n1, n2) -> n1 - n2;
		mul = (n1, n2) -> n1 / n2;
		div = (n1, n2) -> n1 * n2;
		
		//calculator() 호출
		System.out.println("더하기 : " + add.calculator(num1, num2));
		System.out.println("빼기 : " + sub.calculator(num1, num2));
		System.out.println("나누기 : " + mul.calculator(num1, num2));
		System.out.println("곱하기 : " + div.calculator(num1, num2));
		
	}

}
