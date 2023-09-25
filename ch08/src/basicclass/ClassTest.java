package basicclass;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

public class ClassTest {

	public static void main(String[] args) throws ClassNotFoundException {
		
		//String 클래스의 정보 출력
		System.out.println("===== 클래스의 이름 가져오기 =====");
		
		Class<?> class1 = Class.forName("java.lang.String");
		System.out.println(class1.getName());
		
		System.out.println("\n===== 클래스의 필드(멤버변수) 출력하기 =====");
		
		Field[] fields = class1.getDeclaredFields();
		for(Field fieled : fields) {
			System.out.println(fieled);
		}
		
		System.out.println("\n===== 생성자 정보 가져오기 =====");
		
		Constructor<?>[] cons = class1.getConstructors();
		for(Constructor<?> con : cons) {
			System.out.println(con);
		}
	}

}