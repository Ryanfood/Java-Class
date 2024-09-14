public class TestShirt {
   public static void main(String[ ] args) {
        Shirt myShirt = new Shirt( );
        double newPrice = 199.0;
		myShirt.colorCode = 'G';
		myShirt.displayInformation();
		myShirt.setPrice(newPrice);
		myShirt.displayInformation();
  }
}
