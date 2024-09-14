import java.util.*;	
import java.util.function.*;
import java.util.stream.*;
public class SortedDemo1 {
	public static void main(String[] args) {
		Stream<String> sStream = Stream.of("Bob", "jane", "Phil", "John", "betty");
		List<String> sList = sStream.sorted(String::compareToIgnoreCase).collect(Collectors.toList());
		System.out.println("String串流自訂Comparator排序:"+sList);

		Stream<Person> pStream = Person.createList().stream();
		Function<Person, Integer> getNameLength = p->p.getName().length();
		Function<Person, Integer> getAge = Person::getAge; 
		Comparator<Person> comparator = Comparator.comparing(getNameLength)
												  .thenComparing(getAge)
			                                      .reversed();
		System.out.println("Person串流自訂Comparator排序: ");
		pStream.sorted(comparator).forEach(System.out::println);

	}
}
