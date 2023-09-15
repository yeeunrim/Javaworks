package dates;

import java.util.Calendar;

public class CalendarTest2 {

	public static void main(String[] args) {

		Calendar cal = Calendar.getInstance();
		
		//지나온 시간 측정
		//1970. 1. 1 자정 이후부터 측정 - 밀리초로 계산
		//유닉스(서버) 시스템 소프트웨어 개시된 이후 -> 그 이후 리눅스(개인용) 등장
		// ps(-12승) > ns(-9승) > us(-6승) > ms(-3승) > s(0승)
		long pastTime = cal.getTimeInMillis();
		System.out.print(pastTime + "시\t");
		
		//일로 환산
		pastTime = pastTime / (24*60*60*1000);
		System.out.print(pastTime + "일\t");
		
		//년으로 환산
		pastTime = pastTime / 365;
		System.out.println(pastTime + "년\t");
		
		//기준일로부터 얼마나 흘렀는 지 계산 (시작일, 종료일 필요)
		Calendar startDay = Calendar.getInstance(); //시작일
		Calendar toDay = Calendar.getInstance(); //종료일
		
		startDay.set(2023, 9, 1); //시작일
		toDay.set(2023, 9, 15); //종료일
		
		//초로 계산
		long betweenTime = toDay.getTimeInMillis() - startDay.getTimeInMillis();
		
		//일로 환산
		betweenTime = betweenTime / (24*60*60*1000);
		System.out.println("기준일로부터 " + betweenTime + "일 지남");
		
		//현재까지의 시간 - java.lang에 있는 것 ! - ms
		System.out.println(System.currentTimeMillis());
		
		//현재까지의 시간 - ns
		System.out.println(System.nanoTime());
		

	}

}
