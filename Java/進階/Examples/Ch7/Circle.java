import static java.lang.Math.PI;
public class Circle {
	private double radius;

	public Circle(double radius){
		this.radius = radius;
	}

	public double area() {
		return PI *radius * radius;
	}

	public double circumferance() {
		return 2 * PI * radius;
	}
}
