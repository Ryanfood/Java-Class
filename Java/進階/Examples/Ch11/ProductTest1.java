public class ProductTest1 {
	public static void main(String[] args) {
		SalesData[] itemList = new SalesData[5];
		SalesTool tool = new SalesTool();
		itemList[0] = new Rock(15.0, 10.0, 50.0);
		itemList[1] = new Rock(11.0, 6.0, 10.0);
		itemList[2] = new Paint(13.0, 8.0, 25.0);
		itemList[3] = new Widget(7.0, 5.0, 10);
		itemList[4] = new Widget(12.0, 12.0, 20);
		System.out.println("** Sales Report **");
		for (SalesData item : itemList) {
			tool.show(item);
		}

	}
}
