package dates;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class LacalDateTimeTest {

	public static void main(String[] args) {
		
		//LocalDateTime 클래스 사용
		LocalDateTime now = LocalDateTime.now();
		System.out.println(now);
		
		//날짜, 시간 포맷 설정
		DateTimeFormatter dtFormat =
				DateTimeFormatter.ofPattern("yy/MM/dd a HH:mm");
		
		System.out.println(now.format(dtFormat));
		
		//날짜만 설정
		LocalDate date = LocalDate.now();
		System.out.println(date);
		
		//시간만 설정
		LocalTime time = LocalTime.now();
		System.out.println(time);
		
		//시간 포맷 설정
		DateTimeFormatter timeFormat =
				DateTimeFormatter.ofPattern("a HH:mm");
				
		System.out.println(time.format(timeFormat));
		
		System.out.println();
		
		//특정 날짜 지정하기
		LocalDate startDay = LocalDate.of(2023, 8, 1);
		LocalDate toDay = LocalDate.of(2023, 9, 15);
		
		//지나온 날짜 계산하기
		long passedTime = ChronoUnit.DAYS.between(startDay, toDay);
		System.out.println("기준일로부터 " + passedTime + "일 지났습니다.");
		
	}

}
