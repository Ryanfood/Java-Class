public class BreakDemo {
	public static void main(String[] args) {
		java.util.Scanner scanner = 
			new java.util.Scanner(System.in);
		
		int score = 0;
		int sum = 0;
		int count = -1;

		while(true){
			count++;
			sum += score;
			System.out.print("輸入分數(輸入-1結束):");
			score = scanner.nextInt();

			if(score == -1)
				break;
		}
		System.out.println("平均分數:" + (double)sum/count);
	}
}