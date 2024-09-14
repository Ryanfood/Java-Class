public class Shirt {
	public static int counter = 0;
    public int shirtID;

	public Shirt() {
		counter++;
		shirtID = counter;
	}

	public static int getTotalCount( ){
		return counter;
	}
          
	public static String convertShirtSize(int numericalSize) {
		if(numericalSize < 10){
				  return "S" ;
		} else if(numericalSize < 14){
				  return "M" ;
		} else if(numericalSize < 18){
				  return "L" ;
		} else {
				  return "XL" ;
		}
	}

}