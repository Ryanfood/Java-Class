public class Zoo {
	public static void main(String[] args) {
		Ostrich ostrich = new Ostrich();
		ostrich.move();
		ostrich.hide();

		Bird bird1 = new Bird();
		bird1.move();

		Bird bird2 = new Ostrich();		
		bird2.move();
		//bird2.hide();
		if(bird2 instanceof Ostrich){
			((Ostrich)bird2).hide();
		}

	}
}
