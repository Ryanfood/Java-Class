public class ShirtAnalyzerTest1 {
	public static void main(String[] args){
		Shirt[] shirts = {
			new Shirt(1, 'R', "S", 200, "T-Shirt"),
			new Shirt(2, 'G', "S", 200, "T-Shirt"),
			new Shirt(3, 'B', "M", 250, "T-Shirt"),
			new Shirt(4, 'R', "M", 500, "Polo Shirt"),
			new Shirt(5, 'G', "L", 600, "Polo Shirt"),
			new Shirt(6, 'B', "L", 600, "Polo Shirt"),
		};
		
		System.out.println("===Green Color Shirt===");
		findShirtByColor(shirts, 'G');

		System.out.println("===M Size Shirt===");
		findShirtBySize(shirts, "M");
	}
	public static void findShirtByColor(Shirt[] shirts, char color){
		for(Shirt currentShirt : shirts){
			if (currentShirt.getColorCode()==color)
				System.out.println("Match: " + currentShirt);
		}
	}
	public static void findShirtBySize(Shirt[] shirts, String size){
		for(Shirt currentShirt : shirts){
			if (currentShirt.getSize().equals(size))
				System.out.println("Match: " + currentShirt);
		}
	}
}
