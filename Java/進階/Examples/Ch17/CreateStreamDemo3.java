import java.util.stream.*;
import java.util.Random;
public class CreateStreamDemo3  {
	public static void main(String[] args) {
		IntStream iStream = IntStream.generate(new Random()::nextInt);
		DoubleStream dStream = DoubleStream.generate(new Random()::nextDouble);

		System.out.print("\nIntStream.generate()«Øºc: ");
		iStream.limit(6).forEach(i -> System.out.print(" "+i));

		System.out.print("\nDoubleStream.generate()«Øºc: ");
		dStream.limit(3).forEach(d -> System.out.print(" "+d));
	}
}
