package file_IO;
import java.io.*;
import java.util.Scanner;

public class Test_FileIO {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("\n1)create file\n2)Details3)Read File\n4)Write File\n5)Exit");
		String fname;
		File fObj=null;
		try {
			int ch;
			do {
				System.out.println("Enter Choice: ");
				ch = sc.nextInt();
				switch(ch) {
				case 1:
					System.out.println("Enter file name: ");
					fname = sc.next();
					fObj = new File(fname);
						if (fObj.exists()) System.out.println("\nAlready exists...");
						else {
							fObj.createNewFile();
							System.out.println("\nFile Created...");
						}
						break;
				case 2:
					System.out.println("Read: "+fObj.canRead());
					System.out.println("Write: "+fObj.canWrite());
					System.out.println("Path: "+fObj.getPath());
					break;
				case 3:
					BufferedReader bf = new BufferedReader(new FileReader(fObj));
					
					String line=null;
					while((line=bf.readLine())!=null) {
						System.out.println(line+"\n");
					}
					bf.close();
					break;
				case 4:
					BufferedWriter bw = new BufferedWriter(new FileWriter(fObj));
					System.out.println("\nEnter What to Write: ");
					
					String input = sc.nextLine();
				
					bw.write(input);
					bw.close();
					System.out.println("\n\nFile Written Successfully...");
					break;
				case 5:
					System.out.println("\nExiting...");
					break;
				default:
					System.out.println("\nInvalid Input...");
				}//switch
			}while(ch!=5);
			
			sc.close();
			
		}catch(Exception e) {
			System.err.println("\n\nSomething went Wrong...");
		}
	}
}

