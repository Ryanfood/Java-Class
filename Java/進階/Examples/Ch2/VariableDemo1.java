public class VariableDemo1 {
	public static void main(String[] args) {
		int age;
		final char gender = 'M';
		System.out.print("年齡:");
		System.out.println(age);
		System.out.print("性別:");
		System.out.println(gender);

		age = 20;
		gender = 'F';
		System.out.print("年齡:");
		System.out.println(age);
		System.out.print("性別:");
		System.out.println(gender);
	}
}
