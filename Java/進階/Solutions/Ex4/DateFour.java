public class DateFour {
    private int day;
    private int month;
    private int year;
    
    public String getDate(){
        if(day==0||month==0||year==0)
            return "日期未設定!";
        return year+"/"+month+"/"+day;
    }
    
    public void setDate(int year, int month, int day){
        if(month>=1&&month<=12){
            if(day>=1 && day <= getDaysInMonth(year, month)){
                this.day = day;
                this.month = month;
                this.year = year;
            } else {
                System.out.println("日期錯誤!");
            }
        } else {
            System.out.println("月份錯誤!");
        }
    }
    
    private int getDaysInMonth(int year, int month){
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
                if(isLeapYear(year)){
                    days = 29;
                } else {
                    days = 28;
                }
                break;
        }
        return days;
    }
    
    private boolean isLeapYear(int year){
        if(year%4==0){
           if(year%100==0 && year%400!=0){
               return false;
           } else {
               return true;
           }
        } else {
            return false;
        }
    }
}
