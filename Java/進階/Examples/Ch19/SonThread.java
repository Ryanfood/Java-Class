public class SonThread implements Runnable {
	public void run() {
		System.out.println("��l�X���h�R�̰s");
		System.out.println("��l�R�F��Ӧ^��5����");

		try {
			for (int i=1; i<=5; i++) {
				Thread.sleep(1000);
				System.out.print(i+"���� ");
			}
		} catch (InterruptedException ie) {
			System.err.println("��l�o�ͷN�~");
		}

		System.out.println("\n��l�R�̰s�^�ӤF");
	}		
}
