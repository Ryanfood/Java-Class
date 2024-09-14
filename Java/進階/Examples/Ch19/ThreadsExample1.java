public class ThreadsExample1 {
	public static void main(String argv[]){	
		Thread t1 = new HelloThread("Amy");
		t1.start();
		HelloRunner r2 = new HelloRunner("David");
		Thread t2 = new Thread(r2);
		t2.start();
		t2.setDaemon(true);

		for (int i=1; i<=10; i++) {
			System.out.println("Main:Hello "+i);
		}
		//t2.stop();
		r2.stopRunning();
	}
}
