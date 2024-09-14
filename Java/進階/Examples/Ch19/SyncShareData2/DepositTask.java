public class DepositTask implements Runnable{
	private String name;
	private Account acct;
	private int amount;

	public DepositTask(String n, Account a, int amt) {
		name = n;
		acct = a;
		amount = amt;
	}

	public void run(){
		System.out.println(name+"�n�s�J"+amount);
		synchronized(acct){			
			System.out.println(name+"�s�J�e�l�B"+acct.getBalance());
			acct.deposit(amount);
			System.out.println(name+"�s�J��l�B"+acct.getBalance());
		}
	}
}
