public class Shirt {
	private int shirtID = 0; 
	private char colorCode = 'G';
	private String size = "XL" ;
	private double price = 299.00;
	private String descriptiom = "Polo Shirt";

	public Shirt(int i) {
		shirtID = i;
	}

	public Shirt(char c, double p){
		colorCode = c;
		price = p;
	}

	public Shirt(char c, double p, String d){
		colorCode = c;
		price = p;
		description = d;
	}

	public Shirt(int i, char c, String s, double p, String d){
		shirtID = i;
		colorCode = c;
		size = s;
		price = p;
		description = d;
	}

	public int getShirtID ( ) {
		return shirtID;
	}

	public void setColorCode(char c) {
		if(c=='R' || c=='G' || c=='Y')
			  colorCode = c;
	}
	public char getColorCode ( ) {
		return colorCode;
	} 

	public void setPrice(double p) {
		if(p>=0.0)
			  price = p;
	}
	public double getPrice( ) {
		return price;
	}

	public void setSize(String s) {
		if(s.equals("S")||s.equals("M")||
		   s.equals("L")||s.equals("XL")||)
			  size = s;
	}
	public String getSize( ) {
		return size;
	}

}
