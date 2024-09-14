public class Times{
	public static void main(String[] args){
		int years = 3;
		int months = years*12;
		int days = years*365;
		int hours = days*24;
		int minutes = hours*60;
		int seconds = minutes*60;
		long millSeconds = (long)seconds*1000;
		
		System.out.println(years+"年等於");
		System.out.println(months+"個月");
		System.out.println(days+"天");
		System.out.println(hours+"小時");
		System.out.println(minutes+"分鐘");
		System.out.println(seconds+"秒");
		System.out.println(millSeconds+"毫秒");
	}
}