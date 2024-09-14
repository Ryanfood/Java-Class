import java.util.*;

public class GenericsExample1 {
	public static void main(String[] args) {
		List<String> data = new ArrayList<String>();
		data.add("One");
		data.add("Second");
		data.add("3rd");
			
		for(String str : data) {
			System.out.println(str);
		}
	}
}
