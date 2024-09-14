public class Employee {
	public static String address = "台北市中正路100號";
	public static String phone = "02-3456-7890";
	private static int count = 100;
	private String name;
	private int ext;
	
	public Employee(String name){
		this.name = name;
		this.ext = ++count;
	}
	
	public static void setAddress(String newAddress){
		address = newAddress;
	}	
	
	public static String getAddress(){
		return address;
	}
	
	public static void setPhone(String newPhone){
		phone = newPhone;
	}
	
	public static String getPhone(){
		return phone;
	}
	
	public String call(){
		return "找"+name+"請撥: "+phone+"分機:" + ext;
	}

	
}