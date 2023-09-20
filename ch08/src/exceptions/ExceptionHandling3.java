package exceptions;

public class ExceptionHandling3 {

	public static void main(String[] args) {
		
		//일반예외 - 컴파일 오류(컴파일러 체크) 
		//try~catch구문, try~catch~finally구문(프로그램이 항상 수행해야 할 경우가 있을  사용)
		try {
			//클래스 이름을 잘못 기록하면 에러 발생
			Class.forName("java.lang.Math2");
			System.out.println("찾는 클래스가 있습니다.");
		} catch (ClassNotFoundException e) {
			System.out.println("클래스를 찾을 수 없습니다.");
			e.printStackTrace();
		} finally {
			System.out.println("항상 수행됨");
		}
		
	}

}
