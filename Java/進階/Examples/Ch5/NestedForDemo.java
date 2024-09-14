public class NestedForDemo {
	public static void main(String[] args) {
		java.util.Scanner scanner = 
			new java.util.Scanner(System.in);
		
		System.out.print("輸入長: ");
		int length = scanner.nextInt();

		System.out.print("輸入寬: ");
		int width = scanner.nextInt();

		for (int i = width; i > 0; i-- ) {
			for(int j = length; j > 0; j--){
				System.out.print("@");
			} //內層 for
		
			System.out.println(); //換行
		} //外層 for
	}
}
