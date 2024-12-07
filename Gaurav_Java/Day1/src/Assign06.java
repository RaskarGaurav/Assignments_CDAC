import java.util.Scanner;
public class Assign06 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Basic Salary(Rs.): ");
		double sal = sc.nextDouble();
		sc.close();
		System.out.print("Total Tax(Rs.): ");
		if (sal<150000) System.out.println(0);
		else if (sal>300000) System.out.println(sal*0.2);
		else if (sal<=300000 && sal>=150000) System.out.println(sal*0.3);
		else System.out.println("Invalid Input");
	}
}
