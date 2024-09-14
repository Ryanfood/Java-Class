public class OrderTest {
	public static void main(String[] args){
		Order o1 = new Order();
		
		Shirt s1 = new Shirt();
		s1.shirtID = 1;
		s1.description = "Polo Shirt";
		s1.colorCode = 'G';
		s1.price = 399.0; 
		s1.quantityInStock = 2;
		double amount = o1.addShirt(s1);
		System.out.println("買了一件Polo Shirt, 購物車金額:"+amount);		
		
		Shirt s2 = new Shirt();
		s2.shirtID = 2;
		s2.description = "T-Shirt";
		s2.colorCode = 'R';
		s2.price = 199.0; 
		s2.quantityInStock = 1;
		amount = o1.addShirt(s2);
		System.out.println("買了一件T-Shirt, 購物車金額:"+amount);
		
		Shirt s3 = new Shirt();
		s3.shirtID = 3;
		s3.description = "Jacket";
		s3.colorCode = 'B';
		s3.price = 999.0; 
		s3.quantityInStock = 3;
		amount = o1.addShirt(s3);
		System.out.println("買了一件Jacket, 購物車金額:"+amount);
		
		System.out.println("結帳........");
		o1.display();
	}
}