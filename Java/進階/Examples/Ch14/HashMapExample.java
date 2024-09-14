import java.util.*;
public class HashMapExample {
	public static void main(String[] args) {
		Map map = new HashMap();
		map.put("one", "1st");
		map.put("second", new Integer(2));
		map.put("third", "3rd");
		System.out.println(map.toString());
		//�мg�e�������w
		map.put("third", "III");
		System.out.println(map.toString());
		//�^��Key���X
		Set set1 = map.keySet();
		System.out.println("Key���X:"+set1);	
		//�^��value�����X
		Collection collection = map.values();
		System.out.println("value�����X:"+collection);	
		//�^��Key�Pvalue�����X
		Set set2 = map.entrySet();
		System.out.println("Key�Pvalue�����X"+set2);		
	}
}
