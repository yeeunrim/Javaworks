package chatting;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;

import org.json.JSONObject;

public class SocketClient {
	
	ChatServer chatServer;
	Socket socket;
	String clientIp;
	String chatName;
	DataInputStream dis;
	DataOutputStream dos;

	public SocketClient(ChatServer chatServer, Socket socket) {
		
		try {
			this.chatServer = chatServer;
			this.socket = socket;
			
			dis = new DataInputStream(socket.getInputStream());
			dos = new DataOutputStream(socket.getOutputStream());
			
			InetSocketAddress isa = 
					(InetSocketAddress) socket.getRemoteSocketAddress();
			this.clientIp = isa.getHostString(); //연결이 됐으면
			receive();                           //데이터를 받아야 함
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	//데이터 받기(수신) : JSON 받기
	public void receive() {
		
		chatServer.threadPool.execute(() -> {
			while(true) {
				try {
					String receiveJson = dis.readUTF();
					
					//JSON 파싱 
					//명령(command) 속성의 구조
					//{"command": "incoming", "data": "chatName"}
					//{"command": "message", "data": "xxxx(메세지)"}
					JSONObject jsonObject = new JSONObject(receiveJson);
					
					String command = jsonObject.getString("command");
					switch(command) {
					case "incoming" :
						this.chatName = jsonObject.getString("data");
						chatServer.sendToAll(SocketClient.this, "입장하셨습니다.");
						chatServer.addSocketClient(this); //서버의 소켓 클라이언트 생성
						break;
					case "message" :
						String message = jsonObject.getString("data");
						chatServer.sendToAll(this, message);
						break;
					}
				} catch (IOException e) {
					//클라이언트 소켓이 종료되면 연결이 끊김
					chatServer.sendToAll(this, "나가셨습니다.");
					chatServer.removeSocketClient(this); //서버의 소켓 클라이언트 삭제
				}
			}
		});
		
	} //receive 끝
	
	//데이터 보내기(송신) : JSON 보내기
	public void send(String json) {
		
		try {
			//연결이 끊길 수 있기 때문에 try~catch 구문 사용
			dos.writeUTF(json);
			dos.flush();
		} catch (IOException e) {
			e.printStackTrace();
		} 
		
	}
	
	//소켓 종료
	public void close() {
		
		try {
			socket.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
}