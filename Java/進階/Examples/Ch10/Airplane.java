public class Airplane extends Vehicle implements Flyer {
	public void takeoff() {
		System.out.println("飛機起飛!");
	}
	public void land() {
		System.out.println("飛機降落!");
	}
	public void fly() {
		System.out.println("飛機飛行!");
	}
} 
