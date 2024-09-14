public class WhileDemo {
	public static void main(String[] args) {
		java.util.Scanner scanner = 
			new java.util.Scanner(System.in);
		
		System.out.print("輸入執行次數: ");
		int input = scanner.nextInt();

		int count = 0; //計數用

		while(count < input){ //判斷次數
			System.out.println("Hello World!");
			count++; //每次執行後遞增
		}
	}
}
