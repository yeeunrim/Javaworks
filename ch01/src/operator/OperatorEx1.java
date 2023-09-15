package operator;

public class OperatorEx1 {

	public static void main(String[] args) {
		// 산술 연산자
		// 연산은 기본적으로 int형으로 계산
		// 나눗셈 같은 경우는 더 큰 자료형으로 변환 (정수<실수)
		// 그러면 더 큰 자료형으로 인식해서 계산
		
		// 자바의 기본형은 int, double
		
		System.out.println(4 + 8); //12
		System.out.println(4 - 8); //-4
		System.out.println(4 / (double)8); //0.5
		System.out.println(4 * 8); //32
		
		System.out.println("");
		
		// 산술 연산자 (변수 사용)
		
		int A = 4;
		int B = 8;
		
		System.out.println(A + B);
		System.out.println(A - B);
		System.out.println(A / (double)B);
		System.out.println(A * B);
		
		System.out.println("");
		
		// 나머지(%) 계산
				// 홀수, 짝수 구별할 때 유리
				System.out.println(8 % 5); //3
				System.out.println(5 % 2); //1(홀수)
				System.out.println(4 % 2); //0(짝수)
				
				System.out.println("");
						
		//점수의 합계, 평균 구하기
		
		int korScore = 95, mathScore = 80;
		
		int sumScore;
		double avgScore;
		
		sumScore = korScore + mathScore; //합계 계산
		avgScore = (double)sumScore / 2; //평균 계산
		
		System.out.println("총점 : " + sumScore);
		System.out.println("평균 : " + avgScore);
		
	}

}
