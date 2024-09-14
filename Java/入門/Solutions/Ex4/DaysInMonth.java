public class DaysInMonth{
	public static void main(String[] args){
		java.util.Scanner sc = new java.util.Scanner(System.in);
		System.out.print("輸入月份:");
		int month = sc.nextInt();
		int days = 0;
		switch(month){
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
				days = 31;
				break;
			case 4:
			case 6:
			case 9:
			case 11:
				days = 30;
				break;
			case 2:
				System.out.print("輸入年份:");
				int year = sc.nextInt();
				if((year%4==0&&year%100!=0)||year%400==0)
					days = 29;
				else
					days = 28;		
		}
		if(days!=0)
			System.out.println(month+"月有"+days+"天");
		else
			System.out.println("月份錯誤:"+month);
	}
}