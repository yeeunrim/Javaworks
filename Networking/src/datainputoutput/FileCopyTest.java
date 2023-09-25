package datainputoutput;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class FileCopyTest {

	public static void main(String[] args) {
		
		//close()를 사용하지 않는 방법 : try ~ with ~ resource문
		String originFile = "/Users/rim-yeeun/file/picture1.jpg"; //원본파일
		String copyFile = "/Users/rim-yeeun/file/picture3.jpg";   //사본파일
		long start, end;
		
		try(InputStream is = new FileInputStream(originFile); 
			OutputStream os = new FileOutputStream(copyFile)) {
			start = System.currentTimeMillis(); //복사전 시간
				
			while(true) {
				int num = is.read(); //읽을 바이트 수
				if(num == -1) break;
				os.write(num);       //파일에 쓰기
			}
			
			os.flush(); //버퍼 비우기
			//is.close();
			//os.close();
			
			end = System.currentTimeMillis(); //복사후 시간
			System.out.println("복사 소요 시간 : " + (end-start) + "ms");
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
