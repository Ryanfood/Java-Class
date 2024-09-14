public class DateThreeTest {
    public static void main(String args[]){
        DateThree d = new DateThree();
        
        d.setDay(-8);
        d.setMonth(20);
        d.setYear(-1234);        
        System.out.println("日期為"+d.getYear()+"/"+d.getMonth()+"/"+d.getDay());
        
        d.setDay(28);
        d.setMonth(2);
        d.setYear(2018);            
        System.out.println("日期為"+d.getYear()+"/"+d.getMonth()+"/"+d.getDay());

        d.setDay(30);      
        System.out.println("日期為"+d.getYear()+"/"+d.getMonth()+"/"+d.getDay());
    } // end main
} // end class
