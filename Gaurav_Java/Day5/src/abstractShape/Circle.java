package abstractShape;

public class Circle extends Shape {
	private int radius;
	
	public Circle(int radius) {
		this.radius = radius;
		System.out.println("\nCircle added...");
	}

	@Override
	public void area() {
		System.out.println("Area of Circle: "+3.14*radius);
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.print("Circle ");
	}
	
	
	
	
}
