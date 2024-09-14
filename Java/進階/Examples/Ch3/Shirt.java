public class Shirt {

    public int shirtID = 0; 
    public char colorCode = 'G';
    public String size = "XL" ;
    public double price = 299.00;
    public String description = "Polo Shirt";
    
	public Shirt(){}
    public Shirt(char color, String size, 
                 double price, String desc) {
          this.colorCode = color;
          this.size = size;
          this.price = price;
          this.description = desc;
    }
      
    public void displayInformation() {
        System.out.println("Shirt ID:" + shirtID);
        System.out.println("Color:" + colorCode);
        System.out.println("Size:" + size);
        System.out.println("Price:" + price);
    }   
    public void setPrice(double p) {
        price = p;
    }
    public double getPrice( ) {
        return price;
    }    

}
