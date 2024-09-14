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
		System.out.println(name+"要存入"+amount);
		synchronized(acct){			
			System.out.println(name+"存入前餘額"+acct.getBalance());
			acct.deposit(amount);
			System.out.println(name+"存入後餘額"+acct.getBalance());
		}
	}
}
