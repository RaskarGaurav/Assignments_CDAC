package collectionExample;

public class Product implements Comparable<Product> {
	private int pId;
	private String name;
	
	public Product(int pId, String name) {
		super();
		this.pId = pId;
		this.name = name;
	}

	public int getpId() {
		return pId;
	}

	public void setpId(int pId) {
		this.pId = pId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Product [pId=" + pId + ", name=" + name + "]";
	}
	
	@Override
	public int compareTo(Product p1) {
		if (this.pId > p1.pId) return 1;
		else if (this.pId < p1.pId) return -1;
		else return 0;
	}
	
	
	
}
