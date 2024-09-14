public class HelloRunner implements Runnable {
	String name;
	boolean quit = false;
	public HelloRunner(String n) {
		name = n;
	}

	public void run() {
		int i =1;
		while(!quit){
			System.out.println(name+":Hello "+i++);
			//
		}
	}

	public void stopRunning(){
		quit = true;
	}
}