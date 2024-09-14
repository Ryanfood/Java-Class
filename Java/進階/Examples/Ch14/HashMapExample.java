import java.util.*;
public class HashMapExample {
	public static void main(String[] args) {
		Map map = new HashMap();
		map.put("one", "1st");
		map.put("second", new Integer(2));
		map.put("third", "3rd");
		System.out.println(map.toString());
		//覆寫前面的指定
		map.put("third", "III");
		System.out.println(map.toString());
		//回傳Key集合
		Set set1 = map.keySet();
		System.out.println("Key集合:"+set1);	
		//回傳value的集合
		Collection collection = map.values();
		System.out.println("value的集合:"+collection);	
		//回傳Key與value的集合
		Set set2 = map.entrySet();
		System.out.println("Key與value的集合"+set2);		
	}
}
