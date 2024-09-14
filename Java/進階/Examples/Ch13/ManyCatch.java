import java.io.*;
public class ManyCatch {
	public static void main(String argv[]) {
		try {
			int i = Integer.parseInt(argv[0]);
			int ans = 10 / i;
			System.out.println("ans = " + ans);
		} catch (ArithmeticException ae) {
			System.err.println("You must input a nonzero number!");
		} catch (NumberFormatException ne) {
			System.err.println("You must input a integer number!");
		} catch (ArrayIndexOutOfBoundsException re) {
			System.err.println("You do not input a number!");
		} 

	}
}
