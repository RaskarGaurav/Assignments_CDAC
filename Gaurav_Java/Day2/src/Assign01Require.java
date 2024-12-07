import java.util.Scanner;
public class Assign01Require {
	private Scanner sc = new Scanner(System.in);
	public int[] readArr(int[] arr) {
		System.out.println("Enter Numbers to read:("+arr.length+")");
		for (int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		return arr;
	}
	
	public void printArray(int[] arr) {
		for (int i : arr) {
			System.out.print(i+" ");
		}
		System.out.println();
	}
	
	public void searchEle(int num,int[] arr) {
		boolean flag =true;
		for (int i=0;i<arr.length;i++) {
			if (arr[i]==num) {
				System.out.print("Location: "+(i+1));
				flag=false;
			}
		}
		if (flag) System.out.println("Element does not exist...");
		else System.out.println();
	}
	
	public int[] revArray(int[] arr) {
		int[] a = new int[arr.length];
		for(int i=0;i<arr.length;i++) {
			a[a.length-1-i]=arr[i];
		}
		return a;
	}
	
	public void evenArray(int[] arr) {
		System.out.print("Even nos from Array: ");
		for(int i : arr ) {
			if(i%2==0) System.out.print(i+" ");
		}
	}
	
	public void primeArray(int[] arr) {
		System.out.println();
		System.out.print("Prime nos from Array: ");
		boolean flag=true;
		for (int n:arr) {
			for(int i=2;i*i<=n;i++) {
				if(n%i==0) {
					flag=false;
					break;
				}
			}
			if (flag) System.out.print(n+" ");
			flag=true;
		}
	}
}
