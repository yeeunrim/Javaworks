package datainputoutput;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class WriteExample2 {

	public static void main(String[] args) {
		
		try {
			OutputStream os = new FileOutputStream("/Users/rim-yeeun/file/test2.db");
			
			//배열로 데이터 저장
			byte[] array = {10, 20, 30, 40, 50};
			
			//배열의 모든 바이트를 쓰기.
			os.write(array);
			
			os.flush();
			os.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		

	}

}
