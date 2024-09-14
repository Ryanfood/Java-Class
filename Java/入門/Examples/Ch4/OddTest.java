public class OddTest {
	public static void main(String[] args) {
		java.util.Scanner scanner = 
		new java.util.Scanner(System.in);
		
		System.out.print("块俱计: ");
		int input = scanner.nextInt();

		if(input % 2 == 0) //狦緇计 0
			System.out.println(input + " 琌案计");

		if(input % 2 != 0) //狦緇计ぃ 0
			System.out.println(input + " 琌计");
		
	}
}
