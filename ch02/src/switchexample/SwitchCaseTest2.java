package switchexample;

public class SwitchCaseTest2 {

	public static void main(String[] args) {
		// 메달 색상에 따른 메달 출력
		// 변수 - medalColor
		// "Gold", "Silver", "Bronze"
		
		String medalColor = "Silver";
		
		switch(medalColor) {
		case "Gold":
			System.out.println("1등 입니다.");
			break;
			
		case "Silver":
			System.out.println("2등 입니다.");
			break;
			
		case "Bornze":
			System.out.println("3등 입니다.");
			break;
			default:
				System.out.println("순위권이 아닙니다.");
			
		}

	}

}
