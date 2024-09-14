public class Runner implements Runnable {
	private boolean timeToQuit = false;
	
	public void run() {
		int i = 1;
		while(!timeToQuit){
			System.out.println("Hello:" + i++);
		}
	}

	public void stopRunning(){
		timeToQuit = true;
	}
}
