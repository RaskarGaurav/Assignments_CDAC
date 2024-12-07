import java.util.Scanner;
public class Assign08 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1st angle: ");
		int a = sc.nextInt();
		System.out.println("Enter 2nd angle: ");
		int b = sc.nextInt();
		System.out.println("Enter 3rd angle: ");
		int c = sc.nextInt();
		sc.close();
		if (a+b+c==180) System.out.println("It is a Triangle.");
		else System.out.println("It is not a Triangle.");
	}
}