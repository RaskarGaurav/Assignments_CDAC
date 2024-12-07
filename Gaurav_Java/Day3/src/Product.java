
public class Product {
	private int prodId;
	private String prodName;
	private double price;
	
	public Product() {// Default Constructor
		prodId = -1;
		prodName = "Unknown";
		price = 0.0;
	}
	
	public Product(int proddid,String prodName,double price) {//Parameterized Constructor
		this.prodId = proddid; //"this" keyword used to avoid same name Conflict
		this.prodName = prodName;
		this.price = price;
	}
	
	public void display() {
		System.out.println("------Product------");
		System.out.println("Product Id: "+prodId);
		System.out.println("Product Name: "+prodName);
		System.out.println("Price: "+price);
		System.out.println();
	}
	
}
/*lab task:
Menu 1) add new prd
2) display details
3) show price
4) edit price
5) Delete prd 
*/