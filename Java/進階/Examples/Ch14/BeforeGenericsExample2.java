import java.util.*;

public class BeforeGenericsExample2 {
	public static void main(String[] args) {
		Set data = new HashSet();
		data.add("one");
		data.add("second");
		data.add("3rd");
		data.add(new Integer(4));
			
		Iterator it = data.iterator();
		while (it.hasNext()) {
			String str = (String)it.next();
			System.out.println(str);
		}
	}
}
