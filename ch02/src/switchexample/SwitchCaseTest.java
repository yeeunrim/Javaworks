package switchexample;

public class SwitchCaseTest {

	public static void main(String[] args) {
		// 랭킹에 따른 메달 출력
		// 1등 - 금메달, 2등 - 은메달, 3등 - 동메달
		// 변수 - 순위(rank)
		
		int rank = 1;
		
		switch(rank){
		case 1: //콜론으로 끝남(주의)
			System.out.println("금메달입니다.");
			break;
			
		case 2:
			System.out.println("은메달입니다.");
			break;
			
		case 3:
			System.out.println("동메달입니다.");
			break;
			default: //if문의 else같은 역할
				System.out.println("메달이 없습니다.");
		}
	}

}
