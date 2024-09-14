public class SalesTool {
	public void show (SalesData item) {
		System.out.println("== " + item.getName() + " ==");
		System.out.println("Price: " + item.getTotalPrice());
		System.out.println("Cost: " + item.getTotalCost());
		System.out.println("Profit: " + item.getProfit());
	}
}
