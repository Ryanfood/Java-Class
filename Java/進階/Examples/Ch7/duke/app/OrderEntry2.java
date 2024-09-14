import duke.purchase.*;
import duke.item.Shirt;
public class OrderEntry2 {
    public static void main(String[] args) {
        Order order = new Order();
        Shirt shirt = new Shirt();

		order.addShirt(shirt);
		order.displayInformation();
    }
}