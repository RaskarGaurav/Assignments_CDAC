package fuctionalInterface;
import java.util.function.*;
public class InBuiltFuctionalInterfaces {

	public static void main(String[] args) {
		
		Consumer<Integer> cObj = (n) -> {System.out.println(n);};
		cObj.accept(15);
		
		
	}

}
