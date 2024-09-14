import java.util.*;
import java.util.stream.*;

public class ReduceDemo {

	public static void main(String[] args) {
		List<Integer> iList = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		int sum1 = IntStream.rangeClosed(1, 10).sum();		
        System.out.println("1+...+10="+sum1);

		int sum2 = IntStream.rangeClosed(1, 10).reduce((a,i) -> a+i).getAsInt();	
        System.out.println("1+...+10="+sum2);

		int sum3 = IntStream.rangeClosed(1, 10).reduce(0, (s,i) -> s+i);	
        System.out.println("1+...+10="+sum3);

		int factorial1 = IntStream.rangeClosed(1, 10).reduce((f,i) -> f*i).getAsInt();
		System.out.println("10!="+factorial1);

		int factorial2 = IntStream.rangeClosed(1, 10).reduce(1, (f,i) -> f*i);
		System.out.println("10!="+factorial2);
	}

}