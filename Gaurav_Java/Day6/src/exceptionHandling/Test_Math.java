package exceptionHandling;

public class Test_Math {

	public static void main(String[] args) {
		int a=10,b=0;
		Math obj = new Math();
		try {
			obj.div(a, b);
		}
		catch(ArithmeticException aEx) {
			System.out.println("Divison by Zero...");
			System.err.println(aEx.getMessage());
		}

	}

}
