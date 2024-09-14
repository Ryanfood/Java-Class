import java.util.*;
import java.util.stream.*;
public class MaxMinDemo {
	public static void main(String[] args) {
		Stream<Integer> iStream1 = Stream.generate(() -> (int)(Math.random()*100)).limit(10);
		System.out.print("Integer��y1: ");
		Optional<Integer> maxInt = iStream1.peek(i->System.out.print(" "+i)).max(Integer::compareTo);
		System.out.println("\n�̤j��: "+maxInt.get());
		Stream<Integer> iStream2 = Stream.generate(() -> (int)(Math.random()*100)).limit(10);
		System.out.print("Integer��y2: ");
		Optional<Integer> minInt = iStream2.peek(i->System.out.print(" "+i)).min(Integer::compareTo);
		System.out.println("\n�̤p��: "+minInt.get());

		Stream<String> sStream1 = Stream.of("Bob", "jane", "Phil", "John", "betty");
		Optional<String> maxStr = sStream1.max(String::compareTo);
		System.out.println("String��y�̤j��: "+maxStr.get());
		Stream<String> sStream2 = Stream.of("Bob", "jane", "Phil", "John", "betty");
		Optional<String> minStr = sStream2.min(String::compareToIgnoreCase);
		System.out.println("String��y�̤p��: "+minStr.get());

	}
}
