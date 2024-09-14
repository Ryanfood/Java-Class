package duke.purchase;
public class Order {
    public int orderID = 1001;
    public duke.item.Shirt[ ] shirts = new duke.item.Shirt[5];
    public int itemNo = 0;
    public double totalPrice = 0.0;   
    public void addShirt(duke.item.Shirt s) {
        shirts[itemNo++] = s;
        totalPrice += s.price;
    }
	public void displayInformation() {
        System.out.println("Order ID:" + orderID);
        System.out.println("Total Price:" + totalPrice);
		System.out.println("There are " +itemNo +" items in this order:");
		System.out.println("===================================");
        for(int i=0; i<itemNo; i++){
			shirts[i].displayInformation();
			System.out.println("************************");
		}
    } 
}
