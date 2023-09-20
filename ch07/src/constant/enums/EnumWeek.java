package constant.enums;

import java.util.Calendar;

public class EnumWeek {

	public static void main(String[] args) {
	
		Week today = null;
		
		Calendar cal = Calendar.getInstance();
		int week = cal.get(Calendar.DAY_OF_WEEK);
		//System.out.println(week);
		
		switch(week) {
		case 1 :
			today = Week.Sunday;
			break;
		case 2 :
			today = Week.Monday;
			break;
		case 3 :
			today = Week.Tuesday;
			break;
		case 4 :
			today = Week.Wednesday;
			break;
		case 5 :
			today = Week.Thursday;
			break;
		case 6 :
			today = Week.Friday;
			break;
		case 7 :
			today = Week.Saturday;
			break;
			default :
				System.out.println("요일이 없습니다.");
				break;
		}
		
		System.out.println("Today is " + today);
		
		if(today == Week.Sunday) {
			System.out.println("일요일에는 영화 보러 갑니다.");
		} else {
			System.out.println("열심히 코딩합니다.");
		}
		

	}

}
