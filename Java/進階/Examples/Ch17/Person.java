import java.util.*;

public class Person implements Comparable<Person>{
	private String name, email;
	private int age;
	private List<String> hobbies;
	public Person(String name, String email, int age, List<String> hobbies) {
		this.name = name;
		this.age = age;
		this.email = email;
		this.hobbies = hobbies;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public String getEmail() {
		return email;
	}
	public List<String> getHobbies() {
		return hobbies;
	}

	@Override
	public String toString() {
		return "Name=" + name + ", Age=" + age + ", email=" + email;
	}
	
	public static List<Person> createList() {
		List<Person> people = new ArrayList<>();
		people.add(new Person("Bob", "bob@gmail.com", 21, Arrays.asList("Piano", "Baseball", "Movie")));
		people.add(new Person("Jane", "jane@gmail.com", 34, Arrays.asList("Music", "Movie", "Swimming")));
		people.add(new Person("John", "john@gmail.com", 25, Arrays.asList("Music", "Baseball")));
		people.add(new Person("Phil", "phil@gmail.com", 65, Arrays.asList("Basketball", "Movie")));
		people.add(new Person("Betty", "betty@gmail.com", 55, Arrays.asList( "Swimming", "Piano", "Movie")));
		return people;
	}

	public static Person[] createArray() {
		List<Person> pl = createList();
		return pl.toArray(new Person[pl.size()]);
	}

	public int compareTo(Person p) {
		return this.getName().compareTo(p.getName());
	}
	
	public int compareAgeTo(Person p) {
		return new Integer(this.getAge()).compareTo(p.getAge());
	}

	public static int compareNameLength(Person a, Person b){
		return a.getName().length()-b.getName().length();
	}

}
