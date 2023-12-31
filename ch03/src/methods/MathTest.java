package methods;

public class MathTest {

	public static void main(String[] args) {
		//내장 함수 - 수학(Math)
		
		//절대값(거리)
		int v1 = Math.abs(-10); 
		System.out.println("절대값은 " + v1 + "이다.");
		
		//반올림값
		long v2 = Math.round(5.67);
		System.out.println("반올림한 뒤 최종값은 " + v2 + "이다.");
		
		//버림값
		double v3 = Math.floor(3.14);
		System.out.println("버리고 난 뒤 최종값은 " + v3 + "이다.");
		
		//무작위수
		double rand = Math.random();
		System.out.println("무작위로 뽑힌 수는 " + rand + "이다.");
		
		//무작위수 응용 - 주사위
		int dice = (int) (Math.random()*6) + 1;
		System.out.println("무작위로 뽑힌 주사위 수는 " + dice + "이다.");
		
		//무작위수 응용 - 1 ~ 10 자연수 무작위 출력
		int number = (int) (Math.random()*10) + 1;
		System.out.println("무작위로 뽑힌 수는 " + number + "이다.");

		
	}

}
