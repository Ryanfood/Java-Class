import java.util.*;
import java.util.function.*;
import java.util.stream.*;
public class FlatMapDemo1 {
	public static void main(String[] args) {
		Stream<Integer> iStream = Stream.of(1, 2, 3, 4, 5);
		Function<Integer, Stream<Integer>> iMapper = i -> Stream.of(i, 2*i, i*i);
		List<Integer> iList = iStream.flatMap(iMapper).collect(Collectors.toList());
		System.out.println("Integer串流flatMap()轉換: "+iList);

		Stream<String> sStream = Stream.of("Bob", "jane", "Phil", "John", "betty");
		List<String> sList = sStream.flatMap(s->Stream.of("Hi "+s, s.toUpperCase(), s.toLowerCase()))
			                        .collect(Collectors.toList());
		System.out.println("String串流flatMap()轉換: "+sList);

		Stream<Person> pStream = Person.createList().stream();
		List<String> hobbyList = pStream.map(Person::getHobbies)
			                            .flatMap(List::stream)
			                            .distinct().sorted()
			                            .collect(Collectors.toList());
		System.out.println("Person嗜好串流 flatMap()轉換: "+hobbyList);
	}
}
