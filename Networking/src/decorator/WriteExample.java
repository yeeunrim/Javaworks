package decorator;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class WriteExample {

	public static void main(String[] args) {
		
		//파일에 쓰기 - 바이트 or 문자 선택
		//문자 단위로 선택 : Writer - FileWriter
		try(Writer writer = new FileWriter("message.txt")) {
			//문자열 쓰기
			String msg = "오늘도 좋은 하루 되세용 :)\n화이팅 ~ !\n감사합니다 ^^";
			writer.write(msg);
			//버퍼 지우기
			writer.flush();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
