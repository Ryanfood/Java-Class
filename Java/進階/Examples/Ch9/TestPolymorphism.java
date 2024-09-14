public class TestPolymorphism{
    public static void main(String [] args) {
        Employee e = new Employee();
        e.getDetails();        
        
		Manager m = new Manager ();
        m.getDetails();

        Employee p = new Manager();

        p.getDetails();
        //p.getDepartment();
  }
}
