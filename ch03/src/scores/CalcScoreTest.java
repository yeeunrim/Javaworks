package scores;

import java.util.Scanner;

public class CalcScoreTest {

	public static void main(String[] args) {
		// 성적 처리 프로그램
		// 입력시 잘못된 입력이 있는 경우 - 예외 처리
		// try ~ catch 구문 사용
		
		Scanner sc = new Scanner(System.in); 
		boolean sw = true; //상태 변수 
		int studentCount = 0 ;
		int[] scores = null;
		
		while(sw) {
			try {
		System.out.println("===============================================");
		System.out.println("1.학생 수 | 2.점수 입력 | 3.점수 리스트 | 4.분석 | 5.종료");
		System.out.println("===============================================");
		
		System.out.println();
		
		System.out.print("번호 입력 : ");
		
		//문자를 숫자로 변환
		int menu = Integer.parseInt(sc.nextLine());
		
		if(menu == 1) {
			System.out.print("학생 수 > ");
			studentCount = Integer.parseInt(sc.nextLine());
			scores = new int[studentCount]; //학생 수는 배열의 크기
			
		} else if (menu == 2) {//배열에 점수 저장
			for(int i=0; i<scores.length; i++) {
				System.out.print("학생" + (i+1) + "의 점수 > ");
				scores[i] = Integer.parseInt(sc.nextLine());
			}
			
		} else if (menu == 3) {
			for(int i=0; i<scores.length; i++) {
				System.out.println("학생" + (i+1) + "의 점수 > " + scores[i]);
			}
			
		} else if (menu == 4) {//평균, 최대값 
			int sumVal = 0;
			double avg;
			int maxVal = scores[0];
			
			for(int i=0; i<scores.length; i++) {
				sumVal += scores[i];
				if(scores[i] > maxVal) {
					maxVal = scores[i];
				}
			}
			
			avg = (double)sumVal / scores.length; //두 개다 int이기 때문에 손실 문제 발생	
			
			System.out.printf("점수의 평균 > %.2f\n", avg);
			System.out.println("점수의 최고 점수 > " + maxVal);
			
			} else if (menu == 5) {
				sw = false;
			
			} else {
				System.out.println("지원하지 않는 기능입니다.");
				
			}
				}
			catch(Exception e) {
				System.out.println("올바른 입력이 아닙니다. 숫자를 입력해주세요.");
			}
			
		} //while 끝

		System.out.println("프로그램 종료");
		sc.close();
		
	}

}
