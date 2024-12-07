package inheritance_Example;

public class Casting {
	public static void main(String[] args) {
		Object[] arr = new Object[3];
		arr[0]= 45; //Integer
		arr[1] = "HelloWorld"; //String
		System.out.println(arr[0] +" "+arr[1]);
		
		//Integer num = arr[0]; //ClassCastException...No Implicit Down-Casting
		Integer num = (Integer) arr[0]; //Explicit Down-Casting
		
		//-----------------------------------------------
		Integer no1 = 10;
		Object no2 = no1; //Implicit Up-Casting
		Object no3 = (Object) no1;//Explicit Up-Casting
		
		//----------------------------------------------
		//Widening and Narrowing in Primitive DataTypes
		byte a1 = 5;
		int a2 =a1; //Widening(implicit)
		
		int a3 = 10;
		//byte a4 = a3; // Narrowing (Implicit --Not Possible)
		byte a4 = (byte) a3;//Narrowing (Explicitly)
		
	}
	
}
