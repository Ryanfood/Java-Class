import java.util.*;
import java.util.stream.*;
public class IntermediateOperation {
	public static void main(String[] args) {
		Stream<Integer> iStream = Stream.generate(() -> (int)(Math.random()*100));
		System.out.print("Integer串流filter():");
		List<Integer> iList = iStream.limit(10).peek(i -> System.out.print(" "+i))
							         .filter(i->i%2==0).collect(Collectors.toList());
		System.out.println("\n列表:"+iList);

		Stream<String>  sStream = Stream.of("Bob", "Jane", "John", "Phil", "John", "Betty", "Bob");
		System.out.print("\nString串流distinct():");
		long count = sStream.peek(s->System.out.print("\n"+s)).distinct().peek(System.out::print)
							.count();
		System.out.println("\n不重複字串個數:"+count);
		
		Stream<Person>  pStream = Person.createList().stream();
		System.out.print("\nPerson串流skip():");
		pStream.peek(p -> System.out.print("\n"+p.getName())).skip(2)
			   .forEach(p->System.out.print(" "+p.getAge()));
	}
}
