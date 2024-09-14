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
		System.out.println("姓名:"+name.toString());
		int pos = name.indexOf(" ");		
		System.out.println("姓氏:"+name.substring(pos+1));
		System.out.println("名字:"+name.substring(0, pos));
		System.out.println("姓名長度:"+name.length());
		System.out.println("姓名容量:"+name.capacity());
		System.out.println("電話: "+phoneNumber.toString());
		System.out.println("電話長度:"+phoneNumber.length());
		System.out.println("電話容量:"+phoneNumber.capacity());		
	}
}