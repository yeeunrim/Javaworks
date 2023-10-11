package udpnetwork;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketAddress;
import java.util.Scanner;

//UDP 통신 서버
public class NewsServer {
	
	//필드
	private static DatagramSocket datagramSocket;
	
	
	public static void main(String[] args) {
		
		System.out.println("============================================");
		System.out.println("서버를 종료하려면 q 또는 Q를 입력하고 Enter를 누르세요.");
		System.out.println("============================================");
		
		//UDP 서버 시작
		startServer();
			
		Scanner scanner = new Scanner(System.in);
		while(true)	{
			String key = scanner.nextLine();
			if(key.toLowerCase().equals("q")) //대문자가 입력될 시, 소문자로 바꿈
				break;
		}
		
		scanner.close();
		
		//UDP 서버 종료
		stopServer();
		
	} //main 끝
	
	public static void startServer() {
		
		//작업 스레드 정의
		Thread thread = new Thread() {
			@Override
			public void run() {
				try {
					//통신 객체 생성
					datagramSocket = new DatagramSocket(8100);
					System.out.println("[server] 시작됨");
					
					while(true) {
						//클라이언트가 보낸 뉴스 주체 받기
						DatagramPacket receivePacket = new DatagramPacket(new byte[1024], 1024);
						datagramSocket.receive(receivePacket);
								
						//받은 주제를 문자열 복원
						String newsKind = new String(receivePacket.getData(), 0, receivePacket.getLength(), "utf-8");
						
						//주제 관련 뉴스 10개를 client로 전송
						//client의 IP와 port를 얻음(가져옴)
						SocketAddress socketAddress = receivePacket.getSocketAddress();
						for(int i=0; i<=10; i++) {
							String data = newsKind + ": 뉴스" + i;
							byte[] bytes = data.getBytes("utf-8");
							DatagramPacket sendPacket = new DatagramPacket(bytes, 0, bytes.length, socketAddress);
							datagramSocket.send(sendPacket);
							
							//1초 간격으로 보내기
							Thread.sleep(1000);
						} //for 끝
					} //while 끝
				} catch (IOException | InterruptedException e) {
					//e.printStackTrace();
					System.out.println(e.getMessage());
				} //try~catch 끝
			} //run() 끝
		}; //thread 끝
		
		thread.start();
		
	} //startServer 끝
	
	public static void stopServer() {
		
		datagramSocket.close();
		System.out.println("[server] 종료됨");
		
	} //stopServer 끝

} //class 끝
