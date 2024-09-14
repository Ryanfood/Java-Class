public class SwitchStringStatement1{    
	public static void main(String args[]){        
		String gender = "Male";
		String lastName = "鄭";
		String nameFormat;
		switch (gender){
			case "Male":
				nameFormat = lastName + "先生";
				break;
			case "Female":
				nameFormat = lastName + "小姐" ;
				break;
			default:
				nameFormat = lastName + "君" ;
		}        
		System.out.println(nameFormat + "你好!" );
	}
}
