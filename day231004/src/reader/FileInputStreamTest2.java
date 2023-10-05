package reader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileInputStreamTest2 {

	public static void main(String[] args) {

		try {
			FileReader fr = new FileReader("/Users/rim-yeeun/file/example.txt");
			
			int i;
			try {
				while((i = fr.read()) != -1) {
					System.out.print((char)i);
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
			System.out.println("\nend");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}
