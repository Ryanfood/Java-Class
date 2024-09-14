import java.util.*;
public class TreeMapExample {
	public static void main(String[] args) {
		SortedMap sm = new TreeMap();

		sm.put(new Integer(2), "SCJP");
		sm.put(new Integer(1), "SCWCD");
		sm.put(new Integer(3), "SCBCD");
		sm.put(new Integer(1), "SCJP");

		System.out.println(sm);
	}
}
