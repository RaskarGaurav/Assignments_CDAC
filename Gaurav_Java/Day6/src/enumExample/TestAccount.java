package enumExample;
import java.util.Scanner;
public class TestAccount {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int id;
		String name;
		int d,m,y;
		String actType;
		
		System.out.println("Enter id:");
		id = sc.nextInt();
		
		System.out.println("Enter name: ");
		name = sc.next();
		
		System.out.println("Enter Date of Birth: ");
		d =sc.nextInt();
		m =sc.nextInt();
		y =sc.nextInt();
		
		System.out.println("Enter ActType:");
		actType = sc.next();
		
		Account act = new Account(id,name,actType,new Date(d,m,y));
		System.out.println(act);
		
	sc.close();}

}
