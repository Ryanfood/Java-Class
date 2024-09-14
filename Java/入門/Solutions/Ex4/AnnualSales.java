public class AnnualSales {
	public static void main(String[] args){
		java.util.Scanner sc = new java.util.Scanner(System.in);
		System.out.print("消費金額: ");
		int amount = sc.nextInt();
		int payment = 0;
		if(amount<=0){
			System.out.println("消費金額錯誤!");
			return;
		} else if(amount<2000)
			payment = (int)(amount*0.9);
		else if(amount<3000)
			payment = (int)(amount*0.85);
		else if(amount<5000)
			payment = (int)(amount*0.8);
		else
			payment = (int)(amount*0.7);
		System.out.println("折扣後金額為:"+payment+"元");
		
	}
}