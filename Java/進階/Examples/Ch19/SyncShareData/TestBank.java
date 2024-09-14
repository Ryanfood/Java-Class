public class TestBank {
	public static void main(String[] args){
		Account acct = new Account(10000);
		
		DepositTask w1 = new DepositTask("Sean", acct, 5000);
		WithdrawTask w2 = new WithdrawTask("Amy", acct, 2000);
		
		Thread t1 = new Thread(w1);
		Thread t2 = new Thread(w2);

		t1.start();
		t2.start();
	}
}
