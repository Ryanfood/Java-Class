import java.util.*;
import java.util.stream.*;
public class FlatMapDemo {
	public static void main(String[] args) {
		List<Integer> oddList = Arrays.asList(1, 3, 5, 7);
		List<Integer> evenList = Arrays.asList(2, 4, 6, 8);
		List<List<Integer>> listOfList = Arrays.asList(oddList, evenList);
		System.out.println("扁平化前: "+listOfList);

		List<Integer> flattenList = listOfList.stream()
			                                  .flatMap(l -> l.stream())
			                                  .collect(Collectors.toList());	
		System.out.println("扁平化後: "+flattenList);
	}
}
