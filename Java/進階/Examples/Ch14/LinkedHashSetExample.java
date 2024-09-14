import java.util.*;
public class LinkedHashSetExample {
	public static void main(String[] args) {
		Set ls = new LinkedHashSet();
		ls.add("One");
		ls.add("Second");
		ls.add("3rd");
		ls.add(new Integer(4));
		ls.add(new Float(5.0)); 
		//加入重複元素
		ls.add("Second");
		ls.add(new Integer(4));
		//列印LinkedHashSet,呼叫toString()方法
		System.out.println("列印LinkedHashSet:");
		System.out.println(ls);
		//利用Iterator將LinkedHashSet集合中的所有元素依序取出"
		System.out.println("利用Iterator將LinkedHashSet集合中元素依序取出:");
		Iterator i = ls.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
	}
}
