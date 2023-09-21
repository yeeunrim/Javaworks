package exceptions.throwex;

public class ThrowsTest {

	public static void main(String[] args) {
		
		//호출한 곳에서 예외 처리함
		try {
			findClass();
		}catch(ClassNotFoundException e) {
            //se.printStackTrace();
			System.out.println(e.toString());
		}
		
	}

	public static void findClass() throws ClassNotFoundException {
		//컴파일러가 체크해줌 - 일반 예외
		//throws는 예외 미룸
		Class.forName("java.lang.System2");
	}
	
}
