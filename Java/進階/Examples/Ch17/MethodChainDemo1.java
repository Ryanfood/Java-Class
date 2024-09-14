import java.util.*;
import java.util.function.*;
public class MethodChainDemo1 {
	public static void main(String[] args) {
		List<Person> persons = Person.createList();

		// 串流方法鏈接操作
		System.out.println("串流方法鏈接操作:");
		persons.stream().filter(p -> p.getAge()>30).forEach(p -> System.out.println(p));

		// 將Lambda 表示式宣告為物件變數進行鏈接呼叫
		System.out.println("物件變數鏈接呼叫:");
		Predicate<Person> criteria = p -> p.getAge()>30;
		Consumer<Person> action = p -> System.out.println(p);
		persons.stream().filter(criteria).forEach(action);
	}
}
