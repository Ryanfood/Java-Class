public class MyDate {
	private int year = 2000;
	private int month = 1;
	private int day = 1;

	public MyDate(int day, int month, int year ) {
		this.day = day;
		this.month = month;
		this.year = year;     
	}

	public MyDate(int day, int month) {
		this(day, month, 2013);
	}
	
	public MyDate(int day) {
		this(day, 5);
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
