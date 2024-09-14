public class Widget implements SalesData{
    private String name = "Widget"; 
    private double unitPrice;
    private double unitCost;
    private int quantity;

    public Widget(double p, double c, int q) {
        unitPrice = p;
        unitCost = c;
        quantity = q;
    }
    
    public String getName() {
        return name;
    }

	public double getTotalPrice() {
		return unitPrice*quantity;
    }
    
	public double getTotalCost() {
        return unitCost*quantity;
    }

	public double getProfit() {
        return (unitPrice-unitCost)*quantity;
    }

}
