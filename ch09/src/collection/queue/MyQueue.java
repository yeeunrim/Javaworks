package collection.queue;

import java.util.ArrayList;
import java.util.List;

public class MyQueue {

	
	//필드
	private List<String> arrayQueue;
	
	//생성자
	public MyQueue() {
		arrayQueue = new ArrayList<>();
	}
	
	//자료 저장 - add()
	public void enQueue(String data) {
		arrayQueue.add(data);
	}
	
	//자료 출력(삭제) - remove() : 맨 앞에서 꺼냄
	public String deQueue() {
		int size = arrayQueue.size();
		if(size == 0){
			System.out.println("queue가 비었습니다.");
			return null;
		}
		return arrayQueue.remove(0);
	}
	
	
}
