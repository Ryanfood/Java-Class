import java.util.*;
public class QueueExample {
	public static void main(String[] args) {
		Queue q = new LinkedList();	
		q.offer("One");
		q.offer("Second");
		q.offer("3rd");
		System.out.println(q.toString());
		//Queue 中取得起始指定元素內容，並移除該元素
		System.out.println(q.poll());
		System.out.println(q.toString());
		//Queue 中取得起始指定元素內容，但不移除該元素
		System.out.println(q.peek());
		System.out.println(q.toString());	
	}
}
