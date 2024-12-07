import java.util.Scanner;
public class Assign07 {
	public static void main(String[] args) {
		char[] arr = new char[]{'a','e','i','o','u'};
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Character: ");
		char ch = sc.next().charAt(0);
		sc.close();
		ch = Character.toLowerCase(ch);
		boolean flag = false; 
		for (char i: arr) {
			if(ch==i) {
				flag = true;
				break;
			}
		}
		System.out.println(flag? "Vowel":"Consonant");
	}
}