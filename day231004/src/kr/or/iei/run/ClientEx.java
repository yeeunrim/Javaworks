package kr.or.iei.run;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class ClientEx {
	
	public static void main(String[] args) {
		
		try {
			//연결 성공
			Socket socket = new Socket("localhost", 8000);
			System.out.println("[client] 연결 성공");
			
			//데이터 보내기
			String sendMessage = "hello";
			OutputStream os = socket.getOutputStream();
			DataOutputStream dos = new DataOutputStream(os);
			dos.writeUTF(sendMessage);
			dos.flush();
			System.out.println("[client] 데이터 보냄 : " + sendMessage);
			
			//데이터 받기
			InputStream is = socket.getInputStream();
			DataInputStream dis = new DataInputStream(is);
			String recieveMessage = dis.readUTF();
			System.out.println("[client] 데이터 받음 : " + recieveMessage);
			
			//연결 끊기
			socket.close();
			System.out.println("[client] 연결 끊음");
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	
	}
}
