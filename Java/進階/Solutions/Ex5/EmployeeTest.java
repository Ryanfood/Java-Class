public class EmployeeTest {
	public static void main(String[] args){
		System.out.println(Employee.getAddress());
		System.out.println(Employee.getPhone());
		Employee e1 = new Employee("Sean");		
		Employee e2 = new Employee("David");		
		System.out.println(e1.getAddress());
		System.out.println(e2.getPhone());		
		System.out.println(e1.call());			
		System.out.println(e2.call());
		
		System.out.println("\n\n公司搬家改電話!");
		Employee.setAddress("台北市公園路30號");
		e2.phone = "02-9876-5432";
		System.out.println(Employee.getAddress());
		System.out.println(Employee.getPhone());		
		System.out.println(e1.getAddress());
		System.out.println(e2.getPhone());		
		System.out.println(e1.call());			
		System.out.println(e2.call());
	}
}