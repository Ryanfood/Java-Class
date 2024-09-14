public class DateThree {
    private int day;
    private int month;
    private int year;
    
    public int getDay(){
        return day;
    }    
    public void setDay(int d){
        if(d>=1&&d<=31){
            day =d;
        } else {
            System.out.println("設定失敗!日期錯誤:"+d);
        }
    }    
    public int getMonth(){
        return month;
    }    
    public void setMonth(int m){
        if(m>=1&&m<=12){
            month = m;
        } else {
            System.out.println("設定失敗!月份錯誤:"+m);
        }
    }    
    public int getYear(){
        return year;
    }    
    public void setYear(int y){
        if(y>=2000){
            year =y;
        } else {
            System.out.println("設定失敗!年度錯誤:"+y);
        }
    }
}
