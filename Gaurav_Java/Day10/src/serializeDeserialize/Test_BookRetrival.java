package serializeDeserialize;
import java.io.*;
public class Test_BookRetrival {

	public static void main(String[] args) {
		File fileObj = new File("Book.txt");
		
		//read data from file
		//byte data
		
		try {
			ObjectInputStream read = new ObjectInputStream(new FileInputStream(fileObj));
			
			Book bk = (Book) read.readObject(); //DownCasting
			
			read.close();
			System.out.println("*****Data Retrived******");
			System.out.println(bk.getName());//Successfully Deserialize
			System.out.println(bk.getBookId()); // Retrieving "Transient" Variable (Cannot get serialize)
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}

}
