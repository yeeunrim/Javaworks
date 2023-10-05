package synchronizedmap;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class SynchronizedMapExample {

	public static void main(String[] args) {
		
		//동기화 된 컬렉션 - 멀티스레드
		Map<Integer, String> map =
				Collections.synchronizedMap(new HashMap<>());
		
		//싱글스레드
		//Map<Integer, String> map = new HashMap<>();
		
		Thread threadA = new Thread() {
			@Override
			public void run() {
				for(int i=1; i<=1000; i++) {
					map.put(i, "내용" + i	);
				}
				
			}
		}; //threadA
		
		Thread threadB = new Thread() {
			@Override
			public void run() {
				for(int i=1001; i<=2000; i++) {
					map.put(i, "내용" + i	);
				}
				
			}
		}; //threadB
		
		threadA.start(); //메인스레드가 호출하고 일시정지 상태로 들어감
		threadB.start();
		
		try {
			threadA.join(); //run()을 실행
			threadB.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("총 객체 수 : " + map.size());
		
		//map에 저장된 자료 전체 출력
		Set<Integer> keys = map.keySet();
		for(Integer key: keys) {
			System.out.println(key + ", " + map.get(key));
		}
		
	} //main
} //class
