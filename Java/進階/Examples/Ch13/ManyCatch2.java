public class ManyCatch2 {
	public static void main(String argv[]) {
		try {
			int i = Integer.parseInt(argv[0]);
			int ans = 10 / i;
		} catch (RuntimeException re) {
			System.err.println("RutimeException: "+re);
		} catch (ArithmeticException ae) {
			System.err.println("You must input a nonzero number!");
		} catch (NumberFormatException ne) {
			System.err.println("You must input a integer number!");
		} catch (Exception e) {
			System.err.println("Exception: "+e);
		}
	}
}
