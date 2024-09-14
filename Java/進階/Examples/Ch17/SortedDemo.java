import java.util.*;
import java.util.stream.*;
public class SortedDemo {
	public static void main(String[] args) {
		Stream<Integer> iStream1 = Stream.of(86,66,26,95,87,17,1,21,58,51);
		List<Integer> iList1 = iStream1.sorted().collect(Collectors.toList());
        System.out.println("Integer��y�۵M�Ƨ�:"+iList1);

		Stream<String> sStream1 = Stream.of("Bob", "jane", "Phil", "John", "betty");
		List<String> sList1 = sStream1.sorted().collect(Collectors.toList());
		System.out.println("String��y�۵M�Ƨ�:"+sList1);

		Stream<Person> pStream1 = Person.createList().stream();
		System.out.println("Person��y�۵M�Ƨ�: ");
		pStream1.sorted().forEach(System.out::println);

		Stream<Integer> iStream2 = Stream.of(86,66,26,95,87,17,1,21,58,51);
		List<Integer> iList2 = iStream2.sorted((i1,i2)->i2.compareTo(i1)).collect(Collectors.toList());
        System.out.println("\nInteger��y�ۭq�Ƨ�:"+iList2);

		Stream<String> sStream2 = Stream.of("Bob", "jane", "Phil", "John", "betty");
		List<String> sList2 = sStream2.sorted((s1,s2)->s1.compareToIgnoreCase(s2)).collect(Collectors.toList());
		System.out.println("String��y�ۭq�Ƨ�:"+sList2);

		Stream<Person> pStream2 = Person.createList().stream();
		System.out.println("Person��y�ۭq�Ƨ�: ");
		pStream2.sorted((p1,p2)->p1.compareAgeTo(p2)).forEach(System.out::println);

	}
}
