public class TestImmutable {
	public static void main(String[] args) {
		String s1 = "Java";
		s1 = s1.concat("SCJP");
		System.out.println(s1);
		String s2 = "Java";
		s2.concat("SCJP");
		System.out.println(s2);
		String s3 = "Java";
		s3 = s3.replace('J', 'I');
		System.out.println(s3);
		String s4 = "Java";
		s4.replace('J', 'I');
		System.out.println(s4);
	}
}