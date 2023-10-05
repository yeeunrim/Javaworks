package reader;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamTest {

	public static void main(String[] args) {
		//한글을 바이트 단위로 읽었기 때문에 깨져서 출력되게 된다.
		try {
			FileInputStream fis = new FileInputStream("/Users/rim-yeeun/file/example.txt");
			
			int i;
			try {
				while((i = fis.read()) != -1) {
					System.out.println((char)i);
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
			System.out.println("end");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}
