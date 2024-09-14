public class HelloThread2 extends Thread {
	String name;
	public HelloThread2(String n)  {
		name = n;
	}	
	public void run() {
		for (int i=1; i<=100; i++) {
			System.out.println(name+" Hello "+i);
		try {
			Thread.sleep(1);
		} catch (InterruptedException ie){  }
		}
	}
}
