import java.util.*;
import java.util.stream.*;
public class IntStreamDemo {
	public static void main(String[] args) {
		IntStream iStream1 = IntStream.rangeClosed(1,50);
		System.out.println("1~50 sum: "+iStream1.sum());
		
		IntStream iStream2 = IntStream.rangeClosed(1,50);
		OptionalDouble avg = iStream2.average();
		System.out.println("1~50 average: "+avg.orElse(-1));
		
		IntStream iStream3 = IntStream.generate(()->(int)(Math.random()*100)).limit(10);		
		System.out.print("IntSream3: ");
		OptionalInt maxInt = iStream3.peek(i->System.out.print(" "+i)).max();
		System.out.println("\n最大值: "+maxInt.getAsInt());

		IntStream iStream4 = IntStream.generate(()->(int)(Math.random()*100)).limit(10);		
		System.out.print("IntSream4: ");
		OptionalInt minInt = iStream4.peek(i->System.out.print(" "+i)).min();
		System.out.println("\n最小值: "+minInt.getAsInt());
	}
}
