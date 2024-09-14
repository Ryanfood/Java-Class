import java.util.*;
import java.util.function.*;
public class MethodChainDemo1 {
	public static void main(String[] args) {
		List<Person> persons = Person.createList();

		// ��y��k�챵�ާ@
		System.out.println("��y��k�챵�ާ@:");
		persons.stream().filter(p -> p.getAge()>30).forEach(p -> System.out.println(p));

		// �NLambda ��ܦ��ŧi�������ܼƶi���챵�I�s
		System.out.println("�����ܼ��챵�I�s:");
		Predicate<Person> criteria = p -> p.getAge()>30;
		Consumer<Person> action = p -> System.out.println(p);
		persons.stream().filter(criteria).forEach(action);
	}
}
