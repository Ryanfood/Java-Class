public class Manager extends Employee {
	private String dept = "EDU";
	public Manager(){
		super();
	}
	public Manager(String name, double salary, String dept){
		super(name, salary);
		this.dept = dept;
	}
	public void getDetails() {
		super.getDetails();
		System.out.println("Department:"+dept);
	}
	public void getDepartment() {
		System.out.println("Department:" + dept);
	}

}
