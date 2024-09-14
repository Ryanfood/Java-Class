import java.util.*;
public class GenericsExample5 {
	public static void main(String[] args) {
		List<Integer> data1 = new LinkedList<Integer>();
		addNumber(data1);
		System.out.println(data1);
		List<Number> data2 = new LinkedList<Number>();         
		addNumber(data2);
		System.out.println(data2);
	}

	public static void addNumber(List<? super Integer> data) {
		for(int i = 1; i <= 10; i++)
			data.add(i);
	}

}

