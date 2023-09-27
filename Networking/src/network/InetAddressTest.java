package network;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressTest {

	public static void main(String[] args) {
		
		//IP(internet protocol)
		try {
			//내컴퓨터(Local Computer) IP 얻기
			InetAddress local = InetAddress.getLocalHost();
			System.out.println("내 컴퓨터 IP 주소 : " + local.getHostAddress());
			System.out.println("현재 호스트명 : " + local.getHostName());
			
			//서버 컴퓨터 - 여러 대인 경우 배열로 출력
			//DNS(domain name service) : 숫자 주소 -> 문자 이름 변경하는 서비스
			//InetAddress server = InetAddress.getByName("www.naver.com");
			//System.out.println("네이버 컴퓨터 IP 주소 : " + server.getHostAddress());
			
			InetAddress[] server = InetAddress.getAllByName("www.naver.com");
			for(InetAddress remote : server) {
				System.out.println(remote);
			}
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
	}
}
