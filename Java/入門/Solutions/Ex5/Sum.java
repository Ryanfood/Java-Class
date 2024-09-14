public class Sum {
	public static void main(String[] args){
		java.util.Scanner sc = new java.util.Scanner(System.in);
		System.out.print("輸入最大值:");
		int maxNum = sc.nextInt();
		int sum = 0;
		for(int i=1; i<=maxNum; i++){
			sum += i;
		}
		System.out.println("1加到"+maxNum+"等於"+sum);
	}
}