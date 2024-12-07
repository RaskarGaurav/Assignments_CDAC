import java.util.Arrays;
import java.util.Scanner;
public class Assign01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Assign01Require obj = new Assign01Require();
		boolean sizeFlag=false;
		int size=1;
		int[] arr = new int[size];
		while (true) {
				System.out.println();
				System.out.println("1)Read Array:"
						+ "\n2)Print Array"
						+ "\n3)Search Element in array:"
						+ "\n4)Reverse array:"
						+ "\n5)Even number from array:"
						+ "\n6)Sort Array:"
						+ "\n7)Prime number from array:"
						+ "\n8)Exit"
						+ "\nChoice:");
				int ch = sc.nextInt();
				if (ch==8){
					System.out.println("\nExiting...");
					break;
				}
				else if (sizeFlag==false) {
					sizeFlag=true;
					System.out.print("Enter Size: ");
					size = sc.nextInt();
					arr = new int[size];
				}
					switch(ch) {
					case 1:
						obj.readArr(arr);
						break;
					case 2:
						System.out.print("\nGiven Array: ");
						obj.printArray(arr);
						System.out.println();
						break;
					case 3:
						System.out.println("Enter Element to search: ");
						int n =sc.nextInt();
						obj.searchEle(n,arr);
						break;
					case 4:
						arr = obj.revArray(arr);
						System.out.println("Array has been reversed...\n");
						break;
					case 5:
						obj.evenArray(arr);
						break;
					case 6:
						Arrays.sort(arr);
						System.out.println("Array has been sorted...\n");
						break;
					case 7:
						obj.primeArray(arr);
						break;
					default: System.out.println("Enter Valid Input...");
				
					}
			
			}sc.close();
	}
}
