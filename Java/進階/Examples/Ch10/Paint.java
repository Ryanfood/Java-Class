public class Paint implements SalesData{
    private String name = "Paint"; 
    private double unitPrice;
    private double unitCost;
    private double volume;

    public Paint(double p, double c, double v) {
        unitPrice = p;
        unitCost = c;
        volume = v;
    }	    

    public String getName() {
        return name;
    }

    public double getTotalPrice() {
        return unitPrice*volume;
    }

    public double getTotalCost() {
        return unitCost*volume;
    }

    public double getProfit() {
        return (unitPrice-unitCost)*volume;
    }

}
