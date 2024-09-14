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
		System.out.println("********�Ȥ��T********");
        System.out.println("�s��: " + customerID);
        System.out.println("�m�W: " + name);
        System.out.println("�a�}: " + address);
        System.out.println("�q��: " + phoneNumber);
        System.out.println("Email: " + emailAddress);
        System.out.println("***********************");
	 }

} // end of class
