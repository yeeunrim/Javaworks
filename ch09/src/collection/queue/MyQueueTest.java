package collection.queue;

public class MyQueueTest {

	public static void main(String[] args) {
		
		MyQueue queue = new MyQueue();
		
		//자료 저장
		queue.enQueue("수박");
		queue.enQueue("배");
		queue.enQueue("사과");
		
		//자료 출력(삭제)
		System.out.println(queue.deQueue());
		System.out.println(queue.deQueue());
		System.out.println(queue.deQueue());
		System.out.println(queue.deQueue());

	}

}
