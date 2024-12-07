package collectionExample;
import java.util.*;
public class Test_Product {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Product> products = new ArrayList<Product>();
		
		while(true) {
			System.out.println("\n\n*****MEnU*****\n1)All Products\n2)Create Product\n3)Change pId\n4)Change name\n5)Sort Products\n6)Sort by Names\n7)Exit");
			System.out.println("Choice: ");
			int ch = sc.nextInt();
			if(ch==7) {
				System.out.println("\nExiting...");
				break;
			}
			
			switch (ch) {
			case 1:
				
			case 2:
			case 3:
			case 4:
			case 5:
			case 6:
			default:
			}//switch
		}
	}

}
