public interface SalesData {
    public String getName();
    public double getTotalPrice();
    public double getTotalCost();
    public double getProfit();
	public default void show() {
		System.out.println("== " + this.getName() + " ==");
		System.out.println("Price: " + this.getTotalPrice());
		System.out.println("Cost: " + this.getTotalCost());
		System.out.println("Profit: " + this.getProfit());
	}

	public static void show2(SalesData item) {
		System.out.println("== " + item.getName() + " ==");
		System.out.println("Price: " + item.getTotalPrice());
		System.out.println("Cost: " + item.getTotalCost());
		System.out.println("Profit: " + item.getProfit());
	}
}