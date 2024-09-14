import java.util.*;
import java.util.stream.*;
public class SequentialParallelDemo2 {
	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		List<String> hobbies = Person.createList()
			                         .stream()
									 .map(Person::getHobbies)
			                         .flatMap(List::stream)
									 .distinct()
		                             .collect(Collectors.toList());
		long end = System.currentTimeMillis();
		System.out.println("Sequential getHobbies:"+(end-start));
		System.out.println("Hobbies: "+hobbies);

		start = System.currentTimeMillis();
		hobbies = Person.createList().parallelStream()
									 .map(Person::getHobbies)
			                         .flatMap(List::stream)
									 .distinct()
		                             .collect(Collectors.toList());
		end = System.currentTimeMillis();
		System.out.println("Parallel getHobbies:"+(end-start));
		System.out.println("Hobbies: "+hobbies);
	}
}
