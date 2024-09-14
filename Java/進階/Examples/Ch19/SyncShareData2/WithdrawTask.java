public class WithdrawTask implements Runnable{
	private String name;
	private Account acct;
	private int amount;

	public WithdrawTask(String n, Account a, int amt) {
		name = n;
		acct = a;
		amount = amt;
	}

	public void run(){
		System.out.println(name+"要提款"+amount);
		synchronized(acct){
			System.out.println(name+"提款前餘額"+acct.getBalance());
			acct.withdraw(amount);
			System.out.println(name+"提款後餘額"+acct.getBalance());
		}
	}
}
