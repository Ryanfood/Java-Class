import java.util.*;
public class HashSetExample {
	public static void main(String[] args) {
		HashSet hs = new HashSet();
		//加入元素
		hs.add("One");
		hs.add("Second");
		hs.add("3rd");
		hs.add(new Integer(4));
		hs.add(new Float(5.0)); 
		//加入重複元素
		hs.add("Second");
		hs.add(new Integer(4));
		//列印HashSet,利用toString()方法
		System.out.println("列印HashSet:");
		System.out.println(hs);
		//利用Iterator將HashSet集合中的所有元素依序取出"
		System.out.println("利用Iterator將HashSet集合中元素依序取出:");
		Iterator  i= hs.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
	}
}
