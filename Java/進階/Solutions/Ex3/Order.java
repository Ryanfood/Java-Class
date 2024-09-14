public class Order {
	public int orderID = 0;
	public Shirt[] shirts = new Shirt[5];
	public int itemNo = 0;
	public double totalPrice = 0.0; // Default price for order
  
	public double addShirt (Shirt shirt) {
		shirts[itemNo] = shirt;
		itemNo++;
		totalPrice = totalPrice + shirt.price;
		return totalPrice;
	}
	
	public void display(){
		System.out.println("+++++++訂單資訊++++++");
		for(int i=0; i<itemNo; i++){
			shirts[i].display();			
		}
		System.out.println("======================");
		System.out.println("應付總金額: "+totalPrice+"元");
	}
} // end of class



