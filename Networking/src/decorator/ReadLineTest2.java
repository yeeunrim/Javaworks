package decorator;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadLineTest2 {

	public static void main(String[] args) {
		
		//FileReader에 BufferedReader 보조 스트림 연결
		//코드 전체를 읽어서 출력하는 코드
		try(BufferedReader br = new BufferedReader(new FileReader("src/decorator/ReadLineTest2.java"))) {
			//행 변수
			int lineNo = 1;
			while(true) {
				//1행씩 읽음
				String data = br.readLine();
				//읽을 data가 없으면 빠져 나옴
				if(data == null) break; 
				System.out.println(lineNo + " " + data);
				//행 수 1씩 증가
				lineNo++;
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}