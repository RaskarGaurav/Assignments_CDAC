package abstractShape;

public class Triangle extends Shape {
	private int height;
	private int base;
	
	public Triangle(int height, int base) {
		this.height = height;
		this.base = base;
		System.out.println("\nTriangle added...");
	}

	@Override
	public void area() {
		System.out.println("Area of Triangle: "+1/2*base*height);
	}
	
	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.print("Triangle ");
	}

	
	
}