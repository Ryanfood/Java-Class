public class Employee {
    private String name = "Sean";
    private double salary = 10000;
    public Employee() { 
		super(); 
    }
	public Employee(String name, double salary){
		this.name = name;
		this.salary = salary;
	}
	public void getDetails() {
		System.out.println("Name:" + name);
		System.out.println("Salary:" + salary);
	}
}
