import java.util.*;
public class GPAComp implements Comparator<Student2> {
	public int compare(Student2 o1, Student2 o2){
		if (o1.GPA == o2.GPA)
			return 0; //0 ��ܬ۵�
		else if(o1.GPA < o2.GPA)
			return -1;  //-1��ܤp��αƧǦb�e
		else
			return 1;   //+1��ܤj��αƧǦb��
		}
}
