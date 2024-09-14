public class DoWhileDemo {
	public static void main(String[] args) {
		java.util.Scanner scanner = 
			new java.util.Scanner(System.in);

		int answer =30;
		int input = 0;		
		do{
			System.out.print("輸入數字: ");
			input = scanner.nextInt();
		} while(input!=answer);

		System.out.println("恭喜您!猜對了!");
	}
}
