package abstractShape;

public abstract class Shape {//Cannot create Instance(object)
	
	public void display() {
		System.out.println("Abstract Class Shape...");
	}
	public abstract void area();//Abstract Methods does not have body.
}
