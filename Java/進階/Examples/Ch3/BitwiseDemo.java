public class BitwiseDemo {
	public static void main(String[] args) {
		int i = 13;
		int j = 12;
		
		System.out.println("變數值...");
		System.out.println(" i = " + i);
		System.out.println(" j = " + j);
		
		System.out.println("位元運算...");
		System.out.println(" i&j = " + (i&j));
		System.out.println(" i|j = " + (i|j));
		System.out.println(" i^j = " + (i^j));
		System.out.println(" ~i = " + (~i));
	}
}
