package typinggame;

import java.util.Scanner;

public class TypingGame {

	public static void main(String[] args) {
		//영어 단어가 랜덤하게 화면에 출제 -> 입력
		//오타가 없으면 통과, 있으면 다시 도전
		//10번 모두 완료하면 시간 측정
		
		//10개의 단어 생성
		String[] englishWord = {
				"elephant", "lion", "giraffe", "rabbit", "tiger"
				, "panda", "cat", "mouse", "horse", "cow"
		};
		
		Scanner scanner = new Scanner(System.in);
		int n = 1; //문제 번호
		
		System.out.println("영어 타자 게임 시작을 위해서 'Enter'를 입력하세요.");
		scanner.nextLine(); //enter
		
		double start = System.currentTimeMillis();
		
		while(n < 11) {
			
			//10개의 단어 랜덤 출력
			int randomWord = (int) (Math.random() * englishWord.length);
			System.out.print("[문제" + n + "] ");
			String qustion = englishWord[randomWord];
			System.out.println(qustion); //문제 출제
			
			System.out.print("정답 입력 > ");
			
			//단어 입력
			String answer = scanner.nextLine(); //정답 입력
			
			//정답 및 오답 구별
			if(qustion.equals(answer)) {
				System.out.println("====== 정답 ======");
				n++;
			} else	{
				System.out.println("== 오타, 다시 입력 ==");
			}
		
		}
		
		double end = System.currentTimeMillis();
		
		System.out.println();
		System.out.printf("게임 소요 시간 : %.2f초", (end-start)/1000);
		scanner.close();

	}

}
