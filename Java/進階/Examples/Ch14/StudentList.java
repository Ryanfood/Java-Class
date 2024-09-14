import java.util.*;
public class StudentList {
	public static void main(String[] args) {
		TreeSet<Student> studentSet = new TreeSet<>();
		studentSet.add(new Student("Mike", "Hauffmamn", 101, 4.0));
		studentSet.add(new Student("John", "Lynn", 102, 2.8));
		studentSet.add(new Student("Jim", "Max", 103, 3.6));
		studentSet.add(new Student("Kelly", "Grant", 104, 2.3));

		for(Student student : studentSet){
			System.out.println( "Name = "  + student.firstName() +
								"  " + student.lastName()  + 
								" ID = " + student.studentID() +
								" GPA = " + student.GPA());
		}
	}
}
