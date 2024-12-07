package interfaceExample;

public class Fruits implements Displayable {
	private String name;
	
	public Fruits() {
		super();
		name = "Unknown";
	}

	public Fruits(String name) {
		super();
		this.name = name;
	}

	@Override
	public void display() {
		System.out.println("Fruit Name: "+name);
	}
	
}
