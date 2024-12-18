package bankTransactions;

public class Account {
	private int actid;
	private String name;
	private Double bal;
	
	@Override
	public String toString() {
		return "Account [actid=" + actid + ", name=" + name + ", bal=" + bal + "]";
	}
	public Account(int actid, String name, Double bal) {
		super();
		this.actid = actid;
		this.name = name;
		this.bal = bal;
	}	
	public void withdraw(Double amt) throws AccountException {
		if(bal - isWithdrawValid(amt)>=0) {
			bal -= amt;
			System.out.println("Transactions Done...");
		}
		else {
			throw new AccountException("Insufficient Funds...");
		}
	}
	public void deposit(Double amt) throws AccountException {
			bal += isDepositValid(amt);
			System.out.println("Transactions Done...");
	}

	
	private static Double isDepositValid(Double amt) throws AccountException{
		if(amt<=0) {
			throw new AccountException("Enter Valid Ammount to Deposit");
		}
		else return amt;
	}
	
	private static Double isWithdrawValid(Double amt) throws AccountException{
		if(amt<=0) {
			throw new AccountException("Enter Valid Ammount to Withdraw");
		}
		else return amt;
	}
	public int getActid() {
		return actid;
	}
	public String getName() {
		return name;
	}
	public Double getBal() {
		return bal;
	}
	
	
}
