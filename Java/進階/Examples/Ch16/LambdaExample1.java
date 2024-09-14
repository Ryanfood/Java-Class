public class LambdaExample1 {
	public static void main(String[] args) {
		Runnable r1 = new Runnable(){
			public void run(){
				for (int i=1; i<=100; i++){
					System.out.println("Hello "+i);
					try{
						Thread.sleep(2);
					} catch(Exception ex){}
				}
			}
		};
		new Thread(r1).start();

		Runnable r2 = ()-> {
			for(int i=1; i<=100; i++){
				System.out.println("§A¦n "+i);
				try{
					Thread.sleep(1);
				} catch(Exception ex){}
			}
		};
		new Thread(r2).start();
	}
}
