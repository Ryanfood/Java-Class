public class Account {
    private String customer;
    private double balance;
    private String accountID;
    private static int nextID = 1000;
    
    public Account(String name){
        customer = name;
        balance = 1000;
        accountID = "a" + nextID;
        nextID++;
        System.out.println("Account(String) created Account Instance ===============");
    }
    
    public void deposit(double amount){
        if(amount < 0){
            System.out.println("Positive Deposit Amount required!!!");
            return;
        }
        balance += amount;            
    }
    
    public void withdraw(double amount){
        if(amount <0){
            System.out.println("Positive Withdraw Amount required!!!");
        } else if(amount > balance){
            System.out.println("Insufficient Fund!!!");
        } else {
            balance -= amount;
        }
    }
    
    public String getDetails(){
        return "Account Details:    customer = " + customer + " accountId = "+accountID + " balance = " + balance;
    }
    
    public String getCustomer(){
        return customer;
    }

    public double getBalance(){
        return balance;
    }

    public String getAccountID(){
        return accountID;
    }
}
