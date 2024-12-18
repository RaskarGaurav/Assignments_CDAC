package serializeDeserialize;

import java.io.*;
import java.util.Scanner;

public abstract class Test_Book {

	public static void main(String[] args) {
		/*
		Book bk1 = new Book(1234, "Comic");
		
		File fileObj = new File("Book.txt");
		
		
		try {
			BufferedWriter bw = new BufferedWriter(new FileWriter(fileObj));
			bw.write(bk1.getBookId()+" "+bk1.getName()); //Write as regular strings
			bw.close();
		} catch (IOException e) {
			
			System.out.println(e.getLocalizedMessage());
		}
		*/
		Scanner sc = new Scanner(System.in);
		File fileObj = new File("Book.txt");
		try {
			ObjectOutputStream output = new ObjectOutputStream(new FileOutputStream(fileObj));
			System.out.println("Enter bookId and name: ");
			Book bk1 = new Book(sc.nextInt(),sc.next());
			
			output.writeObject(bk1);//Write as Byte-Stream
			output.close();
			
		} catch (Exception e) {
			
			e.printStackTrace();
		} 
		sc.close();
		
		
	}

}
