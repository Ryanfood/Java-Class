import java.util.List;
import java.util.function.UnaryOperator;

public class UnaryOperatorDemo {
	public static void main(String[] args) {
		List<Person> pl = Person.createList();
		Person first = pl.get(0);
		// 使用 Lambda Expression
		UnaryOperator<String> upperStr = s -> s.toUpperCase();
		/* 使用 anonymous inner class:
		UnaryOperator<String> upperStr = new UnaryOperator<String>() {
			public String apply(String s) {
				return s.toUpperCase();
			}
		};	
		*/
		System.out.println("Before: " + first.getName());
		System.out.println("After: " + upperStr.apply(first.getName()));
	}
}
