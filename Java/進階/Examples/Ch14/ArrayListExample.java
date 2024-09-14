import java.util.*;
public class ArrayListExample {
	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add("One");
		al.add("Second");
		al.add("3rd");
		al.add(new Integer(4));
		al.add(new Float(5.0)); 
		//加入重複元素
		al.add("Second");
		al.add(new Integer(4));
		//列印ArrayList,利用toString()方法
		System.out.println("列印ArrayList:");
		System.out.println(al);
		//利用Iterator將ArrayList集合中的所有元素依序取出"
		System.out.println("利用Iterator將ArrayList集合中元素依序取出:");
		ListIterator it = al.listIterator();
		while(it.hasNext())  {
			int index = it.nextIndex();
			System.out.println(index + "=" + it.next());
		} 
	}
}
