public class FSequence {
	public static void main(String[] args){
		java.util.Scanner sc = new java.util.Scanner(System.in);
		System.out.print("¿é¤J³Ì¤j­È:");
		int max = sc.nextInt();
		int num1=1, num2=1, numNext=num1+num2;
		System.out.print(num1+" "+num2);
		while(numNext<max){
			System.out.print(" "+numNext);
			num1 = num2;
			num2 = numNext;
			numNext = num1+num2;
		}
		
		
	
	}
}