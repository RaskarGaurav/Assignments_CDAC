package abstractShape;

public class Rectangle extends Shape {
	private int len;
	private int width;
	
	public Rectangle(int len, int width) {
		this.len = len;
		this.width = width;
		System.out.println("\nRectangle added...");
	}
	
	@Override
	public void area() {
		System.out.println("Area of Rectangle:"+len*width);
	}
	
	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.print("Rectangle ");
	}
	
}
