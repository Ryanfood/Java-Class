public class ThreadsExample3 {
	public static void main(String argv[]) {
		Storage s = new Storage(3);
		Producer p1 = new Producer("Amy", "cake", s);
		Producer p2 = new Producer("Ben", "bread", s);
		Consumer c1 = new Consumer("David", s);
		Consumer c2 = new Consumer("Louis", s);

		p1.start();
		p2.start();
		c1.start();
		c2.start();
	}
}
