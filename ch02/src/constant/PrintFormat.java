package constant;

public class PrintFormat {

	public static void main(String[] args) {
		// printf("문자열 포맷", 객체 or 변수);
		// 대응 서식 : 정수 - %d, 실수 - %f, 문자 - %s 
		// 줄 바꿈 : \n,  띄어쓰기 : \t(tab)
		
		int year = 2023;
		
		System.out.println("올해는 " + year + "년입니다.");
		System.out.printf("올해는 %d년입니다.", year);
		
		System.out.println();
		
		float weight = 63.7F;
		
		System.out.println("무게는 " + weight + "kg입니다.");
		System.out.printf("무게는 %.2fkg입니다.", weight);
		
		String nick = "얼음공주";
		System.out.printf("그녀의 별명은 %s입니다.\n", nick);
		
		//\t 사용
		//int num = 0; //0으로 초기화
		//num += 1; //num = num + 1
		
		String table = ""; //빈 문자열로 초기화 
		table += "-----------------------\n";
		table += "이름\t나이\t나라\n";
		table += "-----------------------\n";
		table += "강감찬\t82살\t고려\n";
		table += "-----------------------\n";
		table += "임예은\t25살\t대한민국\n";
		table += "-----------------------\n";
		
		System.out.println(table);
		
	}

}
