package constant;

public class UsingDefine {

	public static void main(String[] args) {
		
		//Static이 있는 상수는 클래스 이름으로 직접 접근
		System.out.println("최대값은 " + Define.MAX);
		System.out.println("최소값은 " + Define.MIN);
		
		System.out.println("수학 과목 코드 값은 " + Define.MATH + "입니다.");
		System.out.println("영어 과목 코드 값은 " + Define.ENG + "입니다.");
		
		System.out.println("원주율은 " + Define.PI + "입니다.");
		System.out.println("원주율은 " + Math.PI + "입니다."); //정밀한 값
		
		System.out.println(Define.GOOD_MORNING);
		
	}

}
