public class SeaPlane extends Airplane implements Sailer{
	public void takeoff() {
		System.out.println("水上飛機起飛!");
	}
	public void land() {
		System.out.println("水上飛機降落!");
	}
	
	public void dock(){
		System.out.println("水上飛機靠港!");
	}
	public void cruise(){
		System.out.println("水上飛機巡航!");
	}
} 
