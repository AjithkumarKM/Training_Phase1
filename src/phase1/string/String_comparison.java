package phase1.string;

public class String_comparison {

	public static void main(String args[]){
		String t = "Delhi";
		String o = "Mumbai";
		String k = "delhi";
		String y = new String("Mumbai");
		String l = new String("delhi");
		String p = new String("Hello");
		
		System.out.println("String pool -> 4 strings");
		System.out.println("String pool -> 3 strings");
		
		System.out.println("\no with l => Equals : " + o.equals(l));
		System.out.println("== : " + (o==l));

		System.out.println("\ny with p => Equals : " + y.equals(p));
		System.out.println("== : " + (y==p));
		
		System.out.println("\nt with o => Equals : " + t.equals(o));
		System.out.println("== : " + (t==o));

		System.out.println("\nk with y => Equals : " + k.equals(y));
		System.out.println("== : " + (k==y));
		
		System.out.println("\np with y => Equals : " + p.equals(y));
		System.out.println("== : " + (p==y));
		
		System.out.println("\nk with l => Equals : " + k.equals(l));
		System.out.println("== : " + (k==l));
		

	}
}
