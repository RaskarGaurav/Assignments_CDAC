package exceptionHandling;

public class Math {
	public void div(int a, int b) {
		try {
			System.out.println("Division: "+a/b);
		}
		catch (ArithmeticException Ex){
			throw new ArithmeticException("Please Enter Number.");
		}
		
		
	}
}
