public class ScoreLevel {
	public static void main(String[] args) {
		java.util.Scanner scanner = 
		new java.util.Scanner(System.in);
		
		System.out.print("輸入分數: ");
		int score = scanner.nextInt();

		if(score >= 90)
			System.out.print("得 A ");
		else if(score >= 80 && score < 90)
			System.out.print("得 B ");
		else if(score >= 70 && score < 80)
			System.out.print("得 C ");
		else if(score >= 60 && score < 70)
			System.out.print("得 D ");
		else 
			System.out.print("得 E(不及格)");
	}
}
