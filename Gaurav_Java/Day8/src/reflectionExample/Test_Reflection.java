package reflectionExample;

import java.lang.reflect.*;

public class Test_Reflection {
	public static void main(String[] args) throws NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		//show constructor
		//show methods
		//
		//Reflection -> load metadata dynamically
		
		try {
			Class<?> clsObj =Class.forName("reflectionExample.Book");//Load Book.class file
			//OR// Class<?> clsObj = Book.class ;
			// Class<?> clsObj = new Book().getClass();
			System.out.println("Class loaded successfully...");
			
			//get all metadata from type claObj
			Field[]  allFields=clsObj.getFields();
			//Field[]  allFields=clsObj.getDeclaredFields();
			System.out.println("\nField: ");
			for (Field i: allFields) {
				System.out.println(i.getType()+" "+i.getName());
			}

			Method[] allMethods=clsObj.getDeclaredMethods();
			System.out.println("\nMethod: ");
			for (Method i: allMethods) {
				System.out.println(i.getReturnType()+" "+i.getName());
			}
			
			Constructor<?>[] allconstrs = clsObj.getDeclaredConstructors();
			System.out.println("\nConstrctor: ");
			for (Constructor<?> i : allconstrs) {
				System.out.println(i.getName()+" "+i.getParameterCount());
			}

		} catch (ClassNotFoundException e) {

			System.out.println("Class not found: " + e.getMessage());
		}
	}
}
