package abstractShape;
import java.util.Scanner;
public class TestShape {

	public static void main(String[] args) {
		
		Shape[] shapes = new Shape[10];
		Scanner sc =  new Scanner(System.in);
		int index=0;
		while(true) {
			System.out.println("\n\n***MeNU***\n1)All shapes\n2)Add Shape\n3)Area of shape\n4)Delete Shape\n5)Exit");
			System.out.println("\nChoice: ");
			int ch=sc.nextInt();
			if (ch==5) {
				System.out.println("\nExiting...");
				break;
			}
			switch (ch) {
			case 1:
				for (Shape i : shapes) {
					if(i!=null) {
						if(i instanceof Square) {
							Square a = (Square) i;
							a.display();
						}
						else if(i instanceof Rectangle) {
							Rectangle a = (Rectangle) i;
							a.display();
						}
						else if(i instanceof Circle) {
							Circle a = (Circle) i;
							a.display();
						}
						else if(i instanceof Triangle) {
							Triangle a = (Triangle) i;
							a.display();
						}
					
					}
					else System.out.print("NoShape ");
				}
				break;
			case 2:
				System.out.println("\n1)Square\n2)Rectangle\n3)Circle\n4)Triangle\n\nChoose Shape: ");
				int shape = sc.nextInt();
				if (index<shapes.length) {
				if (shape==1) {
					System.out.println("Enter Side: ");
					shapes[index] = new Square(sc.nextInt());
					index++;
				}
				else if (shape==2) {
					System.out.println("Enter Length & Width: ");
					shapes[index] = new Rectangle(sc.nextInt(),sc.nextInt());
					index++;
				}
				else if (shape==3) {
					System.out.println("Enter Radius: ");
					shapes[index] = new Circle(sc.nextInt());
					index++;
				}
				else if (shape==4) {
					System.out.println("Enter Base & Height: ");
					shapes[index] = new Triangle(sc.nextInt(),sc.nextInt());
					index++;
				}
				else System.out.println("\nWrong Input\n");
				}
				else System.out.println("\nShapes Full...");
				
				break;
			case 3:
				for (Shape i : shapes) {
					if(i!=null) {
						if(i instanceof Square) {
							Square a = (Square) i;
							a.area();
						}
						else if(i instanceof Rectangle) {
							Rectangle a = (Rectangle) i;
							a.area();
						}
						else if(i instanceof Circle) {
							Circle a = (Circle) i;
							a.area();
						}
						else if(i instanceof Triangle) {
							Triangle a = (Triangle) i;
							a.area();
						}
					}
					else System.out.println("NoShape ");
				}
				break;
			case 4:
				System.out.println("Enter location to delete: ");
				int i = sc.nextInt();
				if (i<shapes.length) {
					shapes[i]=null;
					System.out.println("Shape Deleted...");
				}
				break;
			default:
				System.out.println("\nInvalid Input...\n");
			}
		}sc.close();
	}
}
