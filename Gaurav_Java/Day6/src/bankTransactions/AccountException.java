package bankTransactions;

public class AccountException extends Exception {
	
	private static final long serialVersionUID = 1L;//nothing matters

	public AccountException(String str) {
		super(str);
	}
}
