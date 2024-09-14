public class OddTest3 {
	public static void main(String[] args) {
		java.util.Scanner scanner = 
		new java.util.Scanner(System.in);
		
		System.out.print("块俱计: ");
		int input = scanner.nextInt();
		
		int remain = input % 2;

		System.out.println(input + " 琌" +
			((remain==0) ? "案计" : "计"));	
	}
}