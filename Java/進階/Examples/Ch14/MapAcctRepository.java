import java.util.*;
public class MapAcctRepository {
	HashMap<String, Account> accounts;

	public MapAcctRepository(){
		accounts = new HashMap<String, Account> ();
	}

	public void put(Account account) {
		String locator = account.getCustomer();
		accounts.put(locator, account);
	}

	public Account get(String locator) {
		Account acct = accounts.get(locator);
		return acct;
	}
}