public class Consumer extends Thread  {
    private String name;
    private Storage s;
	
    public Consumer(String n, Storage s) {
        name = n;
        this.s = s;
    }

    public void run() {
        while (true) {
            s.getProduct(name);	
            try {	
                sleep((int)(Math.random()*1000));
            } catch (InterruptedException e) { 
            } 
        }
    }
}
