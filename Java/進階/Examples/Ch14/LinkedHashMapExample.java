import java.util.*;
public class LinkedHashMapExample {
	public static void main(String[] args) {
		Map lm = new LinkedHashMap();
		lm.put("C", "SCJP");
		lm.put("A", "SCWCD");
		lm.put("B", "SCBCD");
		 
		System.out.println(lm);

		System.out.println("key=A : " + lm.get("A"));
		System.out.println("key=B : " + lm.get("B"));
		System.out.println("key=C : " + lm.get("C"));
	}
}
