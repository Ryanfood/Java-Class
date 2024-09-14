import java.util.*;

public class Person2 implements Comparable<Person2>{
	private String name, email;
	private int age;
	private List<String> hobbies;
	private Person2(Builder builder){
		this.name = builder.name;
		this.age = builder.age;
		this.email = builder.email;
		this.hobbies = builder.hobbies;
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
	public void addHobby(String hobby){
		this.hobbies.add(hobby);	
	}
	public static class Builder {
		private String name = "", email = "";
		private int age = 0;
		private List<String> hobbies = new ArrayList<>();
		public Builder name(String name) {
			this.name = name;
			return this;
		}
		public Builder age(int val) {
			this.age = val;
			return this;
		}
		public Builder email(String val) {
			this.email = val;
			return this;
		}
		public Builder hobby(String hobby) {
			this.hobbies.add(hobby);
			return this;
		}
		public Person2 build() {
			return new Person2(this);
		}
	}

	@Override
	public String toString() {
		return "Name=" + name + ", Age=" + age + ", email=" + email;
	}
	
	public static List<Person2> createList() {
		List<Person2> people = new ArrayList<>();
		people.add(new Builder().name("Bob").email("bob@gmail.com").age(21)
					.hobby("Piano").hobby("Baseball").hobby("Movie").build());
		people.add(new Builder().name("Jane").email("jane@gmail.com").age(34)
					.hobby("Music").hobby("Movie").hobby("Swimming").build());
		people.add(new Builder().name("John").email("john@gmail.com").age(25)
					.hobby("Music").hobby("Baseball").build());
		people.add(new Builder().name("Phil").email("phil@gmail.com").age(65)
					.hobby("Basketball").hobby("Movie").build());
		people.add(new Builder().name("Betty").email("betty@gmail.com").age(55)
					.hobby("Swimming").hobby("Piano").hobby("Movie").build());
		return people;
	}

	public static Person2[] createArray() {
		List<Person2> pl = createList();
		return pl.toArray(new Person2[pl.size()]);
	}

	public int compareTo(Person2 p) {
		return this.getName().compareTo(p.getName());
	}
	
	public int compareAgeTo(Person2 p) {
		return new Integer(this.getAge()).compareTo(p.getAge());
	}

	public static int compareNameLength(Person2 a, Person2 b){
		return a.getName().length()-b.getName().length();
	}

}
