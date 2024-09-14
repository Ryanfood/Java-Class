public class Sum {
	public static void main(String[] args){
		java.util.Scanner sc = new java.util.Scanner(System.in);
		
		System.out.print("整數一: ");
		int num1 = sc.nextInt();
		System.out.print("整數二: ");
		int num2 = sc.nextInt();
		
		System.out.println(num1+" + "+num2+" = "+(num1+num2));
	}
}