package phase1.modifiers.p2;

import phase1.modifiers.p1.*;

public class Z extends M{

	public static void main(String agrs[]){
		new Z().publicMethod();
		new Z().protectedMethod();
		new N().publicMethod();
		new P().publicMethod();
		
		//calling variables of class X
		new X().defaultMethod();
		System.out.println("l is : " + new X().l);
		System.out.println("f is : " + new X().f);
		System.out.println("c is : " + new X().c);
		
	}
}