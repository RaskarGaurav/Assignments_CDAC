package streamsExample;

import java.util.*;

public class Test_Stream {

	public static void main(String[] args) {
		
		List<Integer> lst= Arrays.asList(10,56,30,56,45);
		//Display
		System.out.println("*****Show All*****");
		lst.stream().forEach((n) -> {System.out.print(n+" ");}); 
		//1.convert collection ---> Stream //2.use terminal operation
		
		System.out.println("\n\n*****Show All Even*****");
		lst.stream().filter((n) -> n%2==0).forEach((n) -> System.out.print(n+" "));
		//1.convert collection ---> Stream //2.Intermediate operation //3.use terminal operation
		
	}

}
