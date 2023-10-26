package day230927.generics;

//x, y의 두 좌표가 정수일 수도 있고, 실수일 수도 있음
//그래서 T와 V라는 자료형 매개변수로 표현
public class Point <T, V> {

	//필드
	T x;
	V y;
	
	//생성자
	public Point(T x, V y) {
		this.x = x;
		this.y = y;
	}
	
	//getter
	public T getX() {
		return x;
	}
	
	public V getY() {
		return y;
	}
	
}
