package ifexample;

import java.util.Scanner;

public class ScoreCalculate {

	public static void main(String[] args) {
		// 학점 출력 프로그램
		// 변수 - score(점수-정수형), grade(학점-문자형)
		// A학점 : 90점 ~ 100점
		// B학점 : 80점 ~ 90점
		// C학점 : 70점 ~ 80점
		// D학점 : 60점 ~ 70점
		// F학점 : 0점 ~ 60점
		
		// 입력 
		Scanner scan = new Scanner(System.in);
		
		System.out.print("점수(100점 만점)를 입력하시오 : ");
		int score = scan.nextInt();
		char grade = 'A'; // 초기화 진행
		
		// 연산
		if(score >= 90 && score <= 100) {
			grade = 'A';
		} else if(score >= 80 && score < 90) {
			grade = 'B';
		} else if(score >= 70 && score < 80) {
			grade = 'C';
		} else if(score >= 60 && score < 70) {
			grade = 'D';
		} else { //else if(score >= 0 && score < 60) - 생략
			grade = 'F';
		}
		
		// 출력
		System.out.println("학점은 " + grade + "입니다.");
		
		scan.close();

	}

}
