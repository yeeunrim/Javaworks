package decorator;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class DataInputOutputStreamTest {

	public static void main(String[] args) {
		
		//정수, 실수, 문자열 쓰기
		try {
			//기반 스트림
			OutputStream os = new FileOutputStream("data.db");
			
			//보조 스트림
			DataOutputStream dos = new DataOutputStream(os);
			
			//기본 타입 자료 쓰기
			dos.writeInt(1);;      //정수형 자료
			dos.writeUTF("임예은");  //문자열 자료
			dos.writeDouble(95.2); //실수형 자료
			
			dos.writeInt(2);;      //정수형 자료
			dos.writeUTF("이나경");  //문자열 자료
			dos.writeDouble(88.5); //실수형 자료
			
			dos.flush();
			dos.close();

		} catch (IOException e) {
			e.printStackTrace();
		}
		
		//바이트 데이터 읽기
		try(InputStream is = new FileInputStream("./data.db");
			DataInputStream dis = new DataInputStream(is)) {
			
			//기본 타입 자료 읽기
			//주의할 점은 파일의 쓴 순서대로 읽어줘야 한다.
			for(int i=0; i<2; i++) { //데이터 수 만큼 반복
				int num = dis.readInt();
				String name = dis.readUTF();
				double score = dis.readDouble();
				System.out.println(num + " / " + name + " / " + score);
			}
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		
	}
}
