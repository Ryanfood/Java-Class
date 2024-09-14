public class Producer extends Thread {
    private String name;
    private Storage s;
	private String product;
	
    public Producer(String n, String p, Storage s) {
        this.name = n;
		this.product = p;
        this.s = s;
    }
	
    public void run() {
        while (true) {
            s.addProduct(name, product);
            try {
                sleep((int)(Math.random()*1000));
            } catch (InterruptedException e) { 
            } 
        }
    }
}
