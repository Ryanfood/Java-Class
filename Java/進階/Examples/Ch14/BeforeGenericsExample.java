import java.util.*;

public class BeforeGenericsExample {
	public static void main(String[] args) {
		Set data = new HashSet();
		data.add("one");
		data.add("second");
		data.add("3rd");
			
		Iterator it = data.iterator();
		while (it.hasNext()) {
			String str = (String) it.next();
			System.out.println(str);
		}
	}
}
