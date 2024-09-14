public class Order {
    public int orderID = 1001;
    public Shirt[ ] shirts = new Shirt[5];
    public int itemNo = 0;
    public double totalPrice = 0.0;   
    public void addShirt(Shirt s) {
        shirts[itemNo++] = s;
        totalPrice += s.price;
    }
}