package fuctionalInterface;

public class Test_FuctionalInterface {
	public static void main(String[] args) {
		
		MyFunctionalInterface mf1 = (i,j) -> { System.out.println("Addition: "+(i+j)); } ;//Lambda Expression
		mf1.add(10, 5);
		
		
	}
}
