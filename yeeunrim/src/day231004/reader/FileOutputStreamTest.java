package day231004.reader;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class FileOutputStreamTest {
	
	public static void main(String[] args) {
		
		try {
			OutputStream os = new FileOutputStream("/Users/rim-yeeun/file/example.txt");
			
			String data = "안녕하세요";
			
			os.write(data.getBytes());
			
			os.flush();
			os.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
