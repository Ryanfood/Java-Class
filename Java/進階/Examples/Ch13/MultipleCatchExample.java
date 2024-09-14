import java.io.*;
public class MultipleCatchExample {
	public static void main(String[] args) {
		ShoppingCart cart;
		try (ObjectInputStream in= new ObjectInputStream(new FileInputStream("cart.txt") )){
			  cart = (ShoppingCart) in.readObject();
		} catch (ClassNotFoundException | IOException e) {
			System.out.println(e.getMessage());
		}
	}
}
