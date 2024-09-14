import java.io.*;
public class ManyCatch1 {
	public static void main(String argv[]) {
		try {
			int i = Integer.parseInt(argv[0]);
			int ans = 10 / i;
			System.out.println("Ans = " + ans);
		} catch (ArithmeticException ae) {
			System.err.println("You must input a nonzero number!");
		} catch (RuntimeException re) {
			System.err.println("RuntimeException: " + re);
		}

	}
}
