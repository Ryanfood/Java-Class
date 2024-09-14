public class Shirt {
	public int shirtID = 101;
	public String description = "Polo";
	public char colorCode = 'R';
	public double price = 299.0; 
  
	public void displayInformation() {
		System.out.println("Shirt ID: " + shirtID);
		System.out.println("Color Code: " + colorCode);
		System.out.println("Shirt Price: " + price);
		System.out.println("Description: " + description);
	}
}

