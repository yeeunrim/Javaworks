package day231004.kr.or.iei.run;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class ServerEx {
	
	private static ServerSocket serverSocket;

	public static void main(String[] args) {
		
		System.out.println("============================================");
		System.out.println("서버를 종료하려면 q 또는 Q를 입력하고 Enter를 누르세요.");
		System.out.println("============================================");
		
		startServer();
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			String key = sc.nextLine();
			if(key.toLowerCase().equals("q")) {
				break;
			}
		}
		
		sc.close();
		
		stopServer();
		
	} //main 끝
	
	public static void startServer() {
		
		//항상 대기 상태 만들기
		Thread thread = new Thread() {
			@Override
			public void run() {
				//서버소켓 객체 생성
				try {
					serverSocket = new ServerSocket(8000);
					System.out.println("[server] 시작");
					
					//항상 클라이언트 연결 대기
					while(true) {
						System.out.println("\n[server] 연결 요청 기다림\n");
						
						//연결 수락 및 클라이언트와 통신할 소켓 객체 생성
						Socket socket = serverSocket.accept();
						
						//IP확인
						InetSocketAddress isa = (InetSocketAddress) socket.getRemoteSocketAddress();
						String clientIp = isa.getHostString();
						System.out.println("[server]" + clientIp + "의 연결 요청을 수락함");
						
						//데이터 받기
						InputStream is = socket.getInputStream();
						DataInputStream dis = new DataInputStream(is);
						String message = dis.readUTF();
						System.out.println("[server] 데이터 받음 : " + message);
						
						//데이터 보내기
						String message2 = "nice to meet you";
						OutputStream os = socket.getOutputStream();
						DataOutputStream dos = new DataOutputStream(os);
						dos.writeUTF(message2);
						dos.flush();
						System.out.println("[server] 데이터 보냄 : " + message2);
						
						//연결 끊기
						socket.close();
						System.out.println("[server]" + clientIp + "의 연결을 끊음");
					}
					
				} catch (IOException e) {
					e.getMessage();
				}
			}
		};
		
		//thread 시작
		thread.start();
		
	} //startServer 끝
	
	public static void stopServer() {
		
		try {
			serverSocket.close();
			System.out.println("[server] 종료");
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	} //stopServer 끝
	
} //class 끝
