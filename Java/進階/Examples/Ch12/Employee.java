public class Employee {
	private String name;
	private int id;
	private Department dept;

	public  void  setName(String name) {
		this.name = name;
	}	
	public  String  getName() {
		return name;
	}	
	public  void  setId(int id) {
		this.id = id;
	}	
	public  int  getId() {
		return id;
	}

	public  void  setDept ( Department dept) {
        this.dept = dept;
	}

	public  Department  getDept() {
		return dept;
	}

}
