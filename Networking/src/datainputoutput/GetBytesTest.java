package datainputoutput;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class GetBytesTest {

	public static void main(String[] args) {
		
		//OutputStream은 문자열 쓰기를 지원하지 않지만
		//Stream 클래스의 getByte()메서드가 지원하고 있다.
		//바이트 기반으로 데이터 보내기
		try (OutputStream os = new FileOutputStream("/Users/rim-yeeun/file/out.txt")){
			String data = "안녕하세요.\n좋은 하루 되세요 :)\nHappy Good Day~!";
			
			os.write(data.getBytes());
			
			os.flush(); //잔류 버퍼를 지우기
			//os.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
