import java.util.*;

public class ReduceDemo2 {

	public static void main(String[] args) {
		List<Person> persons = Person.createList();
		Person youngest = persons.stream().reduce((x, y) -> (x.getAge()<=y.getAge())?x:y).get();
		System.out.println("Youngest Person is : "+youngest);

		Person oldest = persons.stream().reduce((x, y) -> (x.getAge()>=y.getAge())?x:y).get();
		System.out.println("Oldest Person is : "+oldest);

		double totalAge = persons.stream().map(Person::getAge).reduce(0, (s, a)->(s+a));
		System.out.println("Average Age is : " + (totalAge/persons.size()));

	}

}