package inheritance_Example;
//
public class ParentClass {
	private int id;
	private String name;
	private int parentClassVariable;
	
	public ParentClass(int id, String name, int parentClassVariable) {//ParentClass Constr (Parameter)
		System.out.println("ParentClass Constr (Parameter)");
		this.id = id;
		this.name = name;
		this.parentClassVariable = parentClassVariable;
	}

	public ParentClass() {//ParentClass Constr (Default)
		System.out.println("ParentClass Constr (Default)");
	}
	
	public void parentDisplay() {
		System.out.println("ParentClass Details----------");
		System.out.println(id+" "+name+" "+parentClassVariable);
	}
	
}
