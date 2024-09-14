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

		System.out.print("�ϥ�stream()�غc int��y:");
		i1.forEach(i -> System.out.print(" "+i));
		System.out.print("\n�ϥ�stream()�غc String��y:");
		s1.forEach(s -> System.out.print(" "+s));
		System.out.println("\n�ϥ�stream()�غc Person��y:");
		p1.forEach(p -> System.out.println(" "+p));

		System.out.print("\n�ϥ�Stream.of()�غc int��y:");
		i2.forEach(i -> System.out.print(" "+i));
		System.out.print("\n�ϥ�Stream.of()�غc String��y:");
		s2.forEach(s -> System.out.print(" "+s));
		System.out.println("\n�ϥ�Stream.of()�غc Person��y:");
		p2.forEach(p -> System.out.println(" "+p));

		System.out.print("\n�ϥ�Arrays.stream()�غc int��y:");
		i3.forEach(i -> System.out.print(" "+i));
		System.out.print("\n�ϥ�Arrays.stream()�غc String��y:");
		s3.forEach(s -> System.out.print(" "+s));
		System.out.println("\n�ϥ�Arrays.stream()�غc Person��y:");
		p3.forEach(p -> System.out.println(" "+p));

	}

}
