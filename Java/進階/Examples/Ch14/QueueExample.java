import java.util.*;
public class QueueExample {
	public static void main(String[] args) {
		Queue q = new LinkedList();	
		q.offer("One");
		q.offer("Second");
		q.offer("3rd");
		System.out.println(q.toString());
		//Queue �����o�_�l���w�������e�A�ò����Ӥ���
		System.out.println(q.poll());
		System.out.println(q.toString());
		//Queue �����o�_�l���w�������e�A���������Ӥ���
		System.out.println(q.peek());
		System.out.println(q.toString());	
	}
}
