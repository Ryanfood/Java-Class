import java.util.*;
import java.util.stream.*;
public class SequentialParallelDemo {
	public static void main(String[] args) {		
		List<String> sList = Arrays.asList("1","2","3","4","5","6","7","8","9","10");
		long start = System.currentTimeMillis();
		sList.stream().forEach(s -> {
				System.out.println(s + " - Thread:"+Thread.currentThread().getName());
				try{
					Thread.sleep(100);
				}catch(Exception ex){}}
		);
		long end = System.currentTimeMillis();
		System.out.println("Sequential Duration:"+(end-start));

		System.out.println("Processors:"+ Runtime.getRuntime().availableProcessors());
		start = System.currentTimeMillis();
		sList.parallelStream().forEach(s -> {
				System.out.println(s + " - Thread:"+Thread.currentThread().getName());
				try{
					Thread.sleep(100);
				}catch(Exception ex){}}
		);
		end = System.currentTimeMillis();
		System.out.println("Parallel Duration:"+(end-start));	
	}
}
