import java.util.*;
import java.util.function.Consumer;
public class ForEachDemo1{
	public static void main(String[] args) {
		List<Person> persons = Person.createList();
		// for迴圈迭代操作 Person
		System.out.println("for 迴圈迭代操作 Person:");
		for(Person p: persons) {
			System.out.println(p.getName()); 
		}
		
		//匿名類別進行 forEach()串流操作
		System.out.println("匿名類別串流操作:");
		persons.forEach(new Consumer<Person>() {
			public void accept(Person p) {
				System.out.println(p.getEmail());
			}
		});

		// Lambda Express進行forEach()串流操作
		System.out.println("Lambda 串流操作:");
		persons.forEach(p -> System.out.println(p));
	}
}
