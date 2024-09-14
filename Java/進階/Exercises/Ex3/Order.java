public class Order {

    public double totalPrice = 0.0; // Default total price for order
    public Shirt[] shirts = new Shirt[5];
    public int itemNum = 0;

    public double addShirt(Shirt shirt) {
        if (itemNum < 5) {
            shirts[itemNum++] = shirt;
            totalPrice = totalPrice + shirt.price;
        }
        return totalPrice;
    }

    public void displayOrderInfo() {
        System.out.println("=====�q���T=====");
        System.out.println("�q�椺�e:");
        for (int i = 0; i < itemNum; i++) {
            shirts[i].display();
        }
        System.out.println("-----------------");
        System.out.println("�`��: " + totalPrice);
    }
} // end of class



