import java.util.*;
import java.util.stream.*;
public class SequentialParallelDemo1 {
	public static void main(String[] args) {		
		IntStream iStream = IntStream.rangeClosed(1,10000);
		long start = System.currentTimeMillis();
		int sum1 = iStream.filter(i->i%2==0).sum();
		long end = System.currentTimeMillis();
		System.out.println("Sequential Sum:"+(end-start));
		System.out.println("2+...+10000="+sum1);
				
		IntStream iStream2 = IntStream.rangeClosed(1,10000);
		start = System.currentTimeMillis();
		int sum2 = iStream2.parallel().filter(i->i%2==0).sum();
		end = System.currentTimeMillis();
		System.out.println("Parallel Sum:"+(end-start));
		System.out.println("2+...+10000="+sum2);	
	}
}
