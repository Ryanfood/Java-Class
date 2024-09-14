public class TestMyDate {
	public static void main(String[] args) {
		MyDate d1 = new MyDate (27);
		MyDate d2 = new MyDate (28, 4);
		MyDate d3 = new MyDate (29, 3, 2012);
		System.out.println("d1=" + d1.getDate());
		System.out.println("d2=" + d2.getDate());
		System.out.println("d3=" + d3.getDate());
	}
}
