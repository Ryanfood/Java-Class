public class ShirtTest {
	public static void main(String[] args){
		Shirt s1 = new Shirt();
		System.out.println("======��A��T======");
		System.out.println("�s��: "+s1.shirtID);
		System.out.println("�C��: "+s1.colorCode);
		System.out.println("����: "+s1.price);
		System.out.println("�w�s: "+s1.quantityInStock);
		System.out.println("����: "+s1.description);
		Shirt s2 = new Shirt();
		s2.shirtID = 2;
		s2.colorCode = 'R';
		s2.price = 599.99;
		s2.quantityInStock = 1;
		s2.description = "Jacket";
		System.out.println("======��A��T======");
		System.out.println("�s��: "+s2.shirtID);
		System.out.println("�C��: "+s2.colorCode);
		System.out.println("����: "+s2.price);
		System.out.println("�w�s: "+s2.quantityInStock);
		System.out.println("����: "+s2.description);
	}
}