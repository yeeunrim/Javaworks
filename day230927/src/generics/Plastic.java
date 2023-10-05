package generics;

public class Plastic extends Material{

	@Override
	public void doPrinting() {
		System.out.println("Plastic 재료로 출력합니다.");
	}

	public String toString() {
		return "재료는 plastic입니다.";
	}
	
}
