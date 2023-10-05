package kr.or.iei.run;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server {
	
	//필드
	private static ServerSocket serverSocket;
	
	public static void main(String[] args) {
		
		System.out.println("============================================");
		System.out.println("서버를 종료하려면 q 또는 Q를 입력하고 Enter를 누르세요.");
		System.out.println("============================================");
		
		//서버 시작
		startServer();
		
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			String key = scanner.nextLine();
			if(key.toLowerCase().equals("q")) {
				break;
			}
		}
		scanner.close();
		
		//서버 종료
		stopServer();
		
	} //main 끝
	
	public static void startServer() {
		
		//항상 대기 - 스레드 만들기
		Thread thread = new Thread() {
			//스레드는 항상 run()을 구현해야 됨
			@Override
			public void run() {
				try {
					serverSocket = new ServerSocket(8000);
					System.out.println("[서버] 시작됨");
					
					//항상 클라이언트 연결 대기
					while(true)	{
						System.out.println("\n[서버] 연결 요청 기다림\n");
						
						//연결 수락 및 클라이언트와 통신할 소켓 객체 생성
						Socket socket = serverSocket.accept(); 
						
						//IP 확인
						InetSocketAddress isa = (InetSocketAddress) socket.getRemoteSocketAddress();
						String clientIp = isa.getHostString();
						System.out.println("[서버] " + clientIp + "의 연결 요청을 수락함");
						
						//데이터 받기(수신)
						InputStream is = socket.getInputStream();
						//기반 스트림을 생성자의 매개변수로 연결
						DataInputStream dis = new DataInputStream(is);
						String message = dis.readUTF();
						System.out.println("[서버] 데이터 받음 : " + message);
						
						//데이터 보내기(송신)
						String message2 = "서버가 글을 보냅니다.";
						//OutputStream os = socket.getOutputStream();
						DataOutputStream dos = new DataOutputStream(socket.getOutputStream());
						dos.writeUTF(message2);
						dos.flush();
						System.out.println("[서버] 데이터 보냄 : " + message2);						
						
						socket.close();
						System.out.println("[서버] " + clientIp + "의 연결을 끊음");
					}
				} catch (IOException e) {
					//e.printStackTrace();
					e.getMessage();
				}
			}
			
		}; //Thread 끝
		thread.start();
		
	} //startServer 끝
	
	//서버 종료
	public static void stopServer() {
		
		try {
			serverSocket.close();
			System.out.println("[서버] 종료됨");
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	} //stopServer 끝

} //class 끝
