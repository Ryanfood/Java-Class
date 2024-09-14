import java.util.*;
public class TreeSetExample {
	public static void main(String[] args) {
	SortedSet ts = new TreeSet();
		ts.add("SCWCD");
		ts.add("SCJP");
		ts.add("SCBCD");
		ts.add("SCMAD");
		ts.add("SCJP");
		System.out.println("原始的SortedSet元素資料");
		System.out.println(ts);
		SortedSet sub_ts = ts.subSet("SCJP", "SCMAD");
		System.out.println("利用subSet()方法取出部分集合元素");
		System.out.println(sub_ts);
	}
}
