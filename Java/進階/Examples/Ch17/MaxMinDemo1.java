import java.util.*;
import java.util.stream.*;
public class MaxMinDemo1 {
	public static void main(String[] args) {
		Stream<Person> pStream1 = Person.createList().stream();
		//Optional<Person> minPerson = pStream1.min((p1,p2)->p1.getAge()-p2.getAge());
		Optional<Person> minPerson = pStream1.min(Person::compareAgeTo);
		if(minPerson.isPresent())
			System.out.println("年紀最小:"+minPerson.get());

		Stream<Person> pStream2 = Person.createList().stream();
		//Optional<Person> maxPerson = pStream2.max((p1,p2)->p1.getName().length()-p2.getName().length());
		Optional<Person> maxPerson = pStream2.max(Person::compareNameLength);
		if(maxPerson.isPresent())
			System.out.println("名字最長:"+maxPerson.get());

	}
}
