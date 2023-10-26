package day231004.reader;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamTest3 {

	public static void main(String[] args) {

		try {
				FileInputStream fis = new FileInputStream("/Users/rim-yeeun/file/example.txt");
				
				byte[] data = new byte[1024];
				int readbytes = fis.read(data);
				
				String str = new String(data, 0, readbytes, "utf-8");
				System.out.println(str);
				
			} catch (IOException e) {
				e.printStackTrace();
			}
			
	}
	
}

