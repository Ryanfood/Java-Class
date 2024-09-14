package duke.app;
public class OrderEntry1 {
    public static void main(String[] args) {
        duke.purchase.Order order = new duke.purchase.Order();
        duke.item.Shirt shirt = new duke.item.Shirt();

		order.addShirt(shirt);
		order.displayInformation();
    }
}
