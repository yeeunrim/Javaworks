package network.socket2;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

//TCP 네트워킹
public class EcoServer {
	
	//서버 소켓 객체 선언
	private static ServerSocket serverSocket;

	public static void main(String[] args) {
		System.out.println("============================================");
		System.out.println("서버를 종료하려면 q 또는 Q를 입력하고 Enter를 누르세요.");
		System.out.println("============================================");
		
		//TCP 서버 시작
		startServer();
			
		Scanner scanner = new Scanner(System.in);
		while(true)	{
			String key = scanner.nextLine();
			if(key.toLowerCase().equals("q")) //대문자가 입력될 시, 소문자로 바꿈
				break;
		}
		
		scanner.close();
		
		//TCP 서버 종료
		stopServer();
		
	} //main 끝

	private static void startServer() {
		//작업 스레드 생성
		Thread thread = new Thread() {
			@Override
			public void run() {
				try{
					serverSocket = new ServerSocket(50001);
					System.out.println("[서버] 시작됨");
					
					while(true) {
						System.out.println("[서버] 연결 요청을 기다림");
						//서버가 연결 요청 수락함
						Socket socket = serverSocket.accept(); //클라이언트와 통신할 소켓 생성
						
						//IP 주소 알아내기
						InetSocketAddress isa = (InetSocketAddress)socket.getRemoteSocketAddress();
						String clientIP = isa.getHostString();
						System.out.println("[서버] " + clientIP + "의 연결 요청을 수락함");
						//웹 브라우저에서 http://127.0.0.1:50001/을 입력함 - 콘솔에서 확인
						
						//클라이언트가 보낸 데이터 받기(읽기)
						InputStream is = socket.getInputStream();
						byte[] bytes = new byte[1024]; //데이터를 저장할 배열 선언
						int readBytes = is.read(bytes);
						//데이터를 문자열로 생성
						String message = new String(bytes, 0, readBytes, "utf-8");
						
						//받은 데이터 보내기
						OutputStream os = socket.getOutputStream();
						bytes = message.getBytes("utf-8"); //인코딩
						os.write(bytes);
						
						os.flush();
						System.out.println("[서버] 받은 데이터를 다시 보냄 : " + message);
						
						socket.close(); //소켓 종료
						System.out.println("[서버] " + clientIP + "의 연결을 끊음");
					} //while 끝
				}catch(IOException e) {
						//e.printStackTrace();
						System.out.println("[서버] " + e.toString());
					} //try~catch 끝
					
				} //run() 끝
		}; //Thread 끝
		
		thread.start();
		
	} //startServer 끝
	
	private static void stopServer() {
		try{
			serverSocket.close();
			System.out.println("[서버] 종료됨");
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
} //class 끝
