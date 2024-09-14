public class TestMyDate {
	public static void main(String args[]) {
		MyDate d = new MyDate();
		/*
		d.day = 30;
		d.month = 2;
		d.year = 2003;

		System.out.println(d.day+"/"+d.month+"/"+d.year);
		*/

		d.setDate(28,2,2003);

		System.out.println("Date: " + d.getDate());
	}
}
