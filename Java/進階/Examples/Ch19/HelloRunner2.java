public class HelloRunner2 implements Runnable {
	String name;	
	public HelloRunner2(String n) {
		name = n;
	}	
	public void run() {
		for (int i=1; i<=50; i++) {
			System.out.println(name+" Hello "+i);
			Thread.yield();
		}
	}
}
