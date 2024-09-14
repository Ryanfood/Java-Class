import java.util.*;
public class NameComp implements Comparator<Student2> {
	public int compare(Student2 o1, Student2 o2){
		return o1.firstName.compareTo(o2.firstName);
	}
}
