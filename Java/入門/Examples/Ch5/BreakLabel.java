public class BreakLabel {
	public static void main(String[] args) {
		label1 : {
			for (int i = 0; i < 10; i++) {
				if(i==9){
					System.out.println("break label1");
					break label1;
				}
			}
			System.out.println("for迴圈之後執行");
		} //label1區塊結尾	
	}
}