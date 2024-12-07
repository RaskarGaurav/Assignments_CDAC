package banking;

public class Account {
	private int accNum;
	private String name;
	private double bal;
	
	public Account() {
		accNum = 0;
		name = "Undefined";
		bal = 0.0;
	}
	public Account(int accNum,String name,double bal) {
		this.accNum = accNum;
		this.name = name;
		this.bal = bal;
	}
	
	public void withdraw(double amt) {
		if (this.bal-amt>=0.0) {
			this.bal -=amt;
			System.out.println("Transaction successfully completed.\n");
		}
		else {
			System.out.println();
			System.out.println("Insufficient Funds...\n");
		} 
	}
	
	public void deposit(double amt) {
		this.bal += amt;
		System.out.println("Transaction successfully completed.\n");
	}
	
	public int getAccNum() {
		return accNum;
	}
	public void setAccNum(int accNum) {
		this.accNum = accNum;
		System.out.println("Account Number Updated...");
	}
	public String getName() {
		return name;
	}
	public double getBal() {
		return bal;
	}
	
	public void display() {
		System.out.println("-----Account_Info-----");
		System.out.println("Account no.: "+ accNum);
		System.out.println("Name: "+ name);
		System.out.println("Balance: "+bal);
		System.out.println();
	}
}