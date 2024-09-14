import java.util.*;
import java.util.function.*;
import java.util.stream.*;
public class MapDemo {
	public static void main(String[] args) {
		Stream<Integer> iStream = Stream.of(1, 2, 3, 4, 5);
		Function<Integer, Integer> iMapper = i -> i*i;
		List<Integer> iList = iStream.map(iMapper).collect(Collectors.toList());
		System.out.println("Integer��ymap()�ഫ: "+iList);

		Stream<String> sStream = Stream.of("Bob", "jane", "Phil", "John", "betty");
		List<String> sList = sStream.map(s->"Hi "+s.toUpperCase()).collect(Collectors.toList());
		System.out.println("String��ymap()�ഫ: "+sList);

		Stream<Person> pStream = Person.createList().stream();
		List<String> emailList = pStream.map(Person::getEmail).collect(Collectors.toList());
		System.out.println("Person��ymap()�ഫ: "+emailList);
	}
}
