package banking;
/* Add accounts (objects) in reference Array
 * Write Credential (actNo, Name, Balance)
 * Menu for customer to CRUD operations
 */
import java.util.Scanner;
public class BankMenu {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		Account[] accounts = new Account[10];
		Passwd[] pins = new Passwd[10];
		int index=0;
		while (true) {
			System.out.println("\n");
			System.out.println("1)Create Account\n2)Account Holder\n3)Check Balance\n4)Withdraw\n5)Deposit\n6)Show all Accounts\n7)Exit");
			System.out.print("--Choice: ");
			int choice = sc.nextInt();
			if (choice==7) {
				System.out.println("Exiting...");
				break;
			}
			else {
				switch(choice) {
				case 1:
					if(index<10) {
						System.out.println("Enter Account No: ");
						int accNum= sc.nextInt();
						System.out.println("Enter Account Holder's name: ");
						String name= sc.next();
						System.out.println("First Deposit: ");
						double bal= sc.nextDouble();
						System.out.println("Set PIN: ");
						pins[index] = new Passwd(sc.nextInt());
						accounts[index] = new Account(accNum,name,bal);
						index++;
					}
					else System.out.println("Account DB limit reach...(ERROR)");
					break;
				case 2:
					System.out.println("Enter Account No.: ");
					int accNum = sc.nextInt();
					for (int i=0; i<index;i++) {
						if (accounts[i].getAccNum()==accNum) {
							System.out.println("Account Holder's Name: "+accounts[i].getName()+"\n\n");
							break;
						}
						else if (i==(index-1)) System.out.println("No Account exist with this Account number...\n\n");
					}
					break;
				case 3:
					System.out.println("Enter Account No.: ");
					accNum = sc.nextInt();
					for (int i=0; i<index;i++) {
						if (accounts[i].getAccNum()==accNum) {
							System.out.println("Enter PIN: ");
							if (pins[i].checkPass(sc.nextInt())) {
								System.out.println("Account Total Balance(Rs.): "+accounts[i].getBal()+"\n\n");
								break;
							}
							else {
								System.out.println("WRONG PIN...\n\n");
								break;
							}
							
						}
						else if (i==(index-1)) System.out.println("No Account exist with this Account number...\n\n");
					}
					break;
				case 4:
					System.out.println("Enter Account No.: ");
					accNum = sc.nextInt();
					for (int i=0; i<index;i++) {
						if (accounts[i].getAccNum()==accNum) {
							System.out.println("Enter PIN: ");
							if (pins[i].checkPass(sc.nextInt())) {
								System.out.println("Enter Ammount: ");
								accounts[i].withdraw(sc.nextDouble());
								break;
							}
							else {
								System.out.println("WRONG PIN...\n\n");
								break;
							}
							
						}
						else if (i==(index-1)) System.out.println("No Account exist with this Account number...\n\n");
					}
					break;
				case 5:
					System.out.println("Enter Account No.: ");
					accNum = sc.nextInt();
					for (int i=0; i<index;i++) {
						if (accounts[i].getAccNum()==accNum) {
							System.out.println("Enter PIN: ");
							if (pins[i].checkPass(sc.nextInt())) {
								System.out.println("Ammount to Deposit: ");
								accounts[i].deposit(sc.nextDouble());
								break;
							}
							else {
								System.out.println("WRONG PIN...\n\n");
								break;
							}
							
						}
						else if (i==(index-1)) System.out.println("No Account exist with this Account number...\n\n");
					}
					break;
				case 6:
					System.out.println("Enter ADMIN PASSWORD: ");
					if (Passwd.checkAdminPass(sc.nextInt())) {
						for(int i=0; i<index;i++) {
							System.out.println("Account loc: "+(i+1));
							accounts[i].display();
						}
					}
					else {
						System.out.println("WRONG PASSWORD...\n\n");
					}
					break;
				default:
					System.out.println("Wrong Input...\n\n");
				}
			}
			
		}sc.close();
	}
}