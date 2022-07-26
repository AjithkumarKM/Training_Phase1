package phase1.modifiers.p1;

public class M {
	private int a = 50;
	long length = 2500;
	protected float pi = 3.14f;
	
	public void publicMethod(){
		System.out.println("Public method of class M");
		privateMethod();
		defaultMethod();
		protectedMethod();
	}
	private void privateMethod(){
		System.out.println("Private method of class M and values are ");
		System.out.println(a + " " + length + " " + pi);
		
	}
	void defaultMethod(){
		System.out.println("Default method of class M");
	}
	protected void protectedMethod(){
		System.out.println("Protected method of class M");
	}
	
}
