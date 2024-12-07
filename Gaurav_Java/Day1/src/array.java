
public class array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = new int[] {4,5,6,3,8};
		int[] b = a;
		b[1] = 10;
		for (int i: a) {
			System.out.print(i+" ");
		}
		System.out.println();
		for (int i: b) {
			System.out.print(i+" ");
		}
	}

}
// Menu Driven Program...
//1)accept array; 2) Display Array; 3) Even numbers; 4)Odd numbers;
//5)Prime numbers; 6) find number; 7) sum of arrays; 8) reverse array; 9)Exit;