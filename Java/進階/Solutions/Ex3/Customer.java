public class Customer {

    public int customerID = 0; // Default ID for the customer
    public String name = "-name required-"; // default
    public String address = "-address required-"; // default
	public String phoneNumber = "-phone required-"; // default
    public String emailAddress = "-email optional-"; // default 

	public void setCustomerInfo(int id, String nm, String addr, String phNum){
		customerID = id;
		name = nm;
		address = addr;
		phoneNumber = phNum;
	}
	
	public void setCustomerInfo(int id, String nm, String addr, String phNum, String email){
		customerID = id;
		name = nm;
		address = addr;
		phoneNumber = phNum;
		emailAddress = email;
	}
	
	 public void display(){
		System.out.println("********客戶資訊********");
        System.out.println("編號: " + customerID);
        System.out.println("姓名: " + name);
        System.out.println("地址: " + address);
        System.out.println("電話: " + phoneNumber);
        System.out.println("Email: " + emailAddress);
        System.out.println("***********************");
	 }

} // end of class
