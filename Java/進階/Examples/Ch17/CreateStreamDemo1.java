import java.util.stream.*;
import java.util.Random;
public class CreateStreamDemo1  {
	public static void main(String[] args) {	
		Stream<Integer> i1 = Stream.iterate(1, i -> i+1);	
		Stream<Integer> i2 = Stream.generate(() -> (int)(Math.random()*100));
		Stream<Double>  d1 = Stream.generate(new Random()::nextDouble);

		System.out.print("Stream.iterate()«Øºc: ");		
		i1.limit(8).forEach(System.out::print);
		System.out.print("\nStream.generate()«Øºc: ");
		i2.limit(8).forEach(i -> System.out.print(" "+i));
		System.out.print("\nStream.generate()«Øºc: ");
		d1.limit(4).forEach(d -> System.out.print(" "+d));
	}
}
