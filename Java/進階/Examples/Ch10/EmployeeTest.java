public class EmployeeTest{
    public static void main(String[] args) {
        
        Employee manager = new Manager();
        Employee programmer = new Programmer();
        Employee sales= new Sales();

        manager.work();
        programmer.work();
        sales.work();

        manager.teaBreak();
        programmer.teaBreak();
        sales.teaBreak();

    }
} 
