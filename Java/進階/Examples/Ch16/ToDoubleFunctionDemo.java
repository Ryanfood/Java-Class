import java.util.List;
import java.util.function.ToDoubleFunction;

public class ToDoubleFunctionDemo {
    public static void main(String[] args) {
        List<Person> pl = Person.createList();
        Person first = pl.get(0);
		// 使用 Lambda Expression
        ToDoubleFunction<Person> toDoubleAge = p -> p.getAge();
		/* 使用 anonymous inner class:	
        ToDoubleFunction<Person> toDoubleAge = 
            new ToDoubleFunction<Person>() {
                public double applyAsDouble(Person p) {
                    return p.getAge();
                }
            };	
		*/
        System.out.println(toDoubleAge.applyAsDouble(first));
    }
}
