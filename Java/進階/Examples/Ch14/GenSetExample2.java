import java.util.*;

public class GenSetExample2 {
	public static void main(String[] args) {
		Set<Integer> data = new HashSet<>();
		data.add(new Integer(1));
		data.add(new Integer(2));
		data.add(new Integer(3));
		data.add("Four");
			
		Iterator<Integer> it = data.iterator();
		while (it.hasNext()) {
			int i = it.next();
			System.out.println(i);
		}
	}
}
