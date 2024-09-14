public class StringSplit {
	public static void main(String[ ] args) {
		String shirts = "Blue Shirt, Red Shirt, Black Shirt, Maroon Shirt";

		String[ ] results = shirts.split(", ");
		for(int i=0; i<4; i++){
			  System.out.println(results[i]);
		}
	}
}
