public class ThreadController {
	public static void main(String[] args){
		Runner r = new Runner();
		Thread t = new Thread(r);
		t.start();
		for (int i=1; i<=10; i++) {
			System.out.println("Main: "+i);
		}
		r.stopRunning();
	}
}
