package bufferedstream;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class TypingGame {

	public static void main(String[] args) {
		
		try(BufferedReader br = new BufferedReader(new FileReader("word.txt"))) {
			
			String data;
			String[] word = null;
			while((data = br.readLine()) != null) {
				word = data.split(" ");
			}
			
			Scanner scanner = new Scanner(System.in);
			
			int n = 1; //문제 번호
			double start, end; //시간 측정 (시작, 끝)
			System.out.println("타자 연습 게임 - 'Enter' 입력");
			scanner.nextLine();
			
			start = System.currentTimeMillis();
			
			while(n <= 10) {
				System.out.print("[문제" + n + "] ");
				int rnd = (int) (Math.random() * word.length);
				String question = word[rnd];
				System.out.println(question); //문제 출제
				
				System.out.print("정답 입력 > ");
				
				String answer = scanner.nextLine(); //정답 입력
				
				if(question.equals(answer)) {
					System.out.println("====== 정답 ======");
					n++;
				} else {
					System.out.println("== 오타, 다시 입력 ==");
				}
			} //while 끝
			
			end = System.currentTimeMillis();
			
			System.out.println();
			System.out.printf("게임 소요 시간 : %.2f초", (double)(end-start)/1000);
			scanner.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		} //try~catch 끝
		
	} //main 끝
} //class 끝

