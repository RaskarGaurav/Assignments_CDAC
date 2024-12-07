package abstractShape;

public class Square extends Shape {
	private int side;
	
	public Square(int side) {
		this.side = side;
		System.out.println("\nSquare added...");
	}
	
	@Override
	public void area() {
		System.out.println("Area of Square: "+ side*side);
	}
	
	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.print("Square ");
	}
}