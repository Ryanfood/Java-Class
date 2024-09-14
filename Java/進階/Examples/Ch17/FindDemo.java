import java.util.*;
import java.util.stream.*;
public class FindDemo {
	public static void main(String[] args) {
		Stream<Integer> iStream1 = Stream.of(1, 2, 3, 4, 5);
		Optional<Integer> firstInt = iStream1.findFirst();
		System.out.println("�Ĥ@��Integer: "+firstInt.get());

		Stream<String> sStream1 = Stream.of("Bob", "jane", "Phil", "John", "betty");
		Optional<String> firstStr = sStream1.findFirst();
		System.out.println("�Ĥ@��String: "+firstStr.get());

		Stream<Integer> iStream2 = Stream.of(1, 2, 3, 4, 5);
		Optional<Integer> anyInt = iStream2.findAny();
		System.out.println("���@��Integer: "+anyInt.get());

		Stream<String> sStream2 = Stream.of("Bob", "jane", "Phil", "John", "betty");
		Optional<String> anyStr = sStream2.findAny();
		System.out.println("���@��String: "+anyStr.get());
	}
}
