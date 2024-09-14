import java.util.*;
public class LambdaExample2 {
	public static void printList(List studentList){
		for(Object obj : studentList){
			Student s = (Student) obj;
			System.out.println("ID="+s.studentID() + ", GPA="+s.GPA() +
							   ", Name=" + s.firstName() + " " + s.lastName());
		}
		System.out.println();
	}
	public static void main(String[] args) {
		List studentList = new ArrayList();	
		studentList.add(new Student("Mike", "Hauffmamn", 101, 4.0));
		studentList.add(new Student("John", "Lynn", 102, 2.8));
		studentList.add(new Student("Jim", "Max", 103, 3.6));
		studentList.add(new Student("Kelly", "Grant", 104, 2.3));
		Collections.sort(studentList);
		printList(studentList);
		
		Comparator c = new NameComp();
		Collections.sort(studentList, c);
		printList(studentList);

		Collections.sort(studentList, (s1, s2) -> ((Student)s1).studentID()-((Student)s2).studentID());
		printList(studentList);
	}
}
