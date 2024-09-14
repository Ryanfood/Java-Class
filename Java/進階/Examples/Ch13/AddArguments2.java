public class AddArguments2{
    public static void main(String[] args) {
        try {
			int sum = 0;
			for(int i=0; i<4; i++){
				sum += Integer.parseInt(args[i]);
			}
			System.out.println("sum = " + sum);
        } catch (NumberFormatException nfe) {
			System.err.println("One of the command-line "
				+ "argument is not an integer.");
        }
		System.out.println("End of Program!");
    }
}
