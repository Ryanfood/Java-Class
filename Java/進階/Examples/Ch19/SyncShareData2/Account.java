public class Account{
	private int balance;

	public Account(int initBal){
		balance = initBal;
	}
	
	public void deposit(int amt){
		int b = balance;
		for(int i=0; i<10000000; i++);
		b += amt;
		balance = b;		
	}

	public void withdraw(int amt){
		int b = balance;
		for(int i=0; i<10000000; i++);
		b -= amt;
		balance = b;		
	}

	public int getBalance(){
		return balance;
	}
}
