public class TestArgs {
	public static void main(String[] args) {
		System.out.println("Total is: " + (args[0]+args[1]));
		int arg0 = Integer.parseInt(args[0]);
		int arg1 = Integer.parseInt(args[1]);
		System.out.println("Total is: " + (arg0+arg1));
	}
}
