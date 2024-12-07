package inheritance_Example;

public class Test_Inheritance {

	public static void main(String[] args) {
		
		//ParentClass pObj = new ParentClass();
		//pObj.parentDisplay();//Object of one class can only access methods of same class if no relationship other class.
		
		ChildClass cObj1 = new ChildClass();
		cObj1.childDisplay();
		cObj1.parentDisplay();
		
		ChildClass cObj2 = new ChildClass(111,"Parent1",12345,1,"Child1");
		cObj2.childDisplay();
		cObj2.parentDisplay();
	}
	
}
