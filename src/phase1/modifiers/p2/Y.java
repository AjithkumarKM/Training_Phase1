package phase1.modifiers.p2;

import phase1.modifiers.p1.*;

public class Y extends N{

	public static void main(String args[]){
		new Y().publicMethod();
		new Y().protectedMethod();
		new M().publicMethod();
		
		new X().defaultMethod();
		System.out.println("l is : " + new X().l);
		System.out.println("f is : " + new X().f);
		System.out.println("c is : " + new X().c);
	}
}

