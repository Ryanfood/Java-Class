import java.util.*;
import java.util.function.Consumer;
public class ForEachDemo1{
	public static void main(String[] args) {
		List<Person> persons = Person.createList();
		// for�j�魡�N�ާ@ Person
		System.out.println("for �j�魡�N�ާ@ Person:");
		for(Person p: persons) {
			System.out.println(p.getName()); 
		}
		
		//�ΦW���O�i�� forEach()��y�ާ@
		System.out.println("�ΦW���O��y�ާ@:");
		persons.forEach(new Consumer<Person>() {
			public void accept(Person p) {
				System.out.println(p.getEmail());
			}
		});

		// Lambda Express�i��forEach()��y�ާ@
		System.out.println("Lambda ��y�ާ@:");
		persons.forEach(p -> System.out.println(p));
	}
}
