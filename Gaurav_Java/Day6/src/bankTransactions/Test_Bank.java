package bankTransactions;
import java.util.Scanner;
public class Test_Bank {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Account[] acnts = new Account[10];
		int actId;
		Double bal,amt;
		String name;
		
		while(true) {
			System.out.println("\n\n*****MeNU*****\n1)Show Accounts\n2)Create Account\n3)Withdraw\n4)Deposit\n5)Balance\n6)Exit");
			System.out.println("\nChoice: ");
			int ch = sc.nextInt();
			if(ch==6) {
				System.out.println("Exiting...");
				break;
			}
			
			switch (ch) {
			case 1: 
				for (Account i: acnts) {
					if(i!=null) System.out.println(i);
				}
				break;
			case 2:
				System.out.println("\nEnter Account ID: ");
				actId = sc.nextInt();
				System.out.println("\nEnter name: ");
				name = sc.next();
				System.out.println("\nEnter Initial Balance: ");
				bal = sc.nextDouble();
				for (int i=0; i<acnts.length;i++) {
					if (acnts[i]==null) {
						try {
							acnts[i]= AccountValidation.validAccount(actId,name,bal);
						} catch (Exception e) {
							System.err.println(e.getMessage());
						}
						break;
					}
				}
				break;
			case 3:
				System.out.println("\nEnter Amount to withdraw:");
				amt = sc.nextDouble();
				System.out.println("\nAccount Id: ");
				actId = sc.nextInt();
				for (Account i: acnts) {
					if(i!=null) {
						if(i.getActid()==actId) {
							try {
								i.withdraw(amt);
								}catch (Exception e) { 
									System.out.println(e.getMessage());
								}
							break;
						}
						else System.out.println("\nInvalid Account number...");
					}
				}
				break;
			case 4:
				System.out.println("\nEnter Amount to Deposit:");
				amt = sc.nextDouble();
				System.out.println("\nAccount Id: ");
				actId = sc.nextInt();
				for (Account i: acnts) {
					if(i!=null) {
						if(i.getActid()==actId) {
							try {
								i.deposit(amt);
								}catch (Exception e) { 
									System.err.println(e.getMessage());
								}
							break;
						}
						else System.err.println("\nInvalid Account number...");
					}
				}
				break;
			case 5:
				System.out.println("\nAccount Id: ");
				actId = sc.nextInt();
				for (Account i: acnts) {
					if(i!=null) {
						if(i.getActid()==actId) {
							System.out.println("\nBalance : "+i.getBal());
							break;
						}
						else System.err.println("\nInvalid Account number...");
					}
				}
				break;
			default:
				System.err.println("\nEnter Valid Input...");
				
			
			}//switch
		}sc.close();

	}

}