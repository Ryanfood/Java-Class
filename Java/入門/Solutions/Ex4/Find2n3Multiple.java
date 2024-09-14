public class Find2n3Multiple {
	public static void main(String[] args){
		java.util.Scanner sc = new java.util.Scanner(System.in);
		System.out.print("块俱计: ");
		int num = sc.nextInt();
		System.out.print(num);
		if(num%2==0){
			System.out.print("琌2计");
			if(num%3==0)				
				System.out.print(",琌3计");
		} else {
			if(num%3==0)				
				System.out.print("琌3计");
			else				
				System.out.print("ぃ琌2计ぃ琌3计");	
		}
		System.out.println();
	}
}