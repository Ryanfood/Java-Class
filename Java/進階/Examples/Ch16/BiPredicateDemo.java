import java.util.List;
import java.util.function.BiPredicate;

public class BiPredicateDemo {
    public static void main(String[] args) {
        List<Person> pl = Person.createList();
        Person first = pl.get(0);
        String testName = "john";
		// 使用 Lambda Expression
        BiPredicate<Person, String> nameBiPred = 
            (p, s) -> p.getName().equalsIgnoreCase(s);
		/* 使用 anonymous inner class:	
        BiPredicate<Person, String> nameBiPred = 
            new BiPredicate<Person, String>() {
                public boolean test(Person p, String s) {
                    return p.getName().equalsIgnoreCase(s);
                }
            };	
		*/
        System.out.println("Is the first john? " 
               + nameBiPred.test(first, testName));
    }
}
