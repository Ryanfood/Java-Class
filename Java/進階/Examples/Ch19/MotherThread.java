public class MotherThread implements Runnable {
	public void run() {
		System.out.println("�����ǳƵN��");
		System.out.println("�����o�{�̰s�Χ��F");
		System.out.println("�����s��l�h�R�̰s");

		Thread son = new Thread(new SonThread());
		son.start();
		System.out.println("��������l��̰s�R�^��");

		try {
			son.join();
		} catch (InterruptedException ie) {
			System.err.println("�o�ͨҥ~�I");
			System.err.println("�������_�N��");
			System.exit(1);
		} 

		System.out.println("�����}�l�N��");
		System.out.println("�����N�n���F");
	}
}
