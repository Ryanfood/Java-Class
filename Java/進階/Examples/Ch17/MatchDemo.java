import java.util.*;
import java.util.stream.*;
public class MatchDemo {
	public static void main(String[] args) {
		Stream<Integer> iStream1 = Stream.generate(() -> (int)(Math.random()*100)).limit(6);
		System.out.print("Integer﹃瑈1: ");
		boolean iResult1 = iStream1.peek(i->System.out.print(" "+i)).allMatch(i->i>10);
		System.out.println("\n┮Τ计常10: "+iResult1);

		Stream<String> sStream1 = Stream.of("Bob", "jane", "Phil", "John", "betty");
		boolean sResult1 = sStream1.allMatch(s->s.length()<6);
		System.out.println("┮Τ﹃А6: "+sResult1);

		Stream<Integer> iStream2 = Stream.generate(() -> (int)(Math.random()*100)).limit(6);
		System.out.print("\nInteger﹃瑈2: ");
		boolean iResult2 = iStream2.peek(i->System.out.print(" "+i)).anyMatch(i->i%5==0);
		System.out.println("\n计いΤ5计: "+iResult2);

		Stream<String> sStream2 = Stream.of("Bob", "jane", "Phil", "John", "betty");
		boolean sResult2 = sStream2.anyMatch(s->s.equals("Phil"));
		System.out.println("﹃いPhil: "+sResult2);

		Stream<Integer> iStream3 = Stream.generate(() -> (int)(Math.random()*100)).limit(6);
		System.out.print("\nInteger﹃瑈3: ");
		boolean iResult3 = iStream3.peek(i->System.out.print(" "+i)).noneMatch(i->i<10);
		System.out.println("\n⊿Τ10计: "+iResult3);

		Stream<String> sStream3 = Stream.of("Bob", "jane", "Phil", "John", "betty");
		boolean sResult3 = sStream3.noneMatch(s->s.equals("Phil"));
		System.out.println("﹃いぃPhil:: "+sResult3);
	}
}
