public class Programer2 {

	private Brain myBrain = new Brain(){
			public void think(){
				System.out.println("Java!");
			}
		};
		
}

abstract class Brain {
	abstract void think();
}
