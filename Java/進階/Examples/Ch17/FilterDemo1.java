import java.util.*;
import java.util.stream.*;
public class FilterDemo1 {
	public static void main(String[] args) {
		List<Person> persons = Person.createList();

		//for 迴圈迭代操作
		System.out.println("for 迴圈迭代操作:");
		for(Person p: persons) {
			if(p.getAge()<30){
				System.out.println(p);
			}
		}

		// 串流方法逐步操作
		System.out.println("串流方法逐步操作:");
		Stream<Person> stream = persons.stream(); //轉換為串流物件
		Stream<Person> youngStream = stream.filter(p -> p.getAge()<30); //中間操作:過濾
		youngStream.forEach(p -> System.out.println(p)); //終端操作:forEach

	}
}
