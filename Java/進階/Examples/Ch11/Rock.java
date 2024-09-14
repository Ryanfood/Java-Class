public class Rock implements SalesData{
    private String name = "Rock"; 
    private double unitPrice;
    private double unitCost;
    private double weight;

    public Rock(double p, double c, double w) {
        unitPrice = p;
        unitCost = c;
        weight = w;
    }

	public String getName() {
        return name;
    }

	public double getTotalPrice() {
        return unitPrice*weight;
    }
    
	public double getTotalCost() {
        return unitCost*weight;
    }
    
	public double getProfit() {
        return (unitPrice-unitCost)*weight;
    }

}
