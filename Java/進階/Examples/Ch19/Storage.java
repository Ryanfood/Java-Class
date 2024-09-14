import java.util.*;
public class Storage {
	private int size;
	private Deque<String> products;
	public Storage(int s) {
		products = new LinkedList<>();
		size = s;
	}	
	public synchronized void addProduct(String n, String p) {
		while (products.size() == size) {
			try {
				System.out.printf("%s���ݥͲ�!%n",n);
				this.wait();
			} catch (InterruptedException e) { }
		}
		products.push(p);
		this.notify();
		System.out.printf("%s�Ͳ�%s,�w�s:%s%n", n, p, products.toString());
	}
	public synchronized void getProduct(String n) {
		while (products.size() == 0) {
			try {
				System.out.printf("%s���ݮ��O!%n",n);
				this.wait();
			} catch (InterruptedException e) { }
		}
		String p = products.pop();
		System.out.printf("%s���O%s,�w�s:%s%n", n, p, products.toString());
		this.notify();		
	}	
}
