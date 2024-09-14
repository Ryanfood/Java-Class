public class ConditionalDemo {
	public static void main(String[] args) {
		int i = 2;
		int j = 3;
		int k = 4;

		System.out.println("變數值...");
		System.out.println(" i = " + i);
		System.out.println(" j = " + j);
		System.out.println(" k = " + k);

		//&&運算
		System.out.println("且...");
		System.out.println(" i<j 且 j<k "+((i<j)&&(j<k)));

		//||運算
		System.out.println("或...");
		System.out.println(" i<j 或 k>j "+((i<j)||(k<j)));

		//&&運算
		System.out.println("非...");
		System.out.println(" i<j 的非 "+(!(i<j)));

	}
}
