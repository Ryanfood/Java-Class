public class Company {
	private static final Company instance = new Company ();
	private String name;
	private String address;
	private String telephone;

	private Company() {
		name = "example.com";
		address = "123 5th Avenue";
		telephone = "555-987-6543";
	}

	public static Company getInstance() {
		return instance;
	}

	public String toString(){
		return "Name: " + name + "\n" +
			   "Address: " + address + "\n" +
			   "telephone: " + telephone + "\n";
	}
}
