import java.util.*;
import java.util.stream.*;
public class CreateStreamDemo {
	public static void main(String[] args) {
		Person[] persons = Person.createArray();
		Stream<Integer> i1 = Arrays.asList(1, 2, 3, 4).stream();
		Stream<String>  s1 = Arrays.asList("Bob", "Jane", "John", "Phil", "Betty").stream();
		Stream<Person>  p1 = Person.createList().stream();
		
		Stream<Integer> i2 = Stream.of(1, 2, 3, 4);
		Stream<String>  s2 = Stream.of("Bob", "Jane", "John", "Phil", "Betty");
		Stream<Person>  p2 = Stream.of(persons[0], persons[1], persons[2], persons[3], persons[4]);

		Stream<Integer> i3 = Arrays.stream(new Integer[] {1, 2, 3, 4});
		Stream<String>  s3 = Arrays.stream(new String[]{"Bob", "Jane", "John", "Phil", "Betty"});
		Stream<Person>  p3 = Arrays.stream(persons);

		System.out.print("使用stream()建構 int串流:");
		i1.forEach(i -> System.out.print(" "+i));
		System.out.print("\n使用stream()建構 String串流:");
		s1.forEach(s -> System.out.print(" "+s));
		System.out.println("\n使用stream()建構 Person串流:");
		p1.forEach(p -> System.out.println(" "+p));

		System.out.print("\n使用Stream.of()建構 int串流:");
		i2.forEach(i -> System.out.print(" "+i));
		System.out.print("\n使用Stream.of()建構 String串流:");
		s2.forEach(s -> System.out.print(" "+s));
		System.out.println("\n使用Stream.of()建構 Person串流:");
		p2.forEach(p -> System.out.println(" "+p));

		System.out.print("\n使用Arrays.stream()建構 int串流:");
		i3.forEach(i -> System.out.print(" "+i));
		System.out.print("\n使用Arrays.stream()建構 String串流:");
		s3.forEach(s -> System.out.print(" "+s));
		System.out.println("\n使用Arrays.stream()建構 Person串流:");
		p3.forEach(p -> System.out.println(" "+p));

	}

}
