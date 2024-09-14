import java.util.*;
public class GenericsExample3 {
	public static void main(String[] args) {
		List<String> names = new ArrayList<String>();
		names.add("Jacky");
		names.add("Piggy");
		print(names);

		List<Integer> data = new LinkedList<Integer>();
		data.add(1);
		data.add(2);
		print(data);
	}
	
	public static void print(List<?> data) {
		Iterator<?> it = data.iterator(); 
		while(it.hasNext()){
			System.out.print( it.next()+", ");
		}
		System.out.println();
	}
}
