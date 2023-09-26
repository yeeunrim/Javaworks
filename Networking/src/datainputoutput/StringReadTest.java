package datainputoutput;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class StringReadTest {
	
	public static void main(String[] args) {
		
		//문자 기반으로 데이터 받기(읽기)
		try (Reader reader = new FileReader("/Users/rim-yeeun/file/out.txt")) {
			/*while(true) {
				int data = reader.read();
				if(data == -1) break;
				System.out.print((char)data);
			} */
			
			int data;
			while((data = reader.read()) != -1) {
				System.out.print((char)data);
			}
			
			//reader.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
