package datainputoutput;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class ReadExample1 {

	public static void main(String[] args) {
		
		//입력 스트림 객체 생성
		try {
			InputStream is = new FileInputStream("/Users/rim-yeeun/file/test1.db");
			
			while(true) {
				int data = is.read();
				if(data == -1) break; //-1은 데이터가 없는 경우를 말함(null)
				System.out.println(data);
			}
			
			is.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
