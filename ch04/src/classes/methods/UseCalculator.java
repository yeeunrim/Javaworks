package classes.methods;

import classes.Calculator;//다른 패키지에 있을 경우에는 import가 필요

public class UseCalculator {

	public static void main(String[] args) {
		// Calculator 객체 생성
		Calculator calc = new Calculator();
		int num1 = 20, num2 = 5;
		
		int addval = calc.add(num1, num2);
		int subval = calc.sub(num1, num2);
		int mulval = calc.mul(num1, num2);
		int divval = calc.div(num1, num2);
		
		System.out.println(calc);
		
		System.out.println("두 수의 합은 " + addval);
		System.out.println("두 수의 차는 " + subval);
		System.out.println("두 수의 곱은 " + mulval);
		System.out.println("두 수의 나누기 값은 " + divval);
	}

}
