import java.util.*;
public class DequeExample {
	public static void main(String[] args) {
		//Queue
		System.out.println("----Queue----");
		Deque q = new LinkedList();
		q.offer("One");
		q.offer("Second");
		q.offer("3rd");
		System.out.println(q.toString());
		//Queue 中取得元素內容，並移除該元素
		System.out.println(q.poll());
		System.out.println(q.toString());
		//Queue 中取得元素內容，但不移除該元素
		System.out.println(q.peek());
		System.out.println(q.toString());	

		//Stack
		System.out.println("----Stack----");
		Deque s = new LinkedList();
		s.push("One");
		s.push("Second");
		s.push("3rd");
		System.out.println(s.toString());
		//Stack 中取得元素內容，並移除該元素
		System.out.println(s.pop());
		System.out.println(s.toString());
		//Queue 中取得元素內容，但不移除該元素
		System.out.println(s.peek());
		System.out.println(s.toString());	
	}
}
