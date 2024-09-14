import java.util.*;
import java.util.stream.*;

public class ReduceDemo3 {

	public static void main(String[] args) {
		
		long start = System.currentTimeMillis();
		Stream<Integer> i1 = Stream.iterate(1, i -> i+1).limit(10000);
		int sum1 = i1.reduce(0, (s,i) -> s+i);;
		long end = System.currentTimeMillis();
		System.out.println("Reduce Sum:"+(end-start));
		System.out.println("1+...+10000="+sum1);

		start = System.currentTimeMillis();
		Stream<Integer> i2 = Stream.iterate(1, i -> i+1).limit(10000);
		int sum2 = i2.parallel().reduce(0, (s,i) -> s+i);	
		end = System.currentTimeMillis();
		System.out.println("Parallel Reduce Sum:"+(end-start));
		System.out.println("1+...+10000="+sum2);

	}

}