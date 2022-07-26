package phase1.modifiers.p1;

public class N {
	protected long l = 3500;
	public int i = 52;
	double d = 7.21;
	
	public void publicMethod(){
		System.out.println("Public method of class N");
		privateMethod();
		defaultMethod();
		protectedMethod();
	}
	private void privateMethod(){
		System.out.println("Private method of class N and values are ");
		System.out.println(l + " " + i + " " + d);
	}
	void defaultMethod(){
		System.out.println("Default method of class N");
	}
	protected void protectedMethod(){
		System.out.println("Protected method of class N");
	}
}
