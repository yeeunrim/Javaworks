package operator;

public class OperatorEx4 {

	public static void main(String[] args) {
		// 논리 연산자
		
		// && - 엠퍼샌드 : 두 항이 모두 참인 경우에만 결과값이 참
		System.out.println((4 < 5) && (10 == 11)); //False
		
		// || - bar : 두 항 중 하나만 참일 경우 결과값이 참
		System.out.println((4 < 5) || (10 == 11)); //True
		// 위와 같이 앞의 부분에서 결과를 이미 알 수 있을 때를 단락회로라고 지칭
		
		//! - 부정 : 항이 참이면 거짓, 거짓이면 참
		System.out.println(!(10 == 11)); //True

	}

}
