import java.util.*;
import java.util.stream.*;
public class FilterDemo1 {
	public static void main(String[] args) {
		List<Person> persons = Person.createList();

		//for �j�魡�N�ާ@
		System.out.println("for �j�魡�N�ާ@:");
		for(Person p: persons) {
			if(p.getAge()<30){
				System.out.println(p);
			}
		}

		// ��y��k�v�B�ާ@
		System.out.println("��y��k�v�B�ާ@:");
		Stream<Person> stream = persons.stream(); //�ഫ����y����
		Stream<Person> youngStream = stream.filter(p -> p.getAge()<30); //�����ާ@:�L�o
		youngStream.forEach(p -> System.out.println(p)); //�׺ݾާ@:forEach

	}
}
