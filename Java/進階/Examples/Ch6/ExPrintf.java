public class ExPrintf{
    public static void main(String[] args) {
		String name = args[0];
		int id = Integer.parseInt(args[1]);
		double salary = Double.parseDouble(args[2]);
		System.out.printf("姓名: %S%n員工編號: %05d%n薪水: %,9.2f元%n", name, id, salary);	
         
	}
}
