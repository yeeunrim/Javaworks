package datareaderwriter;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class ReadExample1 {
	
	public static void main(String[] args) {
		
		//try(객체 생성) ~ catc
		try(Reader reader = new FileReader("/Users/rim-yeeun/file/test.txt")){
			while(true) {
				int data = reader.read();
				//System.out.println(data);
				if(data == -1) break;
				System.out.print((char)data + " ");
			}
			//reader.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
