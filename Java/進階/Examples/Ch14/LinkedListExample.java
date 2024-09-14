import java.util.*;
public class LinkedListExample {
	public static void main(String[] args) {
		LinkedList ll = new LinkedList();
		ll.add("SCJP");
		ll.add("SCWCD");
		ll.add("SCBCD");
		ll.add("SCMAD");
		ll.add("SCJP");
		//列印LinkedList
		System.out.println("將 LinkedList 列印出來");
		System.out.println(ll);
		//抓取 LinkedList 中 index=1 資料
		System.out.println("抓取 LinkedList 中 index=1 資料");
		System.out.println(ll.get(1));        
		//移除 LinkedList 中第一個元素資料
		System.out.println("移除 LinkedList 中第一個元素資料:"  +  ll.removeFirst());
		System.out.println("將變更後 LinkedList 列印出來");
		System.out.println(ll);
	}
}
