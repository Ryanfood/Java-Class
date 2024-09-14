public class ThreadsExample2 {
	public static void main(String argv[]){	
		Thread t1 = new HelloThread2("Thread1");

		Runnable r2 = new HelloRunner2("Thread2");               
		Thread t2 = new Thread(r2);

		t1.start();
		t2.start();
	}
}
