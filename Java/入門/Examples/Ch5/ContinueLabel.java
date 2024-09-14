public class ContinueLabel {
    public static void main(String[] args) {
		label1:
		for (int i = 0; i < 5; i++) {
			System.out.println();
			label2:
			for (int j = 0; j < 5; j++) {
				if(j==3)
					continue label1;
				System.out.println("(i,j) = ("+i+","+j+")");
			}
		}
		
	}
}