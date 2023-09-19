package stringmethod;

public class StringBuilderTest {

	public static void main(String[] args) {
		
		//StringBuilder, StringBuffer - 문자열 변경이 가능한 클래스 (메모리 주소 변경되지 않고 유지)
		String javaStr = new String("java");
		
		System.out.println("----- 연산 전 -----");
		
		StringBuilder buffer = new StringBuilder(javaStr);
		System.out.println(buffer);
		System.out.println("연산 전 buffer의 메모리 주소 : " 
				+ System.identityHashCode(buffer));
		
		System.out.println("----- 연산 후 -----");
		
		//문자열 추가
		buffer.append(" and");
		buffer.append(" android");
		buffer.append(" programming is fun!!");
		
		System.out.println(buffer);
		System.out.println("연산 후 buffer의 메모리 주소 : " 
				+ System.identityHashCode(buffer));

	}

}
