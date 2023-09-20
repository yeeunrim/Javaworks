package constant.enums;

public class SeasonTest {

	public static void main(String[] args) {

		Season season;
		
		season = Season.여름; //초기화 세팅 필요
		
		switch(season) {
		case 봄 :
			season = Season.봄;
			break;	
		case 여름 :
			season = Season.여름;
			break;
		case 가을 :
			season = Season.가을;
			break;
		case 겨울 :
			season = Season.겨울;
			break;
			default:
				System.out.println("계절이 없습니다.");
				break;
		}
		
		System.out.println("현재 계절은 " + season + "입니다.");
		
	}

}
