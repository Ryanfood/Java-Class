public class Rectangle implements Comparable{
	private double width;
	private double height;
	public Rectangle(double width, double height) {
		this.width = width;
		this.height = height;
	}
	public double getArea() {
		return width * height;
	}
	@Override
	public String toString() {
		return "Width: " + width + " Height: " + height + " Area: " + getArea();
	}
	@Override 
	public int compareTo(Object obj) {
		Rectangle o = (Rectangle)obj;
		if (getArea() > o.getArea())
			return 1;
		else if (getArea() < o.getArea())
			return -1;
		else
			return 0;
	}

}
