public class ShirtAnalyzerTest3 {

	public static void main(String[] args){
		Shirt[] shirts = {
			new Shirt(1, 'R', "S", 200, "T-Shirt"),
			new Shirt(2, 'G', "S", 200, "T-Shirt"),
			new Shirt(3, 'B', "M", 250, "T-Shirt"),
			new Shirt(4, 'R', "M", 500, "Polo Shirt"),
			new Shirt(5, 'G', "L", 600, "Polo Shirt"),
			new Shirt(6, 'B', "L", 600, "Polo Shirt")
		};

		System.out.println("===Green Color Shirt===");
		findShirtByAnalyzer(shirts, new ShirtAnalyzer(){
			public boolean analyze(Shirt shirt) {
				return shirt.getColorCode()=='G';
			}	
		});

		System.out.println("===M Size Shirt===");
		findShirtByAnalyzer(shirts, new ShirtAnalyzer(){
			public boolean analyze(Shirt shirt) {
				return shirt.getSize().equals("M");
			}	
		});
	}

	public static void findShirtByAnalyzer(Shirt[] shirts, ShirtAnalyzer analyzer){
		for(Shirt currentShirt : shirts){
			if (analyzer.analyze(currentShirt))
				System.out.println("Match: " + currentShirt);
		}
	}
}
