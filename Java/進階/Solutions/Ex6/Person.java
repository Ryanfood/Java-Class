public class Person {
	StringBuilder name, phoneNumber;
	
	public Person(String n, String p){
		name = new StringBuilder(n);
		phoneNumber = new StringBuilder(p);
	}

	public void addLastName(String ln){
		name.append(" ");
		name.append(ln);
		//0298765432
		phoneNumber.insert(2, "-");
		//02-98765432
		phoneNumber.insert(7, "-");
		//02-9876-5432
	}
	
	public void displayInfo(){
		System.out.println("�m�W:"+name.toString());
		int pos = name.indexOf(" ");		
		System.out.println("�m��:"+name.substring(pos+1));
		System.out.println("�W�r:"+name.substring(0, pos));
		System.out.println("�m�W����:"+name.length());
		System.out.println("�m�W�e�q:"+name.capacity());
		System.out.println("�q��: "+phoneNumber.toString());
		System.out.println("�q�ܪ���:"+phoneNumber.length());
		System.out.println("�q�ܮe�q:"+phoneNumber.capacity());		
	}
}