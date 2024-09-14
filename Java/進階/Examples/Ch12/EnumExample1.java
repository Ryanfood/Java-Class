public class EnumExample1{
	public static void main(String[] args) {
		Employee e1 = new Employee();
		e1.setName("Sean");
		e1.setId(123);
		e1.setDept(Department.ENGINEERING);
		System.out.println("部門: "+e1.getDept());

		Employee e2 = new Employee();
		e2.setName("Peggy");
		e2.setId(124);
		//e2.setDept("HR");
		e2.setDept(Department.HR);
		System.out.println("部門: "+e2.getDept());
	}
}
