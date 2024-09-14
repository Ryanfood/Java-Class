public class DateFourTest {

    public static void main(String[] args) {
        DateFour d = new DateFour();
        d.setDate(-1234, 20, -8);
        System.out.println("日期為"+d.getDate());
        d.setDate(2018,2,28);
        System.out.println("日期為"+d.getDate());
        d.setDate(2018,2,30);
        System.out.println("日期為"+d.getDate());
    }
    
}
