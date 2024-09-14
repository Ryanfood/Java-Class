public class Student implements Comparable {
	String firstName, lastName;
	int studentID=0;
	double GPA = 0.0;
	public Student(String first, String last, int ID, double gpa){
		this.firstName = first;
		this.lastName = last;
		this.studentID = ID;
		this.GPA = gpa;
	}	
	public String firstName() {  return firstName;  }
	public String lastName() {  return lastName;  }
	public int studentID() {  return studentID;  }
	public double GPA() {  return GPA;  }
	public int compareTo(Object o){
		double f = GPA -((Student)o).GPA();
		if ((f==0))
			return 0; //0 ��ܬ۵�
		else if(f < 0)
			return -1;  //-1��ܤp��αƧǦb�e
		else
			return 1;   //+1��ܤj��αƧǦb��
	}
}