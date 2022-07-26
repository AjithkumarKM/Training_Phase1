package phase1.modifiers.p1;

public class P {

	public static void main(String args[]){
		new M().publicMethod();
		new N().publicMethod();

	}
	
	public void publicMethod(){
		System.out.println("Public method of class P");
		privateMethod();
		defaultMethod();
		protectedMethod();
	}
	private void privateMethod(){
		System.out.println("Private method of class P");
	}
	void defaultMethod(){
		System.out.println("Default method of class P");
	}
	protected void protectedMethod(){
		System.out.println("Protected method of class P");
	}
}
