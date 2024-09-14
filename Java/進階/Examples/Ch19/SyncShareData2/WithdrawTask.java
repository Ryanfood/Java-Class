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
		System.out.println(name+"�n����"+amount);
		synchronized(acct){
			System.out.println(name+"���ګe�l�B"+acct.getBalance());
			acct.withdraw(amount);
			System.out.println(name+"���ګ�l�B"+acct.getBalance());
		}
	}
}
