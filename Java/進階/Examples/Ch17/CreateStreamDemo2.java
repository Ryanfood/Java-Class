import java.util.stream.*;
public class CreateStreamDemo2 {
	public static void main(String[] args) {
		IntStream i1 = IntStream.of(1, 2, 3, 4, 5, 6, 7, 8);
		IntStream i2 = IntStream.range(1, 9);
		IntStream i3 = IntStream.rangeClosed(1, 8);
		System.out.print("IntStream.of()«Øºc: ");
		i1.forEach(System.out::print);
		System.out.print("\nIntStream.range()«Øºc: ");		
		i2.forEach(System.out::print);
		System.out.print("\nIntStream.rangeClosed(): ");		
		i3.forEach(System.out::print);
	}
}
