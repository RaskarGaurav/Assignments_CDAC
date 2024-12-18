package bankTransactions;

public class AccountValidation{
	
	
	public static Account validAccount(int actid, String name, Double bal) throws AccountException {
		if (isActIdValid(actid)) {
			return new Account(actid,name,bal);
		}
		else
			return null;
	}
	
	private static boolean isActIdValid(int actId) throws AccountException{
		if(cnt(actId)!=5) {
			throw new AccountException("Enter Valid Account ID");
		}
		else return true;
	}
	
	private static int cnt(int num) {
		int count = 0;

	    while (num != 0) {
	      num /= 10;
	      ++count;
	    }
	    return count;
	}
}
