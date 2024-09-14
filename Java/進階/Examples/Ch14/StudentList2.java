import java.util.*;
public class StudentList2 {
	public static void main(String[] args) {
		Comparator<? super Student2> c = new NameComp();
		TreeSet<Student2> studentSet = new TreeSet<>(c);
		studentSet.add(new Student2("Mike", "Hauffmamn", 101, 4.0));
		studentSet.add(new Student2("John", "Lynn", 102, 2.8));
		studentSet.add(new Student2("Jim", "Max", 103, 3.6));
		studentSet.add(new Student2("Kelly", "Grant", 104, 2.3));

		for(Student2 s2 : studentSet){
			System.out.println( "Name = "+s2.firstName()+
								" "+s2.lastName()+
								" ID = "+s2.studentID()+
								" GPA = "+s2.GPA());
		}		
	}
}
