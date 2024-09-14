public class TestShirt {

	public static void main(String[ ] args) {
		Shirt myShirt = new Shirt();
		myShirt.colorCode = 'G';
		myShirt.displayInformation();   
		myShirt = new Shirt();
		System.gc();
	}
}

