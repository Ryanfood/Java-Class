public class ExPrintf{
    public static void main(String[] args) {
		String name = args[0];
		int id = Integer.parseInt(args[1]);
		double salary = Double.parseDouble(args[2]);
		System.out.printf("�m�W: %S%n���u�s��: %05d%n�~��: %,9.2f��%n", name, id, salary);	
         
	}
}
