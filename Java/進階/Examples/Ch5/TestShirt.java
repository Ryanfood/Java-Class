public class TestShirt {
    public static void main(String [] args) {
		       
		System.out.println("number of Shirt is " + Shirt.getTotalCount());
		
		Shirt s1 = new Shirt();        
		System.out.println("number of Shirt is " + s1.getTotalCount());
		
		Shirt s2 = new Shirt();        
		System.out.println("number of Shirt is " + s2.getTotalCount());

		System.out.println("size 14 eqauls size " + Shirt.convertShirtSize(14));

    }
}
