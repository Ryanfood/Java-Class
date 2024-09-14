public class CharTriangle {
	public static void main(String[] args){
		java.util.Scanner sc = new java.util.Scanner(System.in);
		System.out.print("輸入三角形層數:");
		int maxLevel = sc.nextInt();
		for(int l=1; l<=maxLevel; l++){
			for(int i=0; i<maxLevel-l; i++)
				System.out.print(" ");
			char c = (char)('A'+l-1);
			for(int j=0; j<2*l-1; j++)
				System.out.print(c);
			System.out.println();
		}
	}
}