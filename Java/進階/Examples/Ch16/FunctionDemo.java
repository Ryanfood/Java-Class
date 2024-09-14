import java.util.function.Function;
import java.util.List;

public class FunctionDemo {
    public static void main(String[] args) {
        List<Person> pl = Person.createList();
        Person first = pl.get(0);
		// �ϥ� Lambda Expression
		Function<Person, String> getNameFromPerson = p -> p.getName();
		/* �ϥ� anonymous inner class:	
        Function<Person, String> getNameFromPerson = 
            new Function<Person, String>() {
                public String apply(Person p) {
                    return p.getName();
                }
        };	
		*/
        System.out.println("First Person");
        System.out.println(getNameFromPerson.apply(first));
    }
}
