package enumExample;

public class Account {
	private int actid;//auto increment for actid
	private String name;
	private AccountType actType;
	private Date dob;
	
	public Account() {
		actid =101;
		name="Walter_White";
		actType = AccountType.savings;
		dob=new Date();
	}
	
	public Account(int actid, String name, String actType,Date dob) {
		this.actid = actid;
		this.name = name;
		this.actType = AccountType.valueOf(actType.toLowerCase());
		this.dob = dob;
	}
	
	@Override
	public String toString() {
		return "Account No.: "+actid+"\nName: "+name+"\nAccount Type: "+actType+"\nDate of Birth: "+dob;
	}
}
