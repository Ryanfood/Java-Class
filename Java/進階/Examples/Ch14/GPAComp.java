import java.util.*;
public class GPAComp implements Comparator<Student2> {
	public int compare(Student2 o1, Student2 o2){
		if (o1.GPA == o2.GPA)
			return 0; //0 表示相等
		else if(o1.GPA < o2.GPA)
			return -1;  //-1表示小於或排序在前
		else
			return 1;   //+1表示大於或排序在後
		}
}
