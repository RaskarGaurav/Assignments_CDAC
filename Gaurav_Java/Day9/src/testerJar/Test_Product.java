package testerJar;
import java.text.ParseException;
import java.util.Scanner;

import product.Product;
import static calculations.MyMath.*;//import all static methods so, Do not need class name to access them...

public class Test_Product {

	public static void main(String[] args) throws IllegalArgumentException {
		Scanner sc = new Scanner(System.in);
		Product prd;
		
		System.out.println("Enter PrdId, name, Category(grains,oils,fruits), price and date");
		int prdid =sc.nextInt();
		String name= sc.next(); 
		String prdCat= sc.next().toLowerCase();
		Double price = sc.nextDouble();
		
		//accept date in "dd/mm/yyyy"
		String date = sc.next();
		
		try {
			prd = new Product(prdid,name,price,prdCat,date);
			System.out.println("\n\n"+prd);
		} catch (ParseException e) {
			System.err.println(e.getLocalizedMessage());
		}sc.close();
		
		//MyMath class--- No need to mention Class name to access static methods
		System.out.println("add: "+ add(1,2));
		System.out.println("sub: "+ subs(10, 5));
		System.out.println("multi: "+multi(5,6));
		try {
			System.out.println("div: "+div(15,5));
		}catch (ArithmeticException ae) {
			System.err.println(ae.getLocalizedMessage());
		}
		
	}

}
