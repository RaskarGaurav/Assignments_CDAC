import java.util.Scanner;
public class Assign09 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n = sc.nextInt();
		sc.close();
		int fact = 1;
		while(n>0) {
			fact =fact*n;
			n--;
		}
		System.out.println("Factorial: "+fact);
	}
}
