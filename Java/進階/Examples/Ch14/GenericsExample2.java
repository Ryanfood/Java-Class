import java.util.*;

public class GenericsExample2 {
	public static void main(String[] args) {
		List<String> data = new ArrayList<>();
		data.add("One");
		data.add("Second");
		data.add("3rd");
		data.add(new Integer(4));
			
		for(String str : data) {
			System.out.println(str);
		}

	}
}
