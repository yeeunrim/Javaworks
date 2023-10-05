package generics;

public class Powder extends Material{

	@Override
	public void doPrinting() {
		System.out.println("powder 재료로 출력합니다.");
	}

	public String toString() {
		return "재료는 powder입니다.";
	}
	
}
