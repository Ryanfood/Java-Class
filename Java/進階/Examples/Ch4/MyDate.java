public class MyDate {
	private int day;
	private int month;
	private int year; 
	public void setDate(int d, int m, int y) {
		day=d; 
		month=m; 
		year=y;
	}
	public int getYear(){
		return year;
	}
	public int getMonth(){
		return month;
	}
	public int getDay(){
		return day;
	}
	public String getDate() {
		return day + "/" + month + "/" + year;
	}
}
