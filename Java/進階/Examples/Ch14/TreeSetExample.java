import java.util.*;
public class TreeSetExample {
	public static void main(String[] args) {
	SortedSet ts = new TreeSet();
		ts.add("SCWCD");
		ts.add("SCJP");
		ts.add("SCBCD");
		ts.add("SCMAD");
		ts.add("SCJP");
		System.out.println("��l��SortedSet�������");
		System.out.println(ts);
		SortedSet sub_ts = ts.subSet("SCJP", "SCMAD");
		System.out.println("�Q��subSet()��k���X�������X����");
		System.out.println(sub_ts);
	}
}
