package inheritance_Example;
//ParentClass/SuperClass/BaseClass
public class ChildClass extends ParentClass {
	private int cId;
	private String ch1Name;
	
	public ChildClass(int id, String name, int parentClassVariable, int cId, String ch1Name) {
		super(id, name, parentClassVariable);// "super()";Should be on First line to invoke 
		                                     // Parameterized Constructor of "Immediate Parent Class".
		this.cId = cId;
		this.ch1Name = ch1Name;
		System.out.println("ChildClass Contr (Parameter)");
	}

	public ChildClass() {
		System.out.println("ChildClass Contr (Default)");
	}
	
	public void childDisplay() {
		System.out.println("ChildClass Details------------");
		System.out.println(cId+" "+ch1Name);
	}
	
}
