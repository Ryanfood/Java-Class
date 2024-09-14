public class TestStringBuffer {
	public static void main(String[] args) {
		StringBuffer sb1 = new StringBuffer("Hi");
		sb1.append(" Java!");
		System.out.println(sb1.toString());

		StringBuffer sb2 = new StringBuffer("This is a dog");
		sb2.insert(10, "big ");
		System.out.println(sb2.toString());

		StringBuffer sb3 = new StringBuffer("Hi Java");
		System.out.println(sb1.equals(sb3));

	}
}
